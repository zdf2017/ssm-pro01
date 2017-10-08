package com.ssmsite.modules.building.entity;

import java.util.Date;

public class InfoSubjectBuilding {
    private Long id;

    private Long code;

    private String name;

    private Long orgId;

    private Long gridId;

    private String buildingType;

    private String status;

    private String buildingNature;

    private String structure;

    private String floorSurfacenum;

    private Date useSdate;

    private String housenumAddr1;

    private String housenumAddr2;

    private String otherAddr1;

    private String otherAddr2;

    private String propRightAddr;

    private String hasMonitor;

    private String hasEntranceGuard;

    private Date useEdate;

    private String floorUndernum;

    private String heightType;

    private String height;

    private Integer parkSurfacenum;

    private Integer parkUndernum;

    private String coverArea;

    private String floorSpace;

    private String useArea;

    private String mainUse;

    private String units;

    private Date completeDate;

    private String designPurpose;

    private String usePurpose;

    private String useSituation;

    private String geography;

    private Long coorId;

    private String fireCtrlroomSituation;

    private String fireCtrlroomPosition;

    private Integer fireLiftNum;

    private String fireLiftPosition;

    private String fireProofLevel;

    private String fireFacSituation;

    private Integer sancFloorNum;

    private String sancFloorArea;

    private String sancFloorPosition;

    private String seismicLevel;

    private String fireOverArea;

    private String video;

    private Long createBy;

    private Date createDate;

    private Long updateBy;

    private Date updateDate;

    private String delFlag;

    private String remarks;

    private String propRightStatus;

    private String placeType;

    private String fireCred;

    private String busiType;

    private String busiDataId;

    private Long precinctId;

    private String istemp;

    private Long coverImageId;

    private String entranceGuardStatus;

    private String relationType;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public Long getGridId() {
        return gridId;
    }

    public void setGridId(Long gridId) {
        this.gridId = gridId;
    }

    public String getBuildingType() {
        return buildingType;
    }

    public void setBuildingType(String buildingType) {
        this.buildingType = buildingType == null ? null : buildingType.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getBuildingNature() {
        return buildingNature;
    }

    public void setBuildingNature(String buildingNature) {
        this.buildingNature = buildingNature == null ? null : buildingNature.trim();
    }

    public String getStructure() {
        return structure;
    }

    public void setStructure(String structure) {
        this.structure = structure == null ? null : structure.trim();
    }

    public String getFloorSurfacenum() {
        return floorSurfacenum;
    }

    public void setFloorSurfacenum(String floorSurfacenum) {
        this.floorSurfacenum = floorSurfacenum == null ? null : floorSurfacenum.trim();
    }

    public Date getUseSdate() {
        return useSdate;
    }

    public void setUseSdate(Date useSdate) {
        this.useSdate = useSdate;
    }

    public String getHousenumAddr1() {
        return housenumAddr1;
    }

    public void setHousenumAddr1(String housenumAddr1) {
        this.housenumAddr1 = housenumAddr1 == null ? null : housenumAddr1.trim();
    }

    public String getHousenumAddr2() {
        return housenumAddr2;
    }

    public void setHousenumAddr2(String housenumAddr2) {
        this.housenumAddr2 = housenumAddr2 == null ? null : housenumAddr2.trim();
    }

    public String getOtherAddr1() {
        return otherAddr1;
    }

    public void setOtherAddr1(String otherAddr1) {
        this.otherAddr1 = otherAddr1 == null ? null : otherAddr1.trim();
    }

    public String getOtherAddr2() {
        return otherAddr2;
    }

    public void setOtherAddr2(String otherAddr2) {
        this.otherAddr2 = otherAddr2 == null ? null : otherAddr2.trim();
    }

    public String getPropRightAddr() {
        return propRightAddr;
    }

    public void setPropRightAddr(String propRightAddr) {
        this.propRightAddr = propRightAddr == null ? null : propRightAddr.trim();
    }

    public String getHasMonitor() {
        return hasMonitor;
    }

    public void setHasMonitor(String hasMonitor) {
        this.hasMonitor = hasMonitor == null ? null : hasMonitor.trim();
    }

    public String getHasEntranceGuard() {
        return hasEntranceGuard;
    }

    public void setHasEntranceGuard(String hasEntranceGuard) {
        this.hasEntranceGuard = hasEntranceGuard == null ? null : hasEntranceGuard.trim();
    }

    public Date getUseEdate() {
        return useEdate;
    }

    public void setUseEdate(Date useEdate) {
        this.useEdate = useEdate;
    }

    public String getFloorUndernum() {
        return floorUndernum;
    }

    public void setFloorUndernum(String floorUndernum) {
        this.floorUndernum = floorUndernum == null ? null : floorUndernum.trim();
    }

    public String getHeightType() {
        return heightType;
    }

    public void setHeightType(String heightType) {
        this.heightType = heightType == null ? null : heightType.trim();
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height == null ? null : height.trim();
    }

    public Integer getParkSurfacenum() {
        return parkSurfacenum;
    }

    public void setParkSurfacenum(Integer parkSurfacenum) {
        this.parkSurfacenum = parkSurfacenum;
    }

    public Integer getParkUndernum() {
        return parkUndernum;
    }

    public void setParkUndernum(Integer parkUndernum) {
        this.parkUndernum = parkUndernum;
    }

    public String getCoverArea() {
        return coverArea;
    }

    public void setCoverArea(String coverArea) {
        this.coverArea = coverArea == null ? null : coverArea.trim();
    }

    public String getFloorSpace() {
        return floorSpace;
    }

    public void setFloorSpace(String floorSpace) {
        this.floorSpace = floorSpace == null ? null : floorSpace.trim();
    }

    public String getUseArea() {
        return useArea;
    }

    public void setUseArea(String useArea) {
        this.useArea = useArea == null ? null : useArea.trim();
    }

    public String getMainUse() {
        return mainUse;
    }

    public void setMainUse(String mainUse) {
        this.mainUse = mainUse == null ? null : mainUse.trim();
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units == null ? null : units.trim();
    }

    public Date getCompleteDate() {
        return completeDate;
    }

    public void setCompleteDate(Date completeDate) {
        this.completeDate = completeDate;
    }

    public String getDesignPurpose() {
        return designPurpose;
    }

    public void setDesignPurpose(String designPurpose) {
        this.designPurpose = designPurpose == null ? null : designPurpose.trim();
    }

    public String getUsePurpose() {
        return usePurpose;
    }

    public void setUsePurpose(String usePurpose) {
        this.usePurpose = usePurpose == null ? null : usePurpose.trim();
    }

    public String getUseSituation() {
        return useSituation;
    }

    public void setUseSituation(String useSituation) {
        this.useSituation = useSituation == null ? null : useSituation.trim();
    }

    public String getGeography() {
        return geography;
    }

    public void setGeography(String geography) {
        this.geography = geography == null ? null : geography.trim();
    }

    public Long getCoorId() {
        return coorId;
    }

    public void setCoorId(Long coorId) {
        this.coorId = coorId;
    }

    public String getFireCtrlroomSituation() {
        return fireCtrlroomSituation;
    }

    public void setFireCtrlroomSituation(String fireCtrlroomSituation) {
        this.fireCtrlroomSituation = fireCtrlroomSituation == null ? null : fireCtrlroomSituation.trim();
    }

    public String getFireCtrlroomPosition() {
        return fireCtrlroomPosition;
    }

    public void setFireCtrlroomPosition(String fireCtrlroomPosition) {
        this.fireCtrlroomPosition = fireCtrlroomPosition == null ? null : fireCtrlroomPosition.trim();
    }

    public Integer getFireLiftNum() {
        return fireLiftNum;
    }

    public void setFireLiftNum(Integer fireLiftNum) {
        this.fireLiftNum = fireLiftNum;
    }

    public String getFireLiftPosition() {
        return fireLiftPosition;
    }

    public void setFireLiftPosition(String fireLiftPosition) {
        this.fireLiftPosition = fireLiftPosition == null ? null : fireLiftPosition.trim();
    }

    public String getFireProofLevel() {
        return fireProofLevel;
    }

    public void setFireProofLevel(String fireProofLevel) {
        this.fireProofLevel = fireProofLevel == null ? null : fireProofLevel.trim();
    }

    public String getFireFacSituation() {
        return fireFacSituation;
    }

    public void setFireFacSituation(String fireFacSituation) {
        this.fireFacSituation = fireFacSituation == null ? null : fireFacSituation.trim();
    }

    public Integer getSancFloorNum() {
        return sancFloorNum;
    }

    public void setSancFloorNum(Integer sancFloorNum) {
        this.sancFloorNum = sancFloorNum;
    }

    public String getSancFloorArea() {
        return sancFloorArea;
    }

    public void setSancFloorArea(String sancFloorArea) {
        this.sancFloorArea = sancFloorArea == null ? null : sancFloorArea.trim();
    }

    public String getSancFloorPosition() {
        return sancFloorPosition;
    }

    public void setSancFloorPosition(String sancFloorPosition) {
        this.sancFloorPosition = sancFloorPosition == null ? null : sancFloorPosition.trim();
    }

    public String getSeismicLevel() {
        return seismicLevel;
    }

    public void setSeismicLevel(String seismicLevel) {
        this.seismicLevel = seismicLevel == null ? null : seismicLevel.trim();
    }

    public String getFireOverArea() {
        return fireOverArea;
    }

    public void setFireOverArea(String fireOverArea) {
        this.fireOverArea = fireOverArea == null ? null : fireOverArea.trim();
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video == null ? null : video.trim();
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

    public String getPropRightStatus() {
        return propRightStatus;
    }

    public void setPropRightStatus(String propRightStatus) {
        this.propRightStatus = propRightStatus == null ? null : propRightStatus.trim();
    }

    public String getPlaceType() {
        return placeType;
    }

    public void setPlaceType(String placeType) {
        this.placeType = placeType == null ? null : placeType.trim();
    }

    public String getFireCred() {
        return fireCred;
    }

    public void setFireCred(String fireCred) {
        this.fireCred = fireCred == null ? null : fireCred.trim();
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

    public Long getPrecinctId() {
        return precinctId;
    }

    public void setPrecinctId(Long precinctId) {
        this.precinctId = precinctId;
    }

    public String getIstemp() {
        return istemp;
    }

    public void setIstemp(String istemp) {
        this.istemp = istemp == null ? null : istemp.trim();
    }

    public Long getCoverImageId() {
        return coverImageId;
    }

    public void setCoverImageId(Long coverImageId) {
        this.coverImageId = coverImageId;
    }

    public String getEntranceGuardStatus() {
        return entranceGuardStatus;
    }

    public void setEntranceGuardStatus(String entranceGuardStatus) {
        this.entranceGuardStatus = entranceGuardStatus == null ? null : entranceGuardStatus.trim();
    }

    public String getRelationType() {
        return relationType;
    }

    public void setRelationType(String relationType) {
        this.relationType = relationType == null ? null : relationType.trim();
    }

    public Date getSaveTime() {
        return saveTime;
    }

    public void setSaveTime(Date saveTime) {
        this.saveTime = saveTime;
    }
}