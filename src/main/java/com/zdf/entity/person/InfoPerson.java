package com.zdf.entity.person;

import java.util.Date;

import com.zdf.entity.base.BaseEntity;

public class InfoPerson extends BaseEntity{

    private Long code;

    private String personType;

    private String name;

    private String foreignName;

    private String sex;

    private String nation;

    private Date birthday;

    private String eduLevel;

    private String political;

    private String height;

    private String mariaType;

    private String mariaRemark;

    private String resiInThisCity;

    private String resiType;

    private String resiLocType;

    private String resiProvince;

    private String resiCity;

    private String resiCounty;

    private String resiAddr;

    private String homeland;

    private String nativePlace;

    private String onlyOnechildFlag;

    private Date comeDate;

    private String industry;

    private String occupation;

    private String postTitle;

    private String healthType;

    private String tel1;

    private String tel2;

    private String tel3;

    private String eduInThisCity;

    private Long createBy;

    private Date createDate;

    private Long updateBy;

    private Date updateDate;

    private String delFlag;

    private String remarks;

    private String address;

    private String workUnit;

    private String incomeSource;

    private String age;

    private String uname;

    private String haveLivecred;

    private String busiType;

    private String busiDataId;

    private String credType;

    private String credNum;

    private String credImage;

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getPersonType() {
        return personType;
    }

    public void setPersonType(String personType) {
        this.personType = personType == null ? null : personType.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getForeignName() {
        return foreignName;
    }

    public void setForeignName(String foreignName) {
        this.foreignName = foreignName == null ? null : foreignName.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getEduLevel() {
        return eduLevel;
    }

    public void setEduLevel(String eduLevel) {
        this.eduLevel = eduLevel == null ? null : eduLevel.trim();
    }

    public String getPolitical() {
        return political;
    }

    public void setPolitical(String political) {
        this.political = political == null ? null : political.trim();
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height == null ? null : height.trim();
    }

    public String getMariaType() {
        return mariaType;
    }

    public void setMariaType(String mariaType) {
        this.mariaType = mariaType == null ? null : mariaType.trim();
    }

    public String getMariaRemark() {
        return mariaRemark;
    }

    public void setMariaRemark(String mariaRemark) {
        this.mariaRemark = mariaRemark == null ? null : mariaRemark.trim();
    }

    public String getResiInThisCity() {
        return resiInThisCity;
    }

    public void setResiInThisCity(String resiInThisCity) {
        this.resiInThisCity = resiInThisCity == null ? null : resiInThisCity.trim();
    }

    public String getResiType() {
        return resiType;
    }

    public void setResiType(String resiType) {
        this.resiType = resiType == null ? null : resiType.trim();
    }

    public String getResiLocType() {
        return resiLocType;
    }

    public void setResiLocType(String resiLocType) {
        this.resiLocType = resiLocType == null ? null : resiLocType.trim();
    }

    public String getResiProvince() {
        return resiProvince;
    }

    public void setResiProvince(String resiProvince) {
        this.resiProvince = resiProvince == null ? null : resiProvince.trim();
    }

    public String getResiCity() {
        return resiCity;
    }

    public void setResiCity(String resiCity) {
        this.resiCity = resiCity == null ? null : resiCity.trim();
    }

    public String getResiCounty() {
        return resiCounty;
    }

    public void setResiCounty(String resiCounty) {
        this.resiCounty = resiCounty == null ? null : resiCounty.trim();
    }

    public String getResiAddr() {
        return resiAddr;
    }

    public void setResiAddr(String resiAddr) {
        this.resiAddr = resiAddr == null ? null : resiAddr.trim();
    }

    public String getHomeland() {
        return homeland;
    }

    public void setHomeland(String homeland) {
        this.homeland = homeland == null ? null : homeland.trim();
    }

    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace == null ? null : nativePlace.trim();
    }

    public String getOnlyOnechildFlag() {
        return onlyOnechildFlag;
    }

    public void setOnlyOnechildFlag(String onlyOnechildFlag) {
        this.onlyOnechildFlag = onlyOnechildFlag == null ? null : onlyOnechildFlag.trim();
    }

    public Date getComeDate() {
        return comeDate;
    }

    public void setComeDate(Date comeDate) {
        this.comeDate = comeDate;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry == null ? null : industry.trim();
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation == null ? null : occupation.trim();
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle == null ? null : postTitle.trim();
    }

    public String getHealthType() {
        return healthType;
    }

    public void setHealthType(String healthType) {
        this.healthType = healthType == null ? null : healthType.trim();
    }

    public String getTel1() {
        return tel1;
    }

    public void setTel1(String tel1) {
        this.tel1 = tel1 == null ? null : tel1.trim();
    }

    public String getTel2() {
        return tel2;
    }

    public void setTel2(String tel2) {
        this.tel2 = tel2 == null ? null : tel2.trim();
    }

    public String getTel3() {
        return tel3;
    }

    public void setTel3(String tel3) {
        this.tel3 = tel3 == null ? null : tel3.trim();
    }

    public String getEduInThisCity() {
        return eduInThisCity;
    }

    public void setEduInThisCity(String eduInThisCity) {
        this.eduInThisCity = eduInThisCity == null ? null : eduInThisCity.trim();
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getWorkUnit() {
        return workUnit;
    }

    public void setWorkUnit(String workUnit) {
        this.workUnit = workUnit == null ? null : workUnit.trim();
    }

    public String getIncomeSource() {
        return incomeSource;
    }

    public void setIncomeSource(String incomeSource) {
        this.incomeSource = incomeSource == null ? null : incomeSource.trim();
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age == null ? null : age.trim();
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    public String getHaveLivecred() {
        return haveLivecred;
    }

    public void setHaveLivecred(String haveLivecred) {
        this.haveLivecred = haveLivecred == null ? null : haveLivecred.trim();
    }

    public String getBusiType() {
        return busiType;
    }

    public void setBusiType(String busiType) {
        this.busiType = busiType == null ? null : busiType.trim();
    }

    public String getBusiDataId() {
        return busiDataId;
    }

    public void setBusiDataId(String busiDataId) {
        this.busiDataId = busiDataId == null ? null : busiDataId.trim();
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

    public String getCredImage() {
        return credImage;
    }

    public void setCredImage(String credImage) {
        this.credImage = credImage == null ? null : credImage.trim();
    }
}