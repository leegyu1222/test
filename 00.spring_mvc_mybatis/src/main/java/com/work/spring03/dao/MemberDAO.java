package com.work.spring03.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

import com.work.spring03.dto.Member;


public interface MemberDAO {
	public String login(String userid, String userpw);
	public int join(Member member);
}
