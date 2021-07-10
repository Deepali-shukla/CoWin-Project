package com.infobeans.coWin.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity(name="district")
@Table(name="district")
public class District {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "districtId_pk")
	private int districtId;
	
	private String districtName;
	
	@OneToOne(fetch=FetchType.LAZY)
    @PrimaryKeyJoinColumn
	private Center center;

	public District() {
		super();
		// TODO Auto-generated constructor stub
	}

	public District(int districtId, String districtName, Center center) {
		super();
		this.districtId = districtId;
		this.districtName = districtName;
		this.center = center;
	}

	public int getDistrictId() {
		return districtId;
	}

	public void setDistrictId(int districtId) {
		this.districtId = districtId;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public Center getCenter() {
		return center;
	}

	public void setCenter(Center center) {
		this.center = center;
	}

	@Override
	public String toString() {
		return "District [districtId=" + districtId + ", districtName=" + districtName + ", center=" + center + "]";
	}

	
}
