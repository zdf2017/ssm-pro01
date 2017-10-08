package com.ssmsite.modules.building.entity;
import java.util.Date;

public class InfoSubjectRenthouse {
    private Long id;

    private Long code;

    private String jzNum;

    private String houseNum;

    private String rentCode;

    private Integer roomCnt;

    private Integer isSafeCivilized;

    private String selfArea;

    private String addr;

    private Integer hasMonitor;

    private Integer hasInsurance;

    private Long createBy;

    private Date createDate;

    private Long updateBy;

    private Date updateDate;

    private String delFlag;

    private String remarks;

    private String deptorgId;

    private String newClassCode;

    private Date newClassDate;

    private String preClassCode;

    private Date preCheckDate;

    private Date nextCheckDate;

    private Integer waterUsage;

    private Integer liveCount;

    private Long coverImageId;

    private String subjectType;

    private String code2d;

    private Integer levelNum;

    private Integer rentArea;

    private Date saveTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getJzNum() {
        return jzNum;
    }

    public void setJzNum(String jzNum) {
        this.jzNum = jzNum == null ? null : jzNum.trim();
    }

    public String getHouseNum() {
        return houseNum;
    }

    public void setHouseNum(String houseNum) {
        this.houseNum = houseNum == null ? null : houseNum.trim();
    }

    public String getRentCode() {
        return rentCode;
    }

    public void setRentCode(String rentCode) {
        this.rentCode = rentCode == null ? null : rentCode.trim();
    }

    public Integer getRoomCnt() {
        return roomCnt;
    }

    public void setRoomCnt(Integer roomCnt) {
        this.roomCnt = roomCnt;
    }

    public Integer getIsSafeCivilized() {
        return isSafeCivilized;
    }

    public void setIsSafeCivilized(Integer isSafeCivilized) {
        this.isSafeCivilized = isSafeCivilized;
    }

    public String getSelfArea() {
        return selfArea;
    }

    public void setSelfArea(String selfArea) {
        this.selfArea = selfArea == null ? null : selfArea.trim();
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr == null ? null : addr.trim();
    }

    public Integer getHasMonitor() {
        return hasMonitor;
    }

    public void setHasMonitor(Integer hasMonitor) {
        this.hasMonitor = hasMonitor;
    }

    public Integer getHasInsurance() {
        return hasInsurance;
    }

    public void setHasInsurance(Integer hasInsurance) {
        this.hasInsurance = hasInsurance;
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

    public String getDeptorgId() {
        return deptorgId;
    }

    public void setDeptorgId(String deptorgId) {
        this.deptorgId = deptorgId == null ? null : deptorgId.trim();
    }

    public String getNewClassCode() {
        return newClassCode;
    }

    public void setNewClassCode(String newClassCode) {
        this.newClassCode = newClassCode == null ? null : newClassCode.trim();
    }

    public Date getNewClassDate() {
        return newClassDate;
    }

    public void setNewClassDate(Date newClassDate) {
        this.newClassDate = newClassDate;
    }

    public String getPreClassCode() {
        return preClassCode;
    }

    public void setPreClassCode(String preClassCode) {
        this.preClassCode = preClassCode == null ? null : preClassCode.trim();
    }

    public Date getPreCheckDate() {
        return preCheckDate;
    }

    public void setPreCheckDate(Date preCheckDate) {
        this.preCheckDate = preCheckDate;
    }

    public Date getNextCheckDate() {
        return nextCheckDate;
    }

    public void setNextCheckDate(Date nextCheckDate) {
        this.nextCheckDate = nextCheckDate;
    }

    public Integer getWaterUsage() {
        return waterUsage;
    }

    public void setWaterUsage(Integer waterUsage) {
        this.waterUsage = waterUsage;
    }

    public Integer getLiveCount() {
        return liveCount;
    }

    public void setLiveCount(Integer liveCount) {
        this.liveCount = liveCount;
    }

    public Long getCoverImageId() {
        return coverImageId;
    }

    public void setCoverImageId(Long coverImageId) {
        this.coverImageId = coverImageId;
    }

    public String getSubjectType() {
        return subjectType;
    }

    public void setSubjectType(String subjectType) {
        this.subjectType = subjectType == null ? null : subjectType.trim();
    }

    public String getCode2d() {
        return code2d;
    }

    public void setCode2d(String code2d) {
        this.code2d = code2d == null ? null : code2d.trim();
    }

    public Integer getLevelNum() {
        return levelNum;
    }

    public void setLevelNum(Integer levelNum) {
        this.levelNum = levelNum;
    }

    public Integer getRentArea() {
        return rentArea;
    }

    public void setRentArea(Integer rentArea) {
        this.rentArea = rentArea;
    }

    public Date getSaveTime() {
        return saveTime;
    }

    public void setSaveTime(Date saveTime) {
        this.saveTime = saveTime;
    }
}