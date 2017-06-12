package com.zdf.controller.webBean;

import java.util.List;

public class TableResult<T extends Object>{
	
	private List<T> rows;
	private int total;
	private T entity;
	
	public List<T> getRows() {
		return rows;
	}
	public void setRows(List<T> rows) {
		this.rows = rows;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public T getEntity() {
		return entity;
	}
	public void setEntity(T entity) {
		this.entity = entity;
	}
}
