package com.ruoyi.panda.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.panda.mapper.ScoreMapper;
import com.ruoyi.panda.domain.Score;
import com.ruoyi.panda.service.IScoreService;

/**
 * 分数Service业务层处理
 * 
 * @author Liu Jian
 * @date 2023-05-28
 */
@Service
public class ScoreServiceImpl implements IScoreService 
{
    @Autowired
    private ScoreMapper scoreMapper;

    /**
     * 查询分数
     * 
     * @param studentId 分数主键
     * @return 分数
     */
    @Override
    public Score selectScoreByStudentId(Long studentId)
    {
        return scoreMapper.selectScoreByStudentId(studentId);
    }

    /**
     * 查询分数列表
     * 
     * @param score 分数
     * @return 分数
     */
    @Override
    public List<Score> selectScoreList(Score score)
    {
        return scoreMapper.selectScoreList(score);
    }

    /**
     * 新增分数
     * 
     * @param score 分数
     * @return 结果
     */
    @Override
    public int insertScore(Score score)
    {
        return scoreMapper.insertScore(score);
    }

    /**
     * 修改分数
     * 
     * @param score 分数
     * @return 结果
     */
    @Override
    public int updateScore(Score score)
    {
        return scoreMapper.updateScore(score);
    }

    /**
     * 批量删除分数
     * 
     * @param studentIds 需要删除的分数主键
     * @return 结果
     */
    @Override
    public int deleteScoreByStudentIds(Long[] studentIds)
    {
        return scoreMapper.deleteScoreByStudentIds(studentIds);
    }

    /**
     * 删除分数信息
     * 
     * @param studentId 分数主键
     * @return 结果
     */
    @Override
    public int deleteScoreByStudentId(Long studentId)
    {
        return scoreMapper.deleteScoreByStudentId(studentId);
    }
}
