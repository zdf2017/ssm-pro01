package com.zdf.controller.person;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.RowBounds;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.PageRowBounds;
import com.zdf.controller.webUtils.TablePage;
import com.zdf.entity.person.InfoPersonLive;
import com.zdf.services.person.InfoPersonLiveService;

@Controller
@RequestMapping(value="personLive")
public class InfoPersonLiveController {
	
	@Autowired
	private InfoPersonLiveService infoPersonLive;
	
	private static Logger logger = Logger.getLogger(InfoPersonLiveController.class);

	@RequestMapping(value={"form","info"},method=RequestMethod.GET)
	public String PersonLiveInfo(InfoPersonLive personLive,Model model){
		long start = System.currentTimeMillis();
		InfoPersonLive info = infoPersonLive.selectByPrimaryKey(personLive);
		long stop1 = System.currentTimeMillis();
		InfoPersonLive infoe = infoPersonLive.selectCacheByPrimaryKey(personLive.getId());
		long stop2 = System.currentTimeMillis();
		logger.error("使用缓存>>"+(stop2-start)+"  不使用缓存>>>"+(stop1-start));
		model.addAttribute("personLive", info);
		model.addAttribute("ehpersonLive",infoe);
		return "person/personLive-info";
	}
	
	@RequestMapping(value={"list"},method=RequestMethod.GET)
	public String list(){
		return "person/personLive-list";
	}
	
	@ResponseBody
	@RequestMapping(value={"jsonlist"},method=RequestMethod.GET)
	public PageInfo<InfoPersonLive> getJsonList(InfoPersonLive personLive){
		logger.error("开始查询");
		PageHelper.offsetPage(1, 30);
		List<InfoPersonLive> list = infoPersonLive.findList(personLive);
		System.out.println(list.size());
		PageInfo<InfoPersonLive> page = new PageInfo<InfoPersonLive>(list);
		//TablePage<InfoPersonLive> tpage = new  TablePage<InfoPersonLive>(list);
		return page;
	}
	
	@ResponseBody
	@RequestMapping(value={"pagelist"},method=RequestMethod.GET)
	@Cacheable(value="myCache",key="'getJsonPage-' +#pageNum")
	public TablePage<InfoPersonLive> getJsonPage(InfoPersonLive personLive,@RequestParam(value="pageSize") int pageSize,
			@RequestParam(value="pageNum")int pageNum){
		logger.error("开始查询");
		PageHelper.offsetPage(pageNum, pageSize);
		List<InfoPersonLive> list = infoPersonLive.findList(personLive);
	
		PageInfo<InfoPersonLive> page = new PageInfo<InfoPersonLive>(list);
		TablePage<InfoPersonLive> tpage = new  TablePage<InfoPersonLive>();
		tpage.setRows(page.getList());
		tpage.setTotal(page.getTotal());
		return tpage;
	}
	
}
