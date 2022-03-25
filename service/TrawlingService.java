package com.ba.OceanusApp.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.ba.OceanusApp.controller.TrawlingController;
import com.ba.OceanusApp.dto.FishDetail;
import com.ba.OceanusApp.dto.TrawlingDetailRequest;
import com.ba.OceanusApp.model.TrawlingDetails;
import com.ba.OceanusApp.repo.ColdStoRepo;
import com.ba.OceanusApp.repo.FishCatRepo;
import com.ba.OceanusApp.repo.FishGradeRepo;
import com.ba.OceanusApp.repo.FishTypeRepo;
import com.ba.OceanusApp.repo.TrawlingRepo;
import com.ba.OceanusApp.model.ColdStoDets;
import com.ba.OceanusApp.model.FishCatDets;
import com.ba.OceanusApp.model.FishGradeDets;
import com.ba.OceanusApp.model.FishTypeDetails;

@Service
public class TrawlingService {
	
	@Autowired
	TrawlingRepo tr;
	
	@Autowired
	FishTypeRepo ftr;
	
	@Autowired
	FishCatRepo fcr;
	
	@Autowired
	FishGradeRepo fgr;
	
	@Autowired
	ColdStoRepo csr;
	
	@Autowired
	JdbcTemplate jdbc;
	
	public List<TrawlingDetails> saveTrawlingDetails(@RequestBody TrawlingDetailRequest trawlingDetailRequest) {
		
		List<TrawlingDetails> trawlingDetails =new ArrayList<TrawlingDetails>();
		
		for(FishDetail fishDetail : trawlingDetailRequest.getFishDetails()) {
			TrawlingDetails trawlingDetail = new TrawlingDetails();
			trawlingDetail.setTrawlingNumber(trawlingDetailRequest.getTrawlingNumber());
			trawlingDetail.setTrawlingDate(trawlingDetailRequest.getTrawlingDate());
			trawlingDetail.setTotalVolume(trawlingDetailRequest.getTotalVolume());
			trawlingDetail.setFishType(fishDetail.getFishType());
			trawlingDetail.setFishCategory(fishDetail.getFishCategory());
			trawlingDetail.setFishGrade(fishDetail.getFishGrade());
			trawlingDetail.setNofBoxes(fishDetail.getNoofBoxes());
			trawlingDetail.setPosition(fishDetail.getPosition());
			trawlingDetails.add(trawlingDetail);
		}
		
		if(!trawlingDetails.isEmpty()) {
			tr.saveAll(trawlingDetails);
		}
		
		return trawlingDetails;		

		
	}
	
	//get details by trawling number
	public List<TrawlingDetails> getDetailsByID(String trawlingNumber){
		String sql = "select * from TrawlingDetails where trawlingNumber = '"+ trawlingNumber +"'";
		List<TrawlingDetails> list = jdbc.query(sql, new BeanPropertyRowMapper<TrawlingDetails>(TrawlingDetails.class), trawlingNumber);
		return list;
		
		//return tr.findAllByTrawlingNumber(trawlingNumber);
	}
	
	//filter by fish type
	public List<FishTypeDetails> getAllFishTypes(){
		return ftr.findAll();
		
	}
	
	//get all fish categories by fish type
	public List<FishCatDets> getAllFishCategoryByType(String fishtype){
		return fcr.findAllByFishtype(fishtype);
		
	}
	
	//get all grades by category		
	public List<FishGradeDets> getAllFishGradesBycategory(String fishcategory){
		return fgr.findAllByFishcategory(fishcategory);
			
	}	
	
	class TrawlingDetailRowMapper implements RowMapper<TrawlingDetails>{

		@Override
		public TrawlingDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
			TrawlingDetails td =new TrawlingDetails();
			td.setTrawlingNumber(rs.getString("trawlingNumber"));
			
			
			// TODO Auto-generated method stub
			return null;
		}
		
	}
	
//	//filling cold storage
//	public List<ColdStoDets> saveColdStoarageDetails(TrawlingDetailRequest trawlingDetailRequest){
//		
//		List<ColdStoDets> coldDets = new ArrayList<ColdStoDets>();
//		ColdStoDets coldStoDets = new ColdStoDets();
//		for(FishDetail fishDetail : trawlingDetailRequest.getFishDetails()) {
//			TrawlingDetails trawlingDetail = new TrawlingDetails();
//			if() {
//				
//			}
//			
//			
//			
//			trawlingDetail.setFishCategory(fishDetail.getFishCategory());
//			trawlingDetail.setFishGrade(fishDetail.getFishGrade());			
//			trawlingDetail.setPosition(fishDetail.getPosition());
//			trawlingDetails.add(trawlingDetail);
//		}
//	}
//	

}
