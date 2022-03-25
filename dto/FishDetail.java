package com.ba.OceanusApp.dto;

public class FishDetail {
	private String fishType;
	private String fishCategory;
	private String fishGrade;
	private int noofBoxes;
	private String position;
	public String getFishType() {
		return fishType;
	}
	public void setFishType(String fishType) {
		this.fishType = fishType;
	}
	public String getFishCategory() {
		return fishCategory;
	}
	public void setFishCategory(String fishCategory) {
		this.fishCategory = fishCategory;
	}
	public String getFishGrade() {
		return fishGrade;
	}
	public void setFishGrade(String fishGrade) {
		this.fishGrade = fishGrade;
	}
	public int getNoofBoxes() {
		return noofBoxes;
	}
	public void setNoofBoxes(int noofBoxes) {
		this.noofBoxes = noofBoxes;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String positions) {
		this.position = positions;
	}
	

}
