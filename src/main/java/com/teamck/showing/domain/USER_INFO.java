package com.teamck.showing.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Setter
@ToString(exclude = "userBookedList")
public class USER_INFO {
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "U_SEQ")
	private Integer seq;
	private String U_ID;
	private String U_PW;
	private String U_NAME;
	private String U_PNUM;
	private Character U_TYPE;
	private Date REG_DT;

	@OneToMany(mappedBy = "userInfo", orphanRemoval = true)
	@JsonManagedReference
	private List<USER_BOOKING> userBookedList = new ArrayList<>();
	
	@Builder	
	public USER_INFO(String u_ID, String u_PW, String u_NAME, String u_PNUM, Character u_TYPE) {
		this.U_ID = u_ID;
		this.U_PW = u_PW;
		this.U_NAME = u_NAME;
		this.U_PNUM = u_PNUM;
		this.U_TYPE = u_TYPE;
		this.REG_DT = new Date();
	}
}
