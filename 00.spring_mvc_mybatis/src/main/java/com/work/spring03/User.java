package com.work.spring03;

/**
 * �α��� �������� ���� ������ Ŭ����
 */
public class User {
	String userid;
	String userpw;
	
	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public void User(){
		
	}
	
	public void User(String userid, String userpw){
		this.userid = userid;
		this.userpw = userpw;
	}
}
