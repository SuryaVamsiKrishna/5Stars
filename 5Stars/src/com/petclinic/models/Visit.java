package com.petclinic.models;

import java.time.LocalDate;



public class Visit {

private LocalDate date;
private String OwnerName;
private double PetId;
private double VetId;
private String VetName;
public Visit(LocalDate date, String ownerName, double petId, double vetId, String vetName) {
super();
this.date = date;
OwnerName = ownerName;
PetId = petId;
VetId = vetId;
VetName = vetName;
}
public LocalDate getDate() {
return date;
}
public void setDate(LocalDate date) {
this.date = date;
}
public String getOwnerName() {
return OwnerName;
}
public void setOwnerName(String ownerName) {
OwnerName = ownerName;
}
public double getPetId() {
return PetId;
}
public void setPetId(double petId) {
PetId = petId;
}
public double getVetId() {
return VetId;
}
public void setVetId(double vetId) {
VetId = vetId;
}
public String getVetName() {
return VetName;
}
public void setVetName(String vetName) {
VetName = vetName;
}



}