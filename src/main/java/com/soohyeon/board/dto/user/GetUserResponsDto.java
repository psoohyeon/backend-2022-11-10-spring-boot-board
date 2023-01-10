package com.soohyeon.board.dto.user;

import com.soohyeon.board.entity.MemberEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetUserResponsDto {

	private String email;
	private String nickname;
	private String profile;
	private String telNumber;
	private String address;

	public GetUserResponsDto(MemberEntity member) {
		this.email = member.getEmail();
		this.nickname = member.getNickname();
		this.profile = member.getProfile();
		this.telNumber = member.getTelNumber();
		this.address = member.getAddress();
	}
}
