package com.ksf.seasonfood.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ksf.seasonfood.dto.MemberVO;
import com.ksf.seasonfood.service.MemberService;




@Controller
@RequestMapping("/member/*") // 모든맵핑은 / sf/를 상속
public class MemberController {

	private static final Logger losser = LoggerFactory.getLogger(MemberController.class); 
	
	@Inject
	MemberService memberService;
	
	//로그인 화면
	@RequestMapping("login.do")
	public String login() {
		return "member/login";
	}
	
	@RequestMapping("loginCheck.do")
	public ModelAndView loginCheck(@ModelAttribute MemberVO vo, HttpSession session) {
		boolean result = memberService.loginCheck(vo, session);
		ModelAndView mav = new ModelAndView();
		if(result == true) {//로그인 성공
			//main.jsp로 이동
			mav.setViewName("home");
			mav.addObject("msg", "success");
		} else { //로그인 실패
			//login.jsp로 이동
			mav.setViewName("member/login");
			mav.addObject("msg", "failure");
		}
		return mav;
	}
		//로그아웃 처리

		@RequestMapping("logout.do")
		public ModelAndView logout(HttpSession session) {
			memberService.logout(session);
			ModelAndView maView = new ModelAndView();
			maView.setViewName("member/login");
			maView.addObject("msg","logout");
			return maView;
		}
			
	
	
}// 클래스
