package com.ruoyi.job.task;

import com.ruoyi.common.core.utils.StringUtils;
import org.springframework.stereotype.Component;

/**
 * 定时任务调度测试
 * 
 * @author ruoyi
 */
@Component("panda")
public class PandaTask
{
    public void panda1(String params)
    {
        System.out.println("panda1");
    }

    public void panda2()
    {
        System.out.println("panda2");
    }
}
