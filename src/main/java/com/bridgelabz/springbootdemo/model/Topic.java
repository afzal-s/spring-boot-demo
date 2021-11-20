package com.bridgelabz.springbootdemo.model;

//import javax.persistence.Entity;
//import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
//@Entity
@AllArgsConstructor
public class Topic {
	
//	@Id
	private String id;
	private String name;
	private String description;
}
