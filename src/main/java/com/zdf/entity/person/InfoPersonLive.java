package com.zdf.entity.person;

import java.util.Date;

public class InfoPersonLive {
    private Long id;

    private Long personId;

    private Long buildId;

    private Long floorId;

    private Long roomId;

    private Long householderPersonId;

    private String relationWithHouseholder;

    private String liveWay;

    private String liveReason;

    private String liveWhere;

    private String haveInsurance;

    private Date insuranceBuydate;

    private Date liveSdate;

    private Date liveEdate;

    private Long createBy;

    private Date createDate;

    private Long updateBy;

    private Date updateDate;

    private String delFlag;

    private String remarks;

    private Long subjectId;

    private String subjectType;

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

    public Long getBuildId() {
        return buildId;
    }

    public void setBuildId(Long buildId) {
        this.buildId = buildId;
    }

    public Long getFloorId() {
        return floorId;
    }

    public void setFloorId(Long floorId) {
        this.floorId = floorId;
    }

    public Long getRoomId() {
        return roomId;
    }

    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }

    public Long getHouseholderPersonId() {
        return householderPersonId;
    }

    public void setHouseholderPersonId(Long householderPersonId) {
        this.householderPersonId = householderPersonId;
    }

    public String getRelationWithHouseholder() {
        return relationWithHouseholder;
    }

    public void setRelationWithHouseholder(String relationWithHouseholder) {
        this.relationWithHouseholder = relationWithHouseholder == null ? null : relationWithHouseholder.trim();
    }

    public String getLiveWay() {
        return liveWay;
    }

    public void setLiveWay(String liveWay) {
        this.liveWay = liveWay == null ? null : liveWay.trim();
    }

    public String getLiveReason() {
        return liveReason;
    }

    public void setLiveReason(String liveReason) {
        this.liveReason = liveReason == null ? null : liveReason.trim();
    }

    public String getLiveWhere() {
        return liveWhere;
    }

    public void setLiveWhere(String liveWhere) {
        this.liveWhere = liveWhere == null ? null : liveWhere.trim();
    }

    public String getHaveInsurance() {
        return haveInsurance;
    }

    public void setHaveInsurance(String haveInsurance) {
        this.haveInsurance = haveInsurance == null ? null : haveInsurance.trim();
    }

    public Date getInsuranceBuydate() {
        return insuranceBuydate;
    }

    public void setInsuranceBuydate(Date insuranceBuydate) {
        this.insuranceBuydate = insuranceBuydate;
    }

    public Date getLiveSdate() {
        return liveSdate;
    }

    public void setLiveSdate(Date liveSdate) {
        this.liveSdate = liveSdate;
    }

    public Date getLiveEdate() {
        return liveEdate;
    }

    public void setLiveEdate(Date liveEdate) {
        this.liveEdate = liveEdate;
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

    public Long getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Long subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectType() {
        return subjectType;
    }

    public void setSubjectType(String subjectType) {
        this.subjectType = subjectType == null ? null : subjectType.trim();
    }
}