package com.ruoyi.gen.study;

import org.apache.velocity.VelocityContext;

import java.util.Map;

public class DataLoader {
    public static void load(VelocityContext context, Map<String,Object> map){
        map.forEach((key,value)->{
            context.put(key,value);
        });
    }
}
