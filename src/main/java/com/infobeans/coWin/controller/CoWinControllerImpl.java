package com.infobeans.coWin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infobeans.coWin.entities.Center;
import com.infobeans.coWin.entities.District;
import com.infobeans.coWin.entities.Slot;
import com.infobeans.coWin.services.ICenterService;
import com.infobeans.coWin.services.IDistrictService;
import com.infobeans.coWin.services.ISlotService;

@CrossOrigin(origins = {"http://localhost:3000"})
@RestController
@RequestMapping("cowin")
public class CoWinControllerImpl implements IcoWinController{
	private @Autowired IDistrictService districtService;
	private @Autowired ICenterService centerService;
	private @Autowired ISlotService slotService;
	
	@GetMapping("home")
	public String home()
	{
		return "Welcome to my cowin api";
	}
	
	@PostMapping("addDistricts")
	@Override
	public District addDistrict(@RequestBody District district) {
		// TODO Auto-generated method stub
		return districtService.addDistrict(district);
	}
    
	@DeleteMapping("removeDistrict/{districtId}")
	@Override
	public void cancelDistrict(@PathVariable("districtId") int districtId) {
		// TODO Auto-generated method stub
		districtService.cancelDistrict(districtId);
	}
     
	@GetMapping("viewDistrict/{districtId}")
	@Override
	public District viewDistrict(@PathVariable("districtId")  int districtId) {
		// TODO Auto-generated method stub
		return districtService.viewDistrict(districtId);
	}
    
	@GetMapping("viewDistrict")
	@Override
	public List<District> viewAllDistrict() {
		// TODO Auto-generated method stub
		return districtService.viewAllDistrict();
	}
    
	@PostMapping("bookCenter")
	@Override
	public Center addCenter(@RequestBody  Center center) {
		// TODO Auto-generated method stub
		return centerService.addCenter(center);
	}
    
	@PutMapping("updateCenter")
	@Override
	public Center updateCenter(@RequestBody Center center) {
		// TODO Auto-generated method stub
		return centerService.updateCenter(center);
	}
    
	@DeleteMapping("removeCenter/{center_id}")
	@Override
	public void removeCenter(@PathVariable("center_id") int center_id) {
		// TODO Auto-generated method stub
		centerService.removeCenter(center_id);
	}
    
	@GetMapping("searchCenter/{center_id}")
	@Override
	public Center searchCenter(@PathVariable("center_id") int center_id) {
		// TODO Auto-generated method stub
		return centerService.searchCenter(center_id);
	}
    
	@GetMapping("viewCenter")
	@Override
	public List<Center> viewCenterList() {
		// TODO Auto-generated method stub
		return centerService.viewCenterList();
	}
    
	@PostMapping("addSlots")
	@Override
	public Slot addSlots(@RequestBody Slot slots) {
		// TODO Auto-generated method stub
		return slotService.addSlots(slots);
	}
    
	@PutMapping("updateSlots")
	@Override
	public Slot updateSlots(@RequestBody Slot slots) {
		// TODO Auto-generated method stub
		return slotService.updateSlots(slots);
	}
    
	@DeleteMapping("removeSlots/{slotId}")
	@Override
	public void removeSlots(@PathVariable("slotId") int slotId) {
		// TODO Auto-generated method stub
		slotService.removeSlots(slotId);
	}
    
	@GetMapping("searchSlots/{slotId}")
	@Override
	public Slot searchSlots(@PathVariable("slotId") int slotId) {
		// TODO Auto-generated method stub
		return slotService.searchSlots(slotId);
	}
    
	@GetMapping("viewSlots")
	@Override
	public List<Slot> viewSlots() {
		// TODO Auto-generated method stub
		return slotService.viewSlots();
	}
	
    @GetMapping("searchByDistrict/{districtName}")
	@Override
	public District searchDistrict(@PathVariable("districtName") String districtName) {
		// TODO Auto-generated method stub
		return districtService.searchDistrict(districtName);
	}
    
}
