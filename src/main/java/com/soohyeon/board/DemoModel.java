package com.soohyeon.board;

import lombok.Builder;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Builder
@RequiredArgsConstructor
public class DemoModel {

	@NonNull
	private String id;
}
//  Lombok 정상적으로 설치됐는지 Test 