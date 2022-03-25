package com.ba.OceanusApp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FishGradeDets")
public class FishGradeDets {
	
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY )
	private int gradeid;
	private String fishcategory;
	private String fishgrade;
	private int catid;
	public int getGradeid() {
		return gradeid;
	}
	public void setGradeid(int gradeid) {
		this.gradeid = gradeid;
	}
	public String getFishcategory() {
		return fishcategory;
	}
	public void setFishcategory(String fishcategory) {
		this.fishcategory = fishcategory;
	}
	public String getFishgrade() {
		return fishgrade;
	}
	public void setFishgrade(String fishgrade) {
		this.fishgrade = fishgrade;
	}
	public int getCatid() {
		return catid;
	}
	public void setCatid(int catid) {
		this.catid = catid;
	}
	
	

}
