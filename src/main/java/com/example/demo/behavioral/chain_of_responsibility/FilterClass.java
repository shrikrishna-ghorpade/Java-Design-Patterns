package com.example.demo.behavioral.chain_of_responsibility;

import java.util.List;

import org.springframework.util.ObjectUtils;

class FilterClass {

	private FilterClass filterClass;

	private List<String> list;

	private String filterOn;

	public FilterClass(List<String> list) {
		super();
		this.list = list;
	}

	public FilterClass(FilterClass filterClass, String filterOn) {
		super();
		this.filterClass = filterClass;
		this.filterOn = filterOn;
	}

	public List<String> filter() {
		if (null != filterClass) {
			list = filterClass.filter();
		}
		if (!ObjectUtils.isEmpty(filterOn)) {
			if ("REMOVE_FIRST".equals(filterOn)) {
				list.remove(0);
			} else if ("SMALL".equals(filterOn)) {
				list.removeAll(list.stream().filter(p -> p.length() < 2).toList());
			} else if ("BIG".equals(filterOn)) {
				list.removeAll(list.stream().filter(p -> p.length() > 10).toList());
			}
		}
		return list;
	}
}
