package com.zdf.dao.person;

import com.zdf.entity.person.InfoPerson;

public interface InfoPersonMapper {
    int deleteByPrimaryKey(Long id);

    int insert(InfoPerson record);

    int insertSelective(InfoPerson record);

    InfoPerson selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(InfoPerson record);

    int updateByPrimaryKey(InfoPerson record);
}