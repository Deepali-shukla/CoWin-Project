package com.infobeans.coWin.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infobeans.coWin.dao.ISlotDao;
import com.infobeans.coWin.entities.Slot;

@Service("SlotServiceImpl")
public class SlotServiceImpl implements ISlotService{
	private @Autowired ISlotDao slotDao;
	@Override
	public Slot addSlots(Slot slots) {
		// TODO Auto-generated method stub
		return slotDao.save(slots);
	}

	@Override
	public Slot updateSlots(Slot slots) {
		// TODO Auto-generated method stub
		Slot fetchSlot = slotDao.findById(slots.getSlotId()).get();
		fetchSlot.setBooking_date(slots.getBooking_date());
		return slotDao.save(slots);
	}

	@Override
	public void removeSlots(int slotId) {
		// TODO Auto-generated method stub
		slotDao.deleteById(slotId);
	}

	@Override
	public Slot searchSlots(int slotId) {
		// TODO Auto-generated method stub
		return slotDao.findById(slotId).get();
	}

	@Override
	public List<Slot> viewSlots() {
		// TODO Auto-generated method stub
		return slotDao.findAll();
	}

}
