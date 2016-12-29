package com.cn.test.other;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class ComplexObject {

	private Properties adminEmails;
	
	private List<String> someList;
	
	private Map<String,Object> someMap;
	
	private Set<String> someSet;

	public Properties getAdminEmails() {
		return adminEmails;
	}

	public void setAdminEmails(Properties adminEmails) {
		this.adminEmails = adminEmails;
	}

	public List<String> getSomeList() {
		return someList;
	}

	public void setSomeList(List<String> someList) {
		this.someList = someList;
	}

	public Map<String, Object> getSomeMap() {
		return someMap;
	}

	public void setSomeMap(Map<String, Object> someMap) {
		this.someMap = someMap;
	}

	public Set<String> getSomeSet() {
		return someSet;
	}

	public void setSomeSet(Set<String> someSet) {
		this.someSet = someSet;
	}
	
}
