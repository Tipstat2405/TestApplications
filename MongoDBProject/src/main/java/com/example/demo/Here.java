package com.example.demo;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class Here {
	
	@Id
    private Integer id;
	private String name;
    private String age;
    private String surname;
    private String address;
	public Here(Integer id, String name, String age, String surname, String address) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.surname = surname;
		this.address = address;
	}
	public Here(String name, String age, String surname, String address) {
		super();
		this.name = name;
		this.age = age;
		this.surname = surname;
		this.address = address;
	}
    
	
    
    
	
}
