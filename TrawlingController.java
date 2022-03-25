package com.ba.OceanusApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ba.OceanusApp.dto.TrawlingDetailRequest;
import com.ba.OceanusApp.model.ColdStoDets;
import com.ba.OceanusApp.model.FishCatDets;
import com.ba.OceanusApp.model.FishGradeDets;
import com.ba.OceanusApp.model.FishTypeDetails;
import com.ba.OceanusApp.model.TrawlingDetails;
import com.ba.OceanusApp.service.TrawlingService;

@RestController
public class TrawlingController {
	
	@Autowired
	TrawlingService ts;
	
	
	
	//Adding to db
	@PostMapping(value = "/trawlingDetails", consumes = "application/json" )
	public List<TrawlingDetails> saveTrawlingDetails(@RequestBody TrawlingDetailRequest trawlingDetailReuest) {
		return ts.saveTrawlingDetails(trawlingDetailReuest);
	}
	
	//searching by rrawling number
	@GetMapping("/trawlingDetails/{trawlingNumber}")
	public List<TrawlingDetails> getDetailsByID(@PathVariable String trawlingNumber){
		return ts.getDetailsByID(trawlingNumber);
	}
	
	//filter by fishtype
	@GetMapping("/fishType")
	public List<FishTypeDetails> getAllFishTypes(){
		return ts.getAllFishTypes();
	}
	
	//get all category by type
	@GetMapping("/fishCategory/{fishtype}")
	public List<FishCatDets> getAllFishCategoryByType(@PathVariable String fishtype){
		return ts.getAllFishCategoryByType(fishtype);
	}
	
	//get all grades by category
	@GetMapping("/fishGrade/{fishcategory}")
	public List<FishGradeDets> getAllFishGradesBycategory(@PathVariable String fishcategory){
		return ts.getAllFishGradesBycategory(fishcategory);
		
	}
	
//	//filling coldstorage details
//	@PostMapping("/coldStorage")
//	public List<ColdStoDets> saveColdStoarageDetails(@RequestBody TrawlingDetailRequest trawlingDetailRequest){
//		
//	}
}
