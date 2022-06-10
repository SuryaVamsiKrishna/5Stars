package com.petclinic.models;

public class Vet {
  private long id;
	private String name;
	private static long idCounter = 100; 
	
	public Vet( String name) {
		super();
		this.id = idCounter++;
		this.name = name;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Vet [id=" + id + ", name=" + name + "]";
	}
}
