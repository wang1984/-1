package com.taotao.common.pojo;

import java.util.List;

public class EUDataGridResult {
	/*
	 *private List<?> rows 使用 ？ 表示可以接受任意类型
	 *而且这样写 类名上就可以不写泛型
	 *
	 *如果：private List<T> rows 那么
	 *类名上就要写泛型EUDataGridResult<T>
	 */
	private long total;
	private List<?> rows;
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public List<?> getRows() {
		return rows;
	}
	public void setRows(List<?> rows) {
		this.rows = rows;
	}
}
