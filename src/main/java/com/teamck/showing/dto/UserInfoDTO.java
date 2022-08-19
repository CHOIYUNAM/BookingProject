package com.teamck.showing.dto;

import java.util.Date;

import com.teamck.showing.domain.USER_INFO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserInfoDTO {
	private Integer U_SEQ;
	private String U_ID;
	private String U_PW;
	private String U_NAME;
	private String U_PNUM;
	private Character U_TYPE;
	private Date REG_DT;
	
	@Builder
	public UserInfoDTO(String u_ID, String u_PW, String u_NAME, String u_PNUM, Character u_TYPE) {
		this.U_ID = u_ID;
		this.U_PW = u_PW;
		this.U_NAME = u_NAME;
		this.U_PNUM = u_PNUM;
		this.U_TYPE = u_TYPE;
		this.REG_DT = new Date();
	}
	
	public USER_INFO toEntity() {
		return USER_INFO.builder()
				.u_ID(U_ID)
				.u_PW(U_PW)
				.u_NAME(U_NAME)
				.u_PNUM(U_PNUM)
				.u_TYPE(U_TYPE)
				.build();
	}
}
