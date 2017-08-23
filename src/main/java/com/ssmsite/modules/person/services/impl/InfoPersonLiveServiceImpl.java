package com.ssmsite.modules.person.services.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.ssmsite.modules.person.dao.InfoPersonLiveMapper;
import com.ssmsite.modules.person.entity.InfoPersonLive;
import com.ssmsite.modules.person.services.InfoPersonLiveService;

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
	 
	 /** 
     * Cacheable注解负责将方法的返回值加入到缓存中 
     * CacheEvict注解负责清除缓存(它的三个参数与@Cacheable的意思是一样的) 
     * @see ---------------------------------------------------------------------------------------------------------- 
     * @see value------缓存位置的名称,不能为空,若使用EHCache则其值为ehcache.xml中的<cache name="myCache"/> 
     * @see key--------缓存的Key,默认为空(表示使用方法的参数类型及参数值作为key),支持SpEL 
     * @see condition--只有满足条件的情况才会加入缓存,默认为空(表示全部都加入缓存),支持SpEL 
     * @see ---------------------------------------------------------------------------------------------------------- 
     * @see 该注解的源码位于spring-context-3.2.4.RELEASE-sources.jar中 
     * @see Spring针对Ehcache支持的Java源码位于spring-context-support-3.2.4.RELEASE-sources.jar中 
     * @see ---------------------------------------------------------------------------------------------------------- 
     * @create Oct 3, 2013 6:17:54 PM 
     * @author 玄玉<http://blog.csdn.net/jadyer> 
     */ 
	//将查询到的数据缓存到myCache中,并使用方法名称加上参数中的userNo作为缓存的key  
    //通常更新操作只需刷新缓存中的某个值,所以为了准确的清除特定的缓存,故定义了这个唯一的key,从而不会影响其它缓存值  
    @Cacheable(value="myCache", key="'get-'+#personliveId")  
	public InfoPersonLive selectCacheByPrimaryKey(long personliveId){
		return infoPersonLiveMapper.selectByPrimaryKey(personliveId);
	}
	

}
