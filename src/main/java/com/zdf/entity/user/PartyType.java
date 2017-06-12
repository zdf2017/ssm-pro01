package com.zdf.entity.user;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Id;

public class PartyType {
	
	private String PartyTypeId;
	private boolean HasTable;
	private String Description;
	private String CreateMan;
	private Date CreateDate;
	private String UpdateMan;
	private Date UpdateDate;
	@Id
	@Column(name="partyTypeId",length=30)
	public String getPartyTypeId() {
		return PartyTypeId;
	}
	public void setPartyTypeId(String partyTypeId) {
		PartyTypeId = partyTypeId;
	}
	@Column(name="hasTable")
	public boolean isHasTable() {
		return HasTable;
	}
	
	public void setHasTable(boolean hasTable) {
		HasTable = hasTable;
	}
	@Column(name="description",length=500)
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	@Column(name="createMan")
	public String getCreateMan() {
		return CreateMan;
	}
	public void setCreateMan(String createMan) {
		CreateMan = createMan;
	}
	@Column(name="createDate")
	public Date getCreateDate() {
		return CreateDate;
	}
	public void setCreateDate(Date createDate) {
		CreateDate = createDate;
	}
	public String getUpdateMan() {
		return UpdateMan;
	}
	public void setUpdateMan(String updateMan) {
		UpdateMan = updateMan;
	}
	public Date getUpdateDate() {
		return UpdateDate;
	}
	public void setUpdateDate(Date updateDate) {
		UpdateDate = updateDate;
	}
	

}
