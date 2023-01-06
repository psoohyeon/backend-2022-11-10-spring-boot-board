package com.soohyeon.board.service;

import org.springframework.stereotype.Service;

import com.soohyeon.board.dto.auth.AuthPostDto;
import com.soohyeon.board.dto.auth.LoginDto;
import com.soohyeon.board.dto.response.ResponseDto;
//@Service : 해당 클래스가 Service 레이어 역할을 함
@Service
public class AuthService {
	
	public ResponseDto<LoginDto> login(AuthPostDto dto) {
		LoginDto result = new LoginDto("JWT", 3600000);
		return ResponseDto.setSuccess("", result);
		
	}
}
