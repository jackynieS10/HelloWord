package com.jackynie.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;

/**
 * @author jackynie
 * @create 2022 - 01 - 06 - 17:04
 */
@TableName(value = "mobile_phone")
public class PhoneCall {

    @TableId(value = "phone_id",type = IdType.AUTO)
    private Integer phoneId;

    @TableField(value = "phone_name")
    private String phoneName;

    @TableField(value = "phone_type")
    private String phoneType;

    @TableField(value = "phone_brand")
    private String phoneBrand;

    @TableField(value = "phone_cpu")
    private String phoneCpu;

    @TableField(value = "phone_memory")
    private String phoneMemory;

    @TableField(value = "public_date")
    private Date publicDate;

    @TableField(exist = false)
    private String startDate;

    @TableField(exist = false)
    private String endDate;


    public Integer getPhoneId() {
        return phoneId;
    }

    public void setPhoneId(Integer phoneId) {
        this.phoneId = phoneId;
    }

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public String getPhoneType() {
        return phoneType;
    }

    public void setPhoneType(String phoneType) {
        this.phoneType = phoneType;
    }

    public String getPhoneBrand() {
        return phoneBrand;
    }

    public void setPhoneBrand(String phoneBrand) {
        this.phoneBrand = phoneBrand;
    }

    public String getPhoneCpu() {
        return phoneCpu;
    }

    public void setPhoneCpu(String phoneCpu) {
        this.phoneCpu = phoneCpu;
    }

    public String getPhoneMemory() {
        return phoneMemory;
    }

    public void setPhoneMemory(String phoneMemory) {
        this.phoneMemory = phoneMemory;
    }

    public Date getPublicDate() {
        return publicDate;
    }

    public void setPublicDate(Date publicDate) {
        this.publicDate = publicDate;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}
