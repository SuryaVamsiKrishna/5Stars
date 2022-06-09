package com.petclinic.repository;

import java.util.HashSet;
import java.util.Optional;

import com.petclinic.models.*;
import java.util.Set;

public class OwnerRepository {
	private Set<Owner> owners;
	
	public OwnerRepository() {
		this.owners = new HashSet<>();
	}
	
	public Owner addOwner(Owner Owner) {
		this.owners.add(Owner);
		return Owner;
	}
	
	public Set<Owner> fetchAllOwners(){
		return this.owners;
	}
	
	public Optional<Owner> findOwnerById(int OwnerId) {
		return this.owners.stream()
				.filter(Owner -> Owner.getId() == OwnerId)
				.findAny();
	}
	
	public void deleteOwnerById(int empId) {
		this.owners.removeIf(Owner -> Owner.getId() == empId);
	}

}
