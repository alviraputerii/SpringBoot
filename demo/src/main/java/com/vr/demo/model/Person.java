package com.vr.demo.model;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Person {
	private final UUID id;
	private final String name;
	private final String address;
	
	
	public Person(@JsonProperty("id") UUID id, 
				  @JsonProperty("name") String name,
				  @JsonProperty("address") String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public UUID getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	

}
