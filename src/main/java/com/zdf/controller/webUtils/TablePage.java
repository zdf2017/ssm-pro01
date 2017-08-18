package com.zdf.controller.webUtils;

import java.io.Serializable;
import java.util.List;

import com.github.pagehelper.PageInfo;
import com.zdf.entity.person.InfoPersonLive;

public class TablePage<T> implements Serializable {

	private List<T> rows;
	private long total;

	public TablePage() {
		// TODO Auto-generated constructor stub
	}

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

}
