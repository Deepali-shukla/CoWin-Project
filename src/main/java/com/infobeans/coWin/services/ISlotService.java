package com.infobeans.coWin.services;

import java.util.List;

import com.infobeans.coWin.entities.Slot;

public interface ISlotService {
	Slot addSlots(Slot slots);

	Slot updateSlots(Slot slots);

	void removeSlots(int slotId);

	Slot searchSlots(int slotId);

	List<Slot> viewSlots();
}
