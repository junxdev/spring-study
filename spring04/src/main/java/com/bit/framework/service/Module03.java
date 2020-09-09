package com.bit.framework.service;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Module03 {
	int num;
	String name;
	Boolean fact;
	String[] arr;
	Object[] obj;
	List<String> list;
	Set<String> set;
	Map<String, Integer> map;
	
	public List<String> getList() {
		return list;
	}
	
	public Set<String> getSet() {
		return set;
	}
	
	public Map<String, Integer> getMap() {
		return map;
	}
	
	public void setList(List<String> list) {
		this.list = list;
	}
	
	public void setSet(Set<String> set) {
		this.set = set;
	}
	
	public void setMap(Map<String, Integer> map) {
		this.map = map;
	}
	
	public void showList() {
		for(String msg : list) System.out.println(msg);
	}
	
	public void showSet() {
		Iterator<String> ite = set.iterator();
		while(ite.hasNext()) System.out.println(ite.next());
	}
	
	public void showMap() {
		Set<Entry<String, Integer>> entry = map.entrySet();
		Iterator<Entry<String, Integer>> ite = entry.iterator();
		while(ite.hasNext()) {
			Entry<String, Integer> ent = ite.next();
			System.out.println(ent.getKey() + " : " + ent.getValue());
		}
	}
	
	public void setObj(Object[] obj) {
		this.obj = obj;
	}
	
	public Object[] getObj() {
		return obj;
	}
	
	public Module03() {
	}

	public Module03(int num, String name, Boolean fact, String[] arr) {
		super();
		this.num = num;
		this.name = name;
		this.fact = fact;
		this.arr = arr;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getFact() {
		return fact;
	}

	public void setFact(Boolean fact) {
		this.fact = fact;
	}

	public String[] getArr() {
		return arr;
	}

	public void setArr(String[] arr) {
		this.arr = arr;
	}

	@Override
	public String toString() {
		return "Module03 [num=" + num + ", name=" + name + ", fact=" + fact + ", arr=" + Arrays.toString(arr) + ", obj=" + Arrays.toString(obj) + "]";
	}

	
}
