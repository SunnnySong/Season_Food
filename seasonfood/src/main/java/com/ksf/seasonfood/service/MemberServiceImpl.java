package com.ksf.seasonfood.service;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import com.ksf.seasonfood.dao.MemberDAO;
import com.ksf.seasonfood.dto.MemberVO;

public class MemberServiceImpl implements MemberService {

	@Inject
	MemberDAO memberDao;

	// 회원 로그인 체크
	@Override
	public boolean loginCheck(MemberVO vo, HttpSession session) {
		boolean result= memberDao.loginCheck(vo);
		if(result) { //true 일 경우 세션에 등록
			MemberVO vo2 = viewMember(vo);
			//세션 변수 등록
			session.setAttribute("userId", vo2.getUserId());
			session.setAttribute("userName", vo2.getUserName());
		}
		return result;
	}
	// 회원 로그인 정보
	@Override
	public MemberVO viewMember(MemberVO vo) {
		return memberDao.viewMember(vo);
	}
	
	// 회원 로그아웃
	public void logout(HttpSession session) {
		//세션 변수 개별 삭제
		//session.removeAttribute("userId")
		//세션 정보를 초기화 시킴
		session.invalidate();
		
	}
}
