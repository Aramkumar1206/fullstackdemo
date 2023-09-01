package com.webProject.SpringIntro;

public class processor {
	
	int proId;
	String proName;
	int proYOM;
	public processor(int proId, String proName, int proYOM) {
		super();
		this.proId = proId;
		this.proName = proName;
		this.proYOM = proYOM;
	}
	@Override
	public String toString() {
		return "processor [proId=" + proId + ", proName=" + proName + ", proYOM=" + proYOM + "]";
	}
	
	
	
	
	

	

}
