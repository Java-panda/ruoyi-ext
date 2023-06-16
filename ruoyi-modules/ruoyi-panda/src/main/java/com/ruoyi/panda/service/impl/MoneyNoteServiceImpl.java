package com.ruoyi.panda.service.impl;

import java.util.List;
import com.ruoyi.common.core.utils.DateUtils;
import com.ruoyi.common.security.utils.SecurityUtils;
import com.ruoyi.panda.constant.ImageTableType;
import com.ruoyi.panda.vo.MoneyNoteStatVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import com.ruoyi.common.core.utils.StringUtils;
import org.springframework.transaction.annotation.Transactional;
import com.ruoyi.panda.domain.Image;
import com.ruoyi.panda.mapper.MoneyNoteMapper;
import com.ruoyi.panda.domain.MoneyNote;
import com.ruoyi.panda.service.IMoneyNoteService;

/**
 * 熊猫记账Service业务层处理
 * 
 * @author Liu Jian
 * @date 2023-06-13
 */
@Service
public class MoneyNoteServiceImpl implements IMoneyNoteService 
{
    @Autowired
    private MoneyNoteMapper moneyNoteMapper;

    /**
     * 统计支出
     * @return 统计结果
     */
    @Override
    public MoneyNoteStatVO getMoneyNoteStat() {
        return moneyNoteMapper.getMoneyNoteStat();
    }

    /**
     * 查询熊猫记账
     * 
     * @param id 熊猫记账主键
     * @return 熊猫记账
     */
    @Override
    public MoneyNote selectMoneyNoteById(Long id)
    {
        return moneyNoteMapper.selectMoneyNoteById(id);
    }

    /**
     * 查询熊猫记账列表
     * 
     * @param moneyNote 熊猫记账
     * @return 熊猫记账
     */
    @Override
    public List<MoneyNote> selectMoneyNoteList(MoneyNote moneyNote)
    {
        return moneyNoteMapper.selectMoneyNoteList(moneyNote);
    }

    /**
     * 新增熊猫记账
     * 
     * @param moneyNote 熊猫记账
     * @return 结果
     */
    @Transactional
    @Override
    public int insertMoneyNote(MoneyNote moneyNote)
    {
        moneyNote.setCreateTime(DateUtils.getNowDate());
        moneyNote.setCreateBy(String.valueOf(SecurityUtils.getUserId()));
        int rows = moneyNoteMapper.insertMoneyNote(moneyNote);
        insertImage(moneyNote);
        return rows;
    }

    /**
     * 修改熊猫记账
     * 
     * @param moneyNote 熊猫记账
     * @return 结果
     */
    @Transactional
    @Override
    public int updateMoneyNote(MoneyNote moneyNote)
    {
        moneyNote.setUpdateTime(DateUtils.getNowDate());
        moneyNote.setUpdateBy(String.valueOf(SecurityUtils.getUserId()));
        moneyNoteMapper.deleteImageByParentId(moneyNote.getId());
        insertImage(moneyNote);
        return moneyNoteMapper.updateMoneyNote(moneyNote);
    }

    /**
     * 批量删除熊猫记账
     * 
     * @param ids 需要删除的熊猫记账主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteMoneyNoteByIds(Long[] ids)
    {
        moneyNoteMapper.deleteImageByParentIds(ids);
        return moneyNoteMapper.deleteMoneyNoteByIds(ids);
    }

    /**
     * 删除熊猫记账信息
     * 
     * @param id 熊猫记账主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteMoneyNoteById(Long id)
    {
        moneyNoteMapper.deleteImageByParentId(id);
        return moneyNoteMapper.deleteMoneyNoteById(id);
    }

    /**
     * 新增图片信息
     * 
     * @param moneyNote 熊猫记账对象
     */
    public void insertImage(MoneyNote moneyNote)
    {
        List<Image> imageList = moneyNote.getImageList();
        Long id = moneyNote.getId();
        if (StringUtils.isNotNull(imageList))
        {
            List<Image> list = new ArrayList<Image>();
            for (Image image : imageList)
            {
                image.setParentId(id);
                image.setParentType(ImageTableType.MONEYNOTE.getValue());
                list.add(image);
            }
            if (list.size() > 0)
            {
                moneyNoteMapper.batchImage(list);
            }
        }
    }
}
