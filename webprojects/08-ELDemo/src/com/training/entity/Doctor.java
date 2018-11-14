package com.training.entity;

public class Doctor {
String name="dr.santhu";
int experience=21;
Clinic clinic=new Clinic();
public String getName() {
	return name;
}
public Clinic getClinic() {
	return clinic;
}
public void setClinic(Clinic clinic) {
	this.clinic = clinic;
}
public void setName(String name) {
	this.name = name;
}
public double getConsultationFees() {
	return consultationFees;
}
public void setConsultationFees(double consultationFees) {
	this.consultationFees = consultationFees;
}
public int getExperience() {
	return experience;
}
public void setExperience(int experience) {
	this.experience = experience;
}
double consultationFees=28000;

}
