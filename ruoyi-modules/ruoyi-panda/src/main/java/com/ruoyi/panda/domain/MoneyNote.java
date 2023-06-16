package com.ruoyi.panda.domain;

import java.util.List;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 熊猫记账对象 money_note
 * 
 * @author Liu Jian
 * @date 2023-06-13
 */
public class MoneyNote extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Long id;

    /** 金额 */
    @Excel(name = "金额")
    private Long amount;

    /** 分类 */
    @Excel(name = "分类")
    private Long category;

    /** 消费时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+9")
    @Excel(name = "消费时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date custTime;

    /** 支付方式 */
    @Excel(name = "支付方式")
    private Long payType;

    /** 支出、收入 */
    @Excel(name = "支出、收入")
    private Long inOut;

    /** 图片信息 */
    private List<Image> imageList;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setAmount(Long amount) 
    {
        this.amount = amount;
    }

    public Long getAmount() 
    {
        return amount;
    }
    public void setCategory(Long category) 
    {
        this.category = category;
    }

    public Long getCategory() 
    {
        return category;
    }
    public void setCustTime(Date custTime) 
    {
        this.custTime = custTime;
    }

    public Date getCustTime() 
    {
        return custTime;
    }
    public void setPayType(Long payType) 
    {
        this.payType = payType;
    }

    public Long getPayType() 
    {
        return payType;
    }
    public void setInOut(Long inOut) 
    {
        this.inOut = inOut;
    }

    public Long getInOut() 
    {
        return inOut;
    }

    public List<Image> getImageList()
    {
        return imageList;
    }

    public void setImageList(List<Image> imageList)
    {
        this.imageList = imageList;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("amount", getAmount())
            .append("category", getCategory())
            .append("custTime", getCustTime())
            .append("payType", getPayType())
            .append("inOut", getInOut())
            .append("remark", getRemark())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("imageList", getImageList())
            .toString();
    }
}
