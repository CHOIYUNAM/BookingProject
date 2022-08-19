package com.teamck.showing.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
public class SHOW_INFO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int SI_SEQ;
	private String SI_NAME;
	private Character SI_CODE;
	private Character SI_RATING;
	private int SI_PRICE;
	private int SI_RUNTIME;
	private String SI_ACTOR;
	private String SI_THEATER;
	private String SI_POSTER;
	@Column(columnDefinition = "TEXT")
	private String SI_CONTEXT;
	private Date START_DATE;
	private Date REG_DT;
}
