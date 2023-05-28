package com.ruoyi.panda.service.impl;

import java.util.List;
import com.ruoyi.common.core.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.panda.mapper.WebLinkMapper;
import com.ruoyi.panda.domain.WebLink;
import com.ruoyi.panda.service.IWebLinkService;

/**
 * 网页链接Service业务层处理
 * 
 * @author Liu Jian
 * @date 2023-05-28
 */
@Service
public class WebLinkServiceImpl implements IWebLinkService 
{
    @Autowired
    private WebLinkMapper webLinkMapper;

    /**
     * 查询网页链接
     * 
     * @param siteId 网页链接主键
     * @return 网页链接
     */
    @Override
    public WebLink selectWebLinkBySiteId(Long siteId)
    {
        return webLinkMapper.selectWebLinkBySiteId(siteId);
    }

    /**
     * 查询网页链接列表
     * 
     * @param webLink 网页链接
     * @return 网页链接
     */
    @Override
    public List<WebLink> selectWebLinkList(WebLink webLink)
    {
        return webLinkMapper.selectWebLinkList(webLink);
    }

    /**
     * 新增网页链接
     * 
     * @param webLink 网页链接
     * @return 结果
     */
    @Override
    public int insertWebLink(WebLink webLink)
    {
        webLink.setCreateTime(DateUtils.getNowDate());
        return webLinkMapper.insertWebLink(webLink);
    }

    /**
     * 修改网页链接
     * 
     * @param webLink 网页链接
     * @return 结果
     */
    @Override
    public int updateWebLink(WebLink webLink)
    {
        webLink.setUpdateTime(DateUtils.getNowDate());
        return webLinkMapper.updateWebLink(webLink);
    }

    /**
     * 批量删除网页链接
     * 
     * @param siteIds 需要删除的网页链接主键
     * @return 结果
     */
    @Override
    public int deleteWebLinkBySiteIds(Long[] siteIds)
    {
        return webLinkMapper.deleteWebLinkBySiteIds(siteIds);
    }

    /**
     * 删除网页链接信息
     * 
     * @param siteId 网页链接主键
     * @return 结果
     */
    @Override
    public int deleteWebLinkBySiteId(Long siteId)
    {
        return webLinkMapper.deleteWebLinkBySiteId(siteId);
    }
}
