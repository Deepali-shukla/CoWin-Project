package com.infobeans.coWin.controller;

import java.util.List;

import com.infobeans.coWin.entities.Center;
import com.infobeans.coWin.entities.District;
import com.infobeans.coWin.entities.Slot;

public interface IcoWinController {
	
	District addDistrict(District district);

	void cancelDistrict(int districtId);

	District viewDistrict(int districtId);

	List<District> viewAllDistrict();
	
	District searchDistrict(String districtName);
	
	Center addCenter(Center center);

	Center updateCenter(Center center);

	void removeCenter(int center_id);

	Center searchCenter(int center_id);

	public List<Center> viewCenterList();
	
	Slot addSlots(Slot slots);

	Slot updateSlots(Slot slots);

	void removeSlots(int slotId);

	Slot searchSlots(int slotId);

	List<Slot> viewSlots();
}
