package com.ruoyi.panda.controller;

import java.util.List;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.log.annotation.Log;
import com.ruoyi.common.log.enums.BusinessType;
import com.ruoyi.common.security.annotation.RequiresPermissions;
import com.ruoyi.panda.domain.WebLink;
import com.ruoyi.panda.service.IWebLinkService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * 网页链接Controller
 * 
 * @author Liu Jian
 * @date 2023-05-28
 */
@RestController
@RequestMapping("/link")
public class WebLinkController extends BaseController
{
    @Autowired
    private IWebLinkService webLinkService;

    /**
     * 查询网页链接列表
     */
    @RequiresPermissions("panda:link:list")
    @GetMapping("/list")
    public TableDataInfo list(WebLink webLink)
    {
        startPage();
        List<WebLink> list = webLinkService.selectWebLinkList(webLink);
        return getDataTable(list);
    }

    /**
     * 导出网页链接列表
     */
    @RequiresPermissions("panda:link:export")
    @Log(title = "网页链接", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, WebLink webLink)
    {
        List<WebLink> list = webLinkService.selectWebLinkList(webLink);
        ExcelUtil<WebLink> util = new ExcelUtil<WebLink>(WebLink.class);
        util.exportExcel(response, list, "网页链接数据");
    }

    /**
     * 获取网页链接详细信息
     */
    @RequiresPermissions("panda:link:query")
    @GetMapping(value = "/{siteId}")
    public AjaxResult getInfo(@PathVariable("siteId") Long siteId)
    {
        return success(webLinkService.selectWebLinkBySiteId(siteId));
    }

    /**
     * 新增网页链接
     */
    @RequiresPermissions("panda:link:add")
    @Log(title = "网页链接", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody WebLink webLink)
    {
        return toAjax(webLinkService.insertWebLink(webLink));
    }

    /**
     * 修改网页链接
     */
    @RequiresPermissions("panda:link:edit")
    @Log(title = "网页链接", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody WebLink webLink)
    {
        return toAjax(webLinkService.updateWebLink(webLink));
    }

    /**
     * 删除网页链接
     */
    @RequiresPermissions("panda:link:remove")
    @Log(title = "网页链接", businessType = BusinessType.DELETE)
	@DeleteMapping("/{siteIds}")
    public AjaxResult remove(@PathVariable Long[] siteIds)
    {
        return toAjax(webLinkService.deleteWebLinkBySiteIds(siteIds));
    }
}
