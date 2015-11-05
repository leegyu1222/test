package com.work.spring03.service;

import com.work.spring03.dto.Member;

public interface MemberService {
	public String login(String userid, String userpw);
	public int join(Member member);
}
