package com.ba.OceanusApp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="FishCatDets")
public class FishCatDets {
	
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY )
	private int catid;
	private String fishtype;
	private String fishcategory;
	private int fishid;
	public int getCatid() {
		return catid;
	}
	public void setCatid(int catid) {
		this.catid = catid;
	}
	public String getFishtype() {
		return fishtype;
	}
	public void setFishtype(String fishtype) {
		this.fishtype = fishtype;
	}
	public String getFishcategory() {
		return fishcategory;
	}
	public void setFishcategory(String fishcategory) {
		this.fishcategory = fishcategory;
	}
	public int getFishid() {
		return fishid;
	}
	public void setFishid(int fishid) {
		this.fishid = fishid;
	}
	

}
