package com.ruoyi.gen.study;

import com.ruoyi.common.core.constant.Constants;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;

import java.io.StringWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 配置资源加载器
        Properties prop = new Properties();
        prop.setProperty(RuntimeConstants.RESOURCE_LOADER, "classpath");
        prop.setProperty("classpath.resource.loader.class", ClasspathResourceLoader.class.getName());

        // 初始化引擎
        Velocity.init(prop);

        // 准备数据
        VelocityContext context = new VelocityContext();
        context.put("packageName","panda");
        context.put("gender","人");
        List<User> users= new ArrayList<>();
        users.add(new User("A",11,"男人"));
        users.add(new User("B",12,"女人"));
        users.add(new User("C",13,"null"));
        context.put("users",users);

        // 获取模板
        Template tpl = Velocity.getTemplate("vm/test.java.vm", Constants.UTF8);

        // 合并模板
        StringWriter sw = new StringWriter();
        tpl.merge(context, sw);

        System.out.println(sw.toString());
    }
}
