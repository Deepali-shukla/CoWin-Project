package com.infobeans.coWin.services;

import java.util.List;

import com.infobeans.coWin.entities.Center;
import com.infobeans.coWin.entities.District;


public interface IDistrictService {
	District addDistrict(District district);

	void cancelDistrict(int districtId);

	District viewDistrict(int districtId);

	List<District> viewAllDistrict();
	
	District searchDistrict(String districtName);
}
