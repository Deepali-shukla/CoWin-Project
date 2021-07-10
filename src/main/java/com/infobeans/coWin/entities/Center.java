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

@Entity
@Table
public class Center { 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "centerId_pk")
	private int centerId;
	
	private String centerName;
	
	@OneToOne(fetch=FetchType.LAZY)
    @PrimaryKeyJoinColumn
	private Slot slot;

	public Center() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Center(int centerId, String centerName, Slot slot) {
		super();
		this.centerId = centerId;
		this.centerName = centerName;
		this.slot = slot;
	}

	public int getCenterId() {
		return centerId;
	}

	public void setCenterId(int centerId) {
		this.centerId = centerId;
	}

	public String getCenterName() {
		return centerName;
	}

	public void setCenterName(String centerName) {
		this.centerName = centerName;
	}

	public Slot getSlot() {
		return slot;
	}

	public void setSlot(Slot slot) {
		this.slot = slot;
	}

	@Override
	public String toString() {
		return "Center [centerId=" + centerId + ", centerName=" + centerName + ", slot=" + slot + "]";
	}
	
	
	

}
