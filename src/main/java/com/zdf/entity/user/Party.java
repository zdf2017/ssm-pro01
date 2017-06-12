package com.zdf.entity.user;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="party")
public class Party {
	
	private String PartyId;
	private PartyType PartyTypeId;
	private Date CreateDay;
	private String CreateMan;
	
	@Id
	@Column(name="partyd")
	public String getPartyId() {
		return PartyId;
	}
	public void setPartyId(String partyId) {
		PartyId = partyId;
	}
	@OneToOne
	@JoinColumn(name="partyTypeId")
	public PartyType getPartyTypeId() {
		return PartyTypeId;
	}
	public void setPartyTypeId(PartyType partyTypeId) {
		PartyTypeId = partyTypeId;
	}
	@Column(name="createDay")
	public Date getCreateDay() {
		return CreateDay;
	}
	public void setCreateDay(Date createDay) {
		CreateDay = createDay;
	}
	@Column(name="createMan")
	public String getCreateMan() {
		return CreateMan;
	}
	public void setCreateMan(String createMan) {
		CreateMan = createMan;
	}

	
}
