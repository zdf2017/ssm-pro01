package com.ssmsite.modules.person.dao;

import java.util.List;

import com.ssmsite.modules.person.entity.InfoPersonLive;

public interface InfoPersonLiveMapper {
	int deleteByPrimaryKey(Long id);

	int insert(InfoPersonLive record);

	int insertSelective(InfoPersonLive record);

	InfoPersonLive selectByPrimaryKey(Long id);

	int updateByPrimaryKeySelective(InfoPersonLive record);

	int updateByPrimaryKey(InfoPersonLive record);

	List<InfoPersonLive> finList(InfoPersonLive param);
}