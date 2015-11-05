package com.work.spring03;

/**
 * 로그인 페이지에 대한 도메인 클래스
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
