package com.infobeans.coWin.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Slot {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "slotId_pk")
	private int slotId;
	
	Date booking_date;
    
	boolean booked_slot;
	
	public Slot() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Slot(int slotId, Date booking_date, boolean booked_slot) {
		super();
		this.slotId = slotId;
		this.booking_date = booking_date;
		this.booked_slot = booked_slot;
	}

	public int getSlotId() {
		return slotId;
	}

	public void setSlotId(int slotId) {
		this.slotId = slotId;
	}

	public Date getBooking_date() {
		return booking_date;
	}

	public void setBooking_date(Date booking_date) {
		this.booking_date = booking_date;
	}

	public boolean isBooked_slot() {
		return booked_slot;
	}

	public void setBooked_slot(boolean booked_slot) {
		this.booked_slot = booked_slot;
	}

	@Override
	public String toString() {
		return "Slot [slotId=" + slotId + ", booking_date=" + booking_date + ", booked_slot=" + booked_slot + "]";
	}

	
}
