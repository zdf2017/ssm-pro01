package com.ssmsite.modules.person.services;

import java.util.List;

import com.ssmsite.modules.person.entity.InfoPersonLive;

public interface InfoPersonLiveService {
	
	public List<InfoPersonLive> findList(InfoPersonLive personlive);
	public InfoPersonLive selectByPrimaryKey(InfoPersonLive personlive);
	public InfoPersonLive selectCacheByPrimaryKey(long personliveId);

}
