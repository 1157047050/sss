package com.ssm.helper;

import java.util.List;

public class PageTerminal<T> {

	private int index = 1;	// 椤电储寮�
	
	private int size = 3;	// 椤靛ぇ灏�
	
	private int count;	// 鎬昏褰曟暟
	
	private List<T> list;

	public int getIndex() {
		return index ;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getPcount() {
		return count % size == 0 ? count / size : count / size + 1;
	}

	public int getStart() {
		return (index - 1) * size;
	}

	public int getEnd() {
		return size;
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}
	
}
