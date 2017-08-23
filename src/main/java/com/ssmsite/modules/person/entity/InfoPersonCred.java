package com.ssmsite.modules.person.entity;

import java.util.Date;

import com.ssmsite.common.entity.BaseEntity;

public class InfoPersonCred  extends BaseEntity{

    private Long personId;

    private String credType;

    private String credNum;

    private String credImg;

    private String name;

    private Date brithdate;

    private String address;

    private String government;

    private String areacode;

    private Date validitySdate;

    private Date validityEdate;

    private Long createBy;

    private Date createDate;

    private Long updateBy;

    private Date updateDate;

    private String delFlag;

    private String remarks;

    private String faceimg;

    private String versoimg;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public String getCredType() {
        return credType;
    }

    public void setCredType(String credType) {
        this.credType = credType == null ? null : credType.trim();
    }

    public String getCredNum() {
        return credNum;
    }

    public void setCredNum(String credNum) {
        this.credNum = credNum == null ? null : credNum.trim();
    }

    public String getCredImg() {
        return credImg;
    }

    public void setCredImg(String credImg) {
        this.credImg = credImg == null ? null : credImg.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getBrithdate() {
        return brithdate;
    }

    public void setBrithdate(Date brithdate) {
        this.brithdate = brithdate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getGovernment() {
        return government;
    }

    public void setGovernment(String government) {
        this.government = government == null ? null : government.trim();
    }

    public String getAreacode() {
        return areacode;
    }

    public void setAreacode(String areacode) {
        this.areacode = areacode == null ? null : areacode.trim();
    }

    public Date getValiditySdate() {
        return validitySdate;
    }

    public void setValiditySdate(Date validitySdate) {
        this.validitySdate = validitySdate;
    }

    public Date getValidityEdate() {
        return validityEdate;
    }

    public void setValidityEdate(Date validityEdate) {
        this.validityEdate = validityEdate;
    }

    public Long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Long getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Long updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public String getFaceimg() {
        return faceimg;
    }

    public void setFaceimg(String faceimg) {
        this.faceimg = faceimg == null ? null : faceimg.trim();
    }

    public String getVersoimg() {
        return versoimg;
    }

    public void setVersoimg(String versoimg) {
        this.versoimg = versoimg == null ? null : versoimg.trim();
    }
}