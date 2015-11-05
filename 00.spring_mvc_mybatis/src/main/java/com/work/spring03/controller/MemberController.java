package com.work.spring03.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.servlet.ModelAndView;

import com.work.spring03.dto.Member;
import com.work.spring03.service.MemberServiceImpl;
import com.work.spring03.util.Utility;

@Controller
public class MemberController {
	//���� ���谴ü �ڵ�����
	private MemberServiceImpl service;
	
	@Autowired
	public void setService(MemberServiceImpl service){
		this.service = service;
	
	}

	/**
	 * �α��� ������ ��û �޼���
	 * @return
	 */
	@RequestMapping("loginView.do")
	public String loginView(){
		System.out.println("###");
		return "login";
	}
	
	@RequestMapping("joinView.do")
	public String joinView(){
		return "join";
	}
	
	
	@RequestMapping("notice.do")
	public ModelAndView noticeList(){
		ModelAndView mv = new ModelAndView();
		// ������������ ���� value ����
		mv.addObject("title", "Notice List");
		// ���������� ����
		mv.setViewName("notice/notice");
		return mv;
	}
	
	
	/* ��û�� ���޹��� ������ �����ο� ��� */
	@RequestMapping(value="login.do", method=RequestMethod.POST)
	public ModelAndView login(String userid, String userpw, HttpServletRequest request){
		String grade = service.login(userid, userpw);
		ModelAndView mv = new ModelAndView();
		if(grade != null){
			HttpSession session = request.getSession();
			session.setAttribute("user", userid);
			session.setAttribute("grade", grade);
			mv.setViewName("notice/notice");
		}else {
			mv.addObject("messaage", "�α��������� �ٽ� Ȯ���Ͻñ� �ٶ��ϴ�.");
			mv.setViewName("error/errorLogin");
		}
		
		return mv;
	}
	
	@RequestMapping(value="join.do", method=RequestMethod.POST)
	public ModelAndView join(Member member){
		int result = service.join(member);
		ModelAndView mv = new ModelAndView();
		if(result > 0){
			mv.setViewName("home");
		}else{
			mv.addObject("message","ȸ�����Խ����Ͽ����ϴ�.");
			mv.setViewName("error/errorLogin");
		}
		
		return mv;
	}

}
