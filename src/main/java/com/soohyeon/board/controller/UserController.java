package com.soohyeon.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.soohyeon.board.dto.response.ResponseDto;
import com.soohyeon.board.dto.user.PostUserDto;
import com.soohyeon.board.dto.user.PostUserResponseDto;
import com.soohyeon.board.service.UserService;

@RestController
@RequestMapping("api/user/")
public class UserController {

	@Autowired
	UserService userService;

	@PostMapping("")
	public ResponseDto<PostUserResponseDto> postUser(@RequestBody PostUserDto requsetBody) {

		return userService.postUser(requsetBody);

	}
}
