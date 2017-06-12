package com.zdf.entity.shop;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Id;

public class Product {
	private String proid;

	private String proname;

	private Date manufacturedate;

	private String manufacturesite;

	private Date purchasedate;

	private String prostate;

	private Date solddate;

	private String manuid;

	private String prolicense;

	private Date lastUpdatedStamp;

	private Date lastUpdatedTxStamp;

	private Date createdStamp;

	private Date createdTxStamp;

	@Id
	@Column(name="proid")
	public String getProid() {
		return proid;
	}

	public void setProid(String proid) {
		this.proid = proid == null ? null : proid.trim();
	}

	public String getProname() {
		return proname;
	}

	public void setProname(String proname) {
		this.proname = proname == null ? null : proname.trim();
	}

	public Date getManufacturedate() {
		return manufacturedate;
	}

	public void setManufacturedate(Date manufacturedate) {
		this.manufacturedate = manufacturedate;
	}

	public String getManufacturesite() {
		return manufacturesite;
	}

	public void setManufacturesite(String manufacturesite) {
		this.manufacturesite = manufacturesite == null ? null : manufacturesite.trim();
	}

	public Date getPurchasedate() {
		return purchasedate;
	}

	public void setPurchasedate(Date purchasedate) {
		this.purchasedate = purchasedate;
	}

	public String getProstate() {
		return prostate;
	}

	public void setProstate(String prostate) {
		this.prostate = prostate == null ? null : prostate.trim();
	}

	public Date getSolddate() {
		return solddate;
	}

	public void setSolddate(Date solddate) {
		this.solddate = solddate;
	}

	public String getManuid() {
		return manuid;
	}

	public void setManuid(String manuid) {
		this.manuid = manuid == null ? null : manuid.trim();
	}

	public String getProlicense() {
		return prolicense;
	}

	public void setProlicense(String prolicense) {
		this.prolicense = prolicense == null ? null : prolicense.trim();
	}

	public Date getLastUpdatedStamp() {
		return lastUpdatedStamp;
	}

	public void setLastUpdatedStamp(Date lastUpdatedStamp) {
		this.lastUpdatedStamp = lastUpdatedStamp;
	}

	public Date getLastUpdatedTxStamp() {
		return lastUpdatedTxStamp;
	}

	public void setLastUpdatedTxStamp(Date lastUpdatedTxStamp) {
		this.lastUpdatedTxStamp = lastUpdatedTxStamp;
	}

	public Date getCreatedStamp() {
		return createdStamp;
	}

	public void setCreatedStamp(Date createdStamp) {
		this.createdStamp = createdStamp;
	}

	public Date getCreatedTxStamp() {
		return createdTxStamp;
	}

	public void setCreatedTxStamp(Date createdTxStamp) {
		this.createdTxStamp = createdTxStamp;
	}
}