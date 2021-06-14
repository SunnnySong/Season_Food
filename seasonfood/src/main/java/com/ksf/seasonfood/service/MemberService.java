package com.ksf.seasonfood.service;

import javax.servlet.http.HttpSession;

import com.ksf.seasonfood.dto.MemberVO;

public interface MemberService {
	public boolean loginCheck(MemberVO vo, HttpSession session);
	// 회원 로그인 정보
	public MemberVO viewMember(MemberVO vo) ;
		
	public void logout(HttpSession session);
}

