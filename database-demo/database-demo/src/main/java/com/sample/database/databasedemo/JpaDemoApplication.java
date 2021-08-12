package com.sample.database.databasedemo;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import com.sample.database.databasedemo.entity.Person;
import com.sample.database.databasedemo.jpa.PersonJpaRepository;

//@SpringBootApplication
public class JpaDemoApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonJpaRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(JpaDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		 logger.info("All users -> {}", repository.findAll());
		 logger.info("User id 10001 -> {}", repository.findById(10001));
		 logger.info("Inserting -> {}", repository.insert(new Person("Tara", "Berlin", new Date())));
		 logger.info("Update 10003 -> {}", repository.update(new Person(10003, "Peter", "Utrecht", new Date())));
		 repository.deleteById(10002);
	}

}
