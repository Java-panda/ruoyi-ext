package com.ruoyi.panda.controller;

import java.util.List;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.common.core.domain.R;
import com.ruoyi.panda.vo.MoneyNoteStatVO;
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
import com.ruoyi.panda.domain.MoneyNote;
import com.ruoyi.panda.service.IMoneyNoteService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * 熊猫记账Controller
 * 
 * @author Liu Jian
 * @date 2023-06-13
 */
@RestController
@RequestMapping("/moneynote")
public class MoneyNoteController extends BaseController
{
    @Autowired
    private IMoneyNoteService moneyNoteService;

    /**
     * 统计信息
     */
    @GetMapping("/getMoneyNoteStat")
    public R getMoneyNoteStat()
    {
        MoneyNoteStatVO moneyNoteStat = moneyNoteService.getMoneyNoteStat();
        return R.ok(moneyNoteStat);
    }

    /**
     * 查询熊猫记账列表
     */
    @RequiresPermissions("panda:moneynote:list")
    @GetMapping("/list")
    public TableDataInfo list(MoneyNote moneyNote)
    {
        startPage();
        List<MoneyNote> list = moneyNoteService.selectMoneyNoteList(moneyNote);
        return getDataTable(list);
    }

    /**
     * 导出熊猫记账列表
     */
    @RequiresPermissions("panda:moneynote:export")
    @Log(title = "熊猫记账", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, MoneyNote moneyNote)
    {
        List<MoneyNote> list = moneyNoteService.selectMoneyNoteList(moneyNote);
        ExcelUtil<MoneyNote> util = new ExcelUtil<MoneyNote>(MoneyNote.class);
        util.exportExcel(response, list, "熊猫记账数据");
    }

    /**
     * 获取熊猫记账详细信息
     */
    @RequiresPermissions("panda:moneynote:query")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(moneyNoteService.selectMoneyNoteById(id));
    }

    /**
     * 新增熊猫记账
     */
    @RequiresPermissions("panda:moneynote:add")
    @Log(title = "熊猫记账", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody MoneyNote moneyNote)
    {
        return toAjax(moneyNoteService.insertMoneyNote(moneyNote));
    }

    /**
     * 修改熊猫记账
     */
    @RequiresPermissions("panda:moneynote:edit")
    @Log(title = "熊猫记账", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody MoneyNote moneyNote)
    {
        return toAjax(moneyNoteService.updateMoneyNote(moneyNote));
    }

    /**
     * 删除熊猫记账
     */
    @RequiresPermissions("panda:moneynote:remove")
    @Log(title = "熊猫记账", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(moneyNoteService.deleteMoneyNoteByIds(ids));
    }
}
