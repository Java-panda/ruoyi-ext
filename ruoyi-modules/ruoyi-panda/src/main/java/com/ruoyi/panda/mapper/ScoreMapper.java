package com.ruoyi.panda.mapper;

import java.util.List;
import com.ruoyi.panda.domain.Score;

/**
 * 分数Mapper接口
 * 
 * @author Liu Jian
 * @date 2023-05-28
 */
public interface ScoreMapper 
{
    /**
     * 查询分数
     * 
     * @param studentId 分数主键
     * @return 分数
     */
    public Score selectScoreByStudentId(Long studentId);

    /**
     * 查询分数列表
     * 
     * @param score 分数
     * @return 分数集合
     */
    public List<Score> selectScoreList(Score score);

    /**
     * 新增分数
     * 
     * @param score 分数
     * @return 结果
     */
    public int insertScore(Score score);

    /**
     * 修改分数
     * 
     * @param score 分数
     * @return 结果
     */
    public int updateScore(Score score);

    /**
     * 删除分数
     * 
     * @param studentId 分数主键
     * @return 结果
     */
    public int deleteScoreByStudentId(Long studentId);

    /**
     * 批量删除分数
     * 
     * @param studentIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteScoreByStudentIds(Long[] studentIds);
}
