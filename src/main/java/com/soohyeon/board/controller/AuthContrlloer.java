package com.soohyeon.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.soohyeon.board.dto.auth.AuthPostDto;
import com.soohyeon.board.dto.auth.LoginDto;
import com.soohyeon.board.dto.response.ResponseDto;
import com.soohyeon.board.service.AuthService;

@RestController
@RequestMapping("api/auth/")
public class AuthContrlloer {

	// @Autowired : 해당하는 클래스 인스턴스를 자동으로 생성(주입) 해줌
	@Autowired
	AuthService authService;

	@PostMapping("")
	public ResponseDto<LoginDto> login(@RequestBody AuthPostDto requestBody) {

		return authService.login(requestBody);
	}
}

//		LoginDto result = new LoginDto("JWT", 3600000);
//		return ResponseDto.setSuccess("login success", result);