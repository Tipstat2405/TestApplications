package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.MongoTemplate;

@SpringBootApplication
public class MongoDbProjectApplication implements CommandLineRunner{

	@Autowired
	private MongoTemplate mt;
	public static void main(String[] args) {
		SpringApplication.run(MongoDbProjectApplication.class, args);
		System.out.println("Hi I am Vengalarayudu");
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		mt.save(new Here(500, "Core Java", "yfgyjgh", "Kathy Sierra", "hhuh"));
		mt.insertAll(List.of(new Here(67,"Rayudu","vsxzcsdx","sdfsdsdf","sdfsd"),new Here(34,"dzcvzx", "dsfsds", "adfsads", "aedfasdsd"),new Here(10,"dzcvzx", "dsfsds", "adfsads", "aedfasdsd")));
		
//	    mt.save(new Book(501, "JSP & Servlets", 350, "Kathy Sierra", 1749.0));
//	 // mt.save(new Book(501, "JSP & Servlets", 350, "Kathy Sierra", 1749.0),"Book"); // save () with collection name 'Book'
//	    mt.save(new Book(502, "Spring in Action", 480, "Craig Walls", 940.75));
//	    mt.save(new Book(503, "Pro Angular", 260, "Freeman", 1949.25));
//	    mt.save(new Book(504, "HTML CSS", 100, "Thomas Powell", 2317.09));
//	    mt.save(new Book(505, "Hibernate in Action", 180, "Gavin King", 889.25));
//	    mt.save(new Book(506, "Practical MongoDB", 180, "Shakuntala Gupta", 785.0));
//	    mt.save(new Book(507, "Pro Spring Boot", 850, "Felipe Gutierrez", 2167.99));
//	    mt.save(new Book(508, "Beginning jQuery", 180, "Franklin", 1500.00));
//	    mt.save(new Book(509, "Java Design Patterns", 114, "Devendra Singh", 919.99));

	    System.out.println("------All records has been saved successfully-------");
	}

}
