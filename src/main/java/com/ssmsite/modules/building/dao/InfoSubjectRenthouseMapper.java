package com.ssmsite.modules.building.dao;

import com.ssmsite.modules.building.entity.InfoSubjectRenthouse;

public interface InfoSubjectRenthouseMapper {
    int deleteByPrimaryKey(Long id);

    int insert(InfoSubjectRenthouse record);

    int insertSelective(InfoSubjectRenthouse record);

    InfoSubjectRenthouse selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(InfoSubjectRenthouse record);

    int updateByPrimaryKey(InfoSubjectRenthouse record);
}