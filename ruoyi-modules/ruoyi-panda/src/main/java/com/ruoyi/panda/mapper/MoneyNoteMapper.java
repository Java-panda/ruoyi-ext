package com.ruoyi.panda.mapper;

import java.util.List;
import com.ruoyi.panda.domain.MoneyNote;
import com.ruoyi.panda.domain.Image;
import com.ruoyi.panda.vo.MoneyNoteStatVO;

/**
 * 熊猫记账Mapper接口
 * 
 * @author Liu Jian
 * @date 2023-06-13
 */
public interface MoneyNoteMapper
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
     * 删除熊猫记账
     * 
     * @param id 熊猫记账主键
     * @return 结果
     */
    public int deleteMoneyNoteById(Long id);

    /**
     * 批量删除熊猫记账
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteMoneyNoteByIds(Long[] ids);

    /**
     * 批量删除图片
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteImageByParentIds(Long[] ids);
    
    /**
     * 批量新增图片
     * 
     * @param imageList 图片列表
     * @return 结果
     */
    public int batchImage(List<Image> imageList);
    

    /**
     * 通过熊猫记账主键删除图片信息
     * 
     * @param id 熊猫记账ID
     * @return 结果
     */
    public int deleteImageByParentId(Long id);
}
