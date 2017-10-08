package com.ssmsite.modules.building.dao;

import com.ssmsite.modules.building.entity.InfoSubjectOperateplace;

public interface InfoSubjectOperateplaceMapper {
    int deleteByPrimaryKey(Long id);

    int insert(InfoSubjectOperateplace record);

    int insertSelective(InfoSubjectOperateplace record);

    InfoSubjectOperateplace selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(InfoSubjectOperateplace record);

    int updateByPrimaryKey(InfoSubjectOperateplace record);
}