package com.ba.OceanusApp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="FishTypeDetails")
public class FishTypeDetails {
	
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY )
	private int fishid;
	private String fishtype;
	public int getFishid() {
		return fishid;
	}
	public void setFishid(int fishid) {
		this.fishid = fishid;
	}
	public String getFishtype() {
		return fishtype;
	}
	public void setFishtype(String fishtype) {
		this.fishtype = fishtype;
	}
	
	

}
