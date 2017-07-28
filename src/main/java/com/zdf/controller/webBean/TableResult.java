package com.zdf.controller.webBean;

import java.util.List;

public class TableResult<T extends Object>{
	
	private List<T> rows;
	private long total;
	private T entity;
	
	public List<T> getRows() {
		return rows;
	}
	public void setRows(List<T> rows) {
		this.rows = rows;
	}
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public T getEntity() {
		return entity;
	}
	public void setEntity(T entity) {
		this.entity = entity;
	}
}
