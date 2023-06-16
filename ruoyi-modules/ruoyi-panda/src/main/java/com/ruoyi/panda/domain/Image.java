package com.ruoyi.panda.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 图片对象 image
 * 
 * @author Liu Jian
 * @date 2023-06-13
 */
public class Image extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Long id;

    /** 图片目标分类 */
    @Excel(name = "图片目标分类")
    private String parentType;

    /** 图片父ID */
    @Excel(name = "图片父ID")
    private Long parentId;

    /** 图片路径 */
    @Excel(name = "图片路径")
    private String imageUrl;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setParentType(String parentType) 
    {
        this.parentType = parentType;
    }

    public String getParentType() 
    {
        return parentType;
    }
    public void setParentId(Long parentId) 
    {
        this.parentId = parentId;
    }

    public Long getParentId() 
    {
        return parentId;
    }
    public void setImageUrl(String imageUrl) 
    {
        this.imageUrl = imageUrl;
    }

    public String getImageUrl() 
    {
        return imageUrl;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("parentType", getParentType())
            .append("parentId", getParentId())
            .append("imageUrl", getImageUrl())
            .toString();
    }
}
