package com.ba.OceanusApp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ColdStoDets")
public class ColdStoDets {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int csid;
	private String position;
	private String fishcategory;
	private String fishgrade;
	public int getCsid() {
		return csid;
	}
	public void setCsid(int csid) {
		this.csid = csid;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
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
	
	
	

}
