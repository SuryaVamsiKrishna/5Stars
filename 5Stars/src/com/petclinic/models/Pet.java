package com.petclinic.models;

public class Pet {
private String name;
private String type;
private static long id = 100;
public Pet(String name, String type) {
this.name = name;
this.type = type;
this.id = id++;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public String getType() {
return type;
}
public void setType(String type) {
this.type = type;
}
public static long getId() {
return id;
}



@Override
public String toString() {
return "Pet [name=" + name + ", type=" + type + "]";
}
}
