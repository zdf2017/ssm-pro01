package com.zdf.controller.webBean;

/**
 * 封装bootstrapTable查询参数
 **/
public class TableParam<T extends Object> {

	/** 每页的大小 **/
	private int size;
	/** 分页起始页码 **/
	private int pageIndex;

	private String status;
	/** 排序 **/
	private String order;
	/** 查询标志 **/
	private String search;
	/**表示实体对象**/
	private T entity;
	
	/**查找的对象**/
	private String name;
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

	public T getEntity() {
		return entity;
	}

	public void setEntity(T entity) {
		this.entity = entity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
