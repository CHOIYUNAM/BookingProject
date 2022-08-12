package com.teamck.showing.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class USER_INFO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int U_SEQ;
	private String U_ID;
	private String U_PW;
	private String U_NAME;
	private Character U_TYPE;
	private Date REG_DT;
}
