package com.zdf.services.person.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zdf.dao.person.InfoPersonLiveMapper;
import com.zdf.entity.person.InfoPersonLive;
import com.zdf.services.person.InfoPersonLiveService;

@Service("infoPersonLiveSercise")
public class InfoPersonLiveServiceImpl implements InfoPersonLiveService {

	@Resource
	private InfoPersonLiveMapper infoPersonLiveMapper;
	
	@Override
	public List<InfoPersonLive> findList(InfoPersonLive personlive) {
		List<InfoPersonLive> list = infoPersonLiveMapper.finList(personlive);
		return list;
	}
	

	@Override
	public InfoPersonLive selectByPrimaryKey(InfoPersonLive personlive) {
		return infoPersonLiveMapper.selectByPrimaryKey(personlive.getId());
	}

}
