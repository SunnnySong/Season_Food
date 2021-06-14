package com.ksf.seasonfood.dao;

import javax.servlet.http.HttpSession;

import com.ksf.seasonfood.dto.MemberVO;

public interface MemberDAO {

	// 회원 로그인 체크
	public boolean loginCheck(MemberVO vo);
	// 회원 로그인 정보
	public MemberVO viewMember(MemberVO vo) ;
		
	public void logout(HttpSession session);
}