package com.work.spring03.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.work.spring03.dao.MemberDAOImpl;
import com.work.spring03.dto.Member;
import com.work.spring03.util.Utility;


@Service
public class MemberServiceImpl implements MemberService {
	private MemberDAOImpl dao;
	@Autowired
	public void setService(MemberDAOImpl dao){
		this.dao = dao;
	}
	
	public String login(String userid, String userpw){
		return dao.login(userid, userpw);
	}
	
	public int join(Member member){
		member.setEntryDate(Utility.getCurrentDate("yyyy.MM.dd"));
		member.setGrade("G");
		member.setMileage(1000);
		return dao.join(member);
	}
	

}
