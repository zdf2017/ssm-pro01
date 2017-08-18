package com.zdf.services.person;

import java.util.List;

import com.zdf.entity.person.InfoPersonLive;

public interface InfoPersonLiveService {
	
	public List<InfoPersonLive> findList(InfoPersonLive personlive);
	public InfoPersonLive selectByPrimaryKey(InfoPersonLive personlive);

}
