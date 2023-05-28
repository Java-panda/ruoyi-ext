package com.ruoyi.panda.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 网页链接对象 web_link
 * 
 * @author Liu Jian
 * @date 2023-05-28
 */
public class WebLink extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 站点ID */
    @Excel(name = "站点ID")
    private Long siteId;

    /** 链接地址 */
    @Excel(name = "链接地址")
    private String link;

    /** 类型 */
    @Excel(name = "类型")
    private Long type;

    /** logo */
    @Excel(name = "logo")
    private String logo;

    /** 描述 */
    @Excel(name = "描述")
    private String description;

    /** 状态 */
    @Excel(name = "状态")
    private Integer status;

    public void setSiteId(Long siteId) 
    {
        this.siteId = siteId;
    }

    public Long getSiteId() 
    {
        return siteId;
    }
    public void setLink(String link) 
    {
        this.link = link;
    }

    public String getLink() 
    {
        return link;
    }
    public void setType(Long type) 
    {
        this.type = type;
    }

    public Long getType() 
    {
        return type;
    }
    public void setLogo(String logo) 
    {
        this.logo = logo;
    }

    public String getLogo() 
    {
        return logo;
    }
    public void setDescription(String description) 
    {
        this.description = description;
    }

    public String getDescription() 
    {
        return description;
    }
    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("siteId", getSiteId())
            .append("link", getLink())
            .append("type", getType())
            .append("logo", getLogo())
            .append("description", getDescription())
            .append("remark", getRemark())
            .append("status", getStatus())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("createBy", getCreateBy())
            .append("updateBy", getUpdateBy())
            .toString();
    }
}
