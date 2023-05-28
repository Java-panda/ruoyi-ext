package com.ruoyi.panda.controller;

import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.web.page.TableDataInfo;
import com.ruoyi.common.log.annotation.Log;
import com.ruoyi.common.log.enums.BusinessType;
import com.ruoyi.common.security.annotation.RequiresPermissions;
import com.ruoyi.panda.domain.Course;
import com.ruoyi.panda.mapper.SQL50Mapper;
import com.ruoyi.panda.service.ICourseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * SQL50 Controller
 * 
 * @author Liu Jian
 * @date 2023-05-28
 */
@RestController
@RequestMapping("/sql50")
@Api(value = "/sql50", description = "sql练习50题")
public class SQL50Controller extends BaseController
{
    @Autowired
    private ICourseService courseService;

    @Autowired
    private SQL50Mapper mapper;
    /**
     * 1.查询" 01 “课程比” 02 "课程成绩高的学生的信息及课程分数
     */
    @ApiOperation(value = "/sql01" , notes = "1.查询\" 01 “课程比” 02 \"课程成绩高的学生的信息及课程分数")
    @GetMapping(value = "/sql01")
    public AjaxResult sql01()
    {
        return success(mapper.sql01());
    }

}
