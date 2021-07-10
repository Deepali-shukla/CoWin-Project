package com.infobeans.coWin.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infobeans.coWin.entities.Slot;

public interface ISlotDao extends JpaRepository<Slot, Integer> {

}
