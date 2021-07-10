package com.infobeans.coWin.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infobeans.coWin.dao.IDistrictDao;
import com.infobeans.coWin.entities.District;


@Service("DistrictServiceImpl")
public class DistrictServiceImpl implements IDistrictService {
	private @Autowired IDistrictDao districtDao;

	@Override
	public District addDistrict(District district) {
		// TODO Auto-generated method stub
		return districtDao.save(district);
	}

	@Override
	public void cancelDistrict(int districtId) {
		// TODO Auto-generated method stub
		districtDao.deleteById(districtId);
		
	}

	@Override
	public District viewDistrict(int districtId) {
		// TODO Auto-generated method stub
		return districtDao.findById(districtId).get();
	}

	@Override
	public List<District> viewAllDistrict() {
		// TODO Auto-generated method stub
		return districtDao.findAll();
	}

	@Override
	public District searchDistrict(String districtName) {
		// TODO Auto-generated method stub
		return districtDao.findByName(districtName);
	}

}
