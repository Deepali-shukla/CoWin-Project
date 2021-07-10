package com.infobeans.coWin.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.infobeans.coWin.entities.District;

	public interface IDistrictDao extends JpaRepository<District,Integer>{
        
		@Query("SELECT ud from district ud where ud.districtName=?1")
		public District findByName(String districtName);

	}

