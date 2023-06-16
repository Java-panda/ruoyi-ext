package com.ruoyi.panda.service;

import java.util.List;
import com.ruoyi.panda.domain.MoneyNote;
import com.ruoyi.panda.vo.MoneyNoteStatVO;

/**
 * 熊猫记账Service接口
 * 
 * @author Liu Jian
 * @date 2023-06-13
 */
public interface IMoneyNoteService 
{

    /**
     * 统计支出
     * @return 统计结果
     */
    public MoneyNoteStatVO getMoneyNoteStat();

    /**
     * 查询熊猫记账
     * 
     * @param id 熊猫记账主键
     * @return 熊猫记账
     */
    public MoneyNote selectMoneyNoteById(Long id);

    /**
     * 查询熊猫记账列表
     * 
     * @param moneyNote 熊猫记账
     * @return 熊猫记账集合
     */
    public List<MoneyNote> selectMoneyNoteList(MoneyNote moneyNote);

    /**
     * 新增熊猫记账
     * 
     * @param moneyNote 熊猫记账
     * @return 结果
     */
    public int insertMoneyNote(MoneyNote moneyNote);

    /**
     * 修改熊猫记账
     * 
     * @param moneyNote 熊猫记账
     * @return 结果
     */
    public int updateMoneyNote(MoneyNote moneyNote);

    /**
     * 批量删除熊猫记账
     * 
     * @param ids 需要删除的熊猫记账主键集合
     * @return 结果
     */
    public int deleteMoneyNoteByIds(Long[] ids);

    /**
     * 删除熊猫记账信息
     * 
     * @param id 熊猫记账主键
     * @return 结果
     */
    public int deleteMoneyNoteById(Long id);
}
