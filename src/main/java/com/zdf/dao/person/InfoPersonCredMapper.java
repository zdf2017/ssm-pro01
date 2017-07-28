package com.zdf.dao.person;

import com.zdf.entity.person.InfoPersonCred;

public interface InfoPersonCredMapper {
    int deleteByPrimaryKey(Long id);

    int insert(InfoPersonCred record);

    int insertSelective(InfoPersonCred record);

    InfoPersonCred selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(InfoPersonCred record);

    int updateByPrimaryKey(InfoPersonCred record);
}