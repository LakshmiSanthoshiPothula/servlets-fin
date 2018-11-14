package com.training.entity;

public class Doctor {
	int id;
    String name;
    String gender;
    double fees;
    int experience;
    String qualification;
	public int getId() {
		return id;
	}
	public Doctor() {
		super();
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Doctor [id=" + id + ", name=" + name + ", gender=" + gender
				+ ", fees=" + fees + ", experience=" + experience
				+ ", qualification=" + qualification + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Doctor(int id, String name, String gender, double fees,
			int experience, String qualification) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.fees = fees;
		this.experience = experience;
		this.qualification = qualification;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

}
