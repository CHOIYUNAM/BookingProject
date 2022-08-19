package com.teamck.showing.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class USER_INFO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer U_SEQ;
	private String U_ID;
	private String U_PW;
	private String U_NAME;
	private String U_PNUM;
	private Character U_TYPE;
	private Date REG_DT;

	@Builder	
	public USER_INFO(String u_ID, String u_PW, String u_NAME, String u_PNUM) {
		U_ID = u_ID;
		U_PW = u_PW;
		U_NAME = u_NAME;
		U_PNUM = u_PNUM;
		this.U_TYPE = '0';
		this.REG_DT = new Date();
	}
}
