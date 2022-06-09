package com.petclinic.models;

import java.util.*;




public class Owner {
private static long id =1000;
private String name;
private String adress;
private String city;
private String phone;
private Set<Pet> petSet= new HashSet<>();
private static HashMap<Long, Set<Pet>> petMap = new HashMap<>();
// Give the pet details at the time of creating an object to the Owner class.
//OR
// Create owner class, without initiating the pet set. Then for a given id, add the particular pet to the set of that owner.
public Owner(long id, String name, String adress, String city, String phone) {
//super();
this.id = id++;
this.name = name;
this.adress = adress;
this.city = city;
this.phone = phone;
petMap.put(this.id,this.petSet);

}
public long getId() {
return id;
}



public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public String getAdress() {
return adress;
}
public void setAdress(String adress) {
this.adress = adress;
}
public String getCity() {
return city;
}
public void setCity(String city) {
this.city = city;
}
public String getPhone() {
return phone;
}
public void setPhone(String phone) {
this.phone = phone;
}
public Set<Pet> getPetSet() {
return petSet;
}
//public void setPetSet(Set<Pet> petSet) {
// this.petSet = petSet;}



@Override
public String toString() {
return "Owner [id=" + id + ", name=" + name + ", adress=" + adress + ", city=" + city + ", phone=" + phone + "]";
}
@Override
public int hashCode() {
return Objects.hash(adress, city, id, name, phone);
}
@Override
public boolean equals(Object obj) {
if (this == obj)
return true;
if (obj == null)
return false;
if (getClass() != obj.getClass())
return false;
Owner other = (Owner) obj;
return Objects.equals(adress, other.adress) && Objects.equals(city, other.city) && id == other.id
&& Objects.equals(name, other.name) && Objects.equals(phone, other.phone);



}



public void createPetSet(long id,String name, String type) {
Pet myPet = new Pet(name, type);
petMap.get(id).add(myPet);
//Map contains id as key and set of pets as value
//map.containsKey(key) && Objects.equals(map.get(key), oldValue)) {



}



}
