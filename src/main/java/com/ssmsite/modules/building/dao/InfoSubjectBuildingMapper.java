package com.ssmsite.modules.building.dao;

import com.ssmsite.modules.building.entity.InfoSubjectBuilding;

public interface InfoSubjectBuildingMapper {
    int deleteByPrimaryKey(Long id);

    int insert(InfoSubjectBuilding record);

    int insertSelective(InfoSubjectBuilding record);

    InfoSubjectBuilding selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(InfoSubjectBuilding record);

    int updateByPrimaryKey(InfoSubjectBuilding record);
}