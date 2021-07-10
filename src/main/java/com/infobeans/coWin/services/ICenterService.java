package com.infobeans.coWin.services;

import java.util.List;

import com.infobeans.coWin.entities.Center;

public interface ICenterService {
	Center addCenter(Center center);

	Center updateCenter(Center center);

	void removeCenter(int center_id);

	Center searchCenter(int center_id);

	public List<Center> viewCenterList();
}
