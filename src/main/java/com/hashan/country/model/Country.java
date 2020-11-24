package com.hashan.country.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.type.TrueFalseType;

import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name = "country")
public class Country {
	@Id
	@ApiModelProperty(notes = "Id of the country", name = "id", required = true, value = "1" )
	private int id;
	

	@ApiModelProperty(notes = "Name of the country", name = "name", required = true, value = "Lorem" )
	private String name;
	
	public Country() {}
	
	public Country(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
