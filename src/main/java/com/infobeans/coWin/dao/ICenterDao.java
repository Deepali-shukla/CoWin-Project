package com.infobeans.coWin.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infobeans.coWin.entities.Center;

public interface ICenterDao extends JpaRepository<Center, Integer> {

}
