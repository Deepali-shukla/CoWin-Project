package com.infobeans.coWin.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infobeans.coWin.dao.ICenterDao;
import com.infobeans.coWin.entities.Center;
import com.infobeans.coWin.entities.Slot;



@Service("CenterServiceImpl")
public class CenterServiceImpl implements ICenterService {
	private @Autowired ICenterDao centerDao;
	@Override
	public Center addCenter(Center center) {
		// TODO Auto-generated method stub
		return centerDao.save(center);
	}

	@Override
	public Center updateCenter(Center center) {
		// TODO Auto-generated method stub
		Center fetchCenter = centerDao.findById(center.getCenterId()).get();
		fetchCenter.setCenterName(center.getCenterName());
		fetchCenter.setSlot(center.getSlot());
		return centerDao.save(fetchCenter);
	}

	@Override
	public void removeCenter(int centerId) {
		// TODO Auto-generated method stub
		centerDao.deleteById(centerId);
	}

	@Override
	public Center searchCenter(int centerId) {
		// TODO Auto-generated method stub
		return centerDao.findById(centerId).get();
	}

	@Override
	public List<Center> viewCenterList() {
		// TODO Auto-generated method stub
		return centerDao.findAll();
	}

}
