package com.ruoyi.panda.service;

import java.util.List;
import com.ruoyi.panda.domain.WebLink;

/**
 * 网页链接Service接口
 * 
 * @author Liu Jian
 * @date 2023-05-28
 */
public interface IWebLinkService 
{
    /**
     * 查询网页链接
     * 
     * @param siteId 网页链接主键
     * @return 网页链接
     */
    public WebLink selectWebLinkBySiteId(Long siteId);

    /**
     * 查询网页链接列表
     * 
     * @param webLink 网页链接
     * @return 网页链接集合
     */
    public List<WebLink> selectWebLinkList(WebLink webLink);

    /**
     * 新增网页链接
     * 
     * @param webLink 网页链接
     * @return 结果
     */
    public int insertWebLink(WebLink webLink);

    /**
     * 修改网页链接
     * 
     * @param webLink 网页链接
     * @return 结果
     */
    public int updateWebLink(WebLink webLink);

    /**
     * 批量删除网页链接
     * 
     * @param siteIds 需要删除的网页链接主键集合
     * @return 结果
     */
    public int deleteWebLinkBySiteIds(Long[] siteIds);

    /**
     * 删除网页链接信息
     * 
     * @param siteId 网页链接主键
     * @return 结果
     */
    public int deleteWebLinkBySiteId(Long siteId);
}
