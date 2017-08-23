package com.ssmsite.modules.person.dao;

import com.ssmsite.modules.person.entity.InfoPersonCred;

public interface InfoPersonCredMapper {
    int deleteByPrimaryKey(Long id);

    int insert(InfoPersonCred record);

    int insertSelective(InfoPersonCred record);

    InfoPersonCred selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(InfoPersonCred record);

    int updateByPrimaryKey(InfoPersonCred record);
}