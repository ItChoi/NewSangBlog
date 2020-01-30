package com.blog.sang.manager.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("manager")
public class ManagerController {
	/**
	 * TODO:: 관리자 페이지 우선 순위 기능 개발
	 * 1. 회원 등록 - 페북, 구글, 카카오 로그인 API 및 스프링 시큐리티 이용한 로직 만들기. (권한 설정 및 접근 가능 페이지)
	 *   - 유저 정보 (로그인 아이디, 비밀 번호, 이름, 폰 번호, 이메일, 소개글, 이미지) 
	 * 2. 로그인
	 * 3. 메뉴 - 1차 2차 3차 등등등 적절하게 배치
	 * 4. 유저 ROLE에 따른 메뉴 보이게
	 * 5. 
	 */

	@RequestMapping(value= {"/", ""})
	public String managerMainPage() {
		/**
		 * TODO:: 매니저 메인 페이지 필요 로직
		 * 1. 메뉴 페이지 (어떤 페이지 이동 시에도 유지)
		 * 2. 로그인 상태 여부 - 접근 가능 페이지, 권한
		 * 3. 
		 */
		
		return "manager/index";
	}
}
