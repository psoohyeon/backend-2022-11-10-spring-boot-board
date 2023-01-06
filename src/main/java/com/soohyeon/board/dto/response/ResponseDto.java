package com.soohyeon.board.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor(staticName = "set") //set이라는 이름의 static 팩토리 메서드 생성

public class ResponseDto<D> {
	private boolean status;
	private String message;
	private D data;

	public static <D> ResponseDto<D> setSuccess(String message, D data) {
		return ResponseDto.set(true, message, data);
	}

	public static <D> ResponseDto<D> setFailed(String message) {
		return ResponseDto.set(false, message, null);
	}
}