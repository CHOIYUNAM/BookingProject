package com.teamck.showing.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString(exclude = "userInfo")
public class USER_BOOKING {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer UB_SEQ;
	private String UB_TITLE;
	private String UB_SEATNUM;
	private Character UB_STATE;
	private Date START_DATE;
	private Date REG_DT;
//	private Integer USER_INFO_U_SEQ;

	@ManyToOne
	@JoinColumn(name="USER_INFO_U_SEQ")
	@JsonBackReference
	private USER_INFO userInfo;
	
	@PrePersist
	public void REG_DT() {
		this.REG_DT = new Date();
	}
	
	@Builder
	public USER_BOOKING(String uB_TITLE, String uB_SEATNUM, Character uB_STATE, Date sTART_DATE, USER_INFO userInfo) {
		this.UB_TITLE = uB_TITLE;
		this.UB_SEATNUM = uB_SEATNUM;
		this.UB_STATE = uB_STATE;
		this.START_DATE = sTART_DATE;
		this.REG_DT = new Date();
		this.userInfo = userInfo;
	}
}
