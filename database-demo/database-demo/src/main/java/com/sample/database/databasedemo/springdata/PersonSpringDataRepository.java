package com.sample.database.databasedemo.springdata;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.database.databasedemo.entity.Person;

public interface PersonSpringDataRepository extends JpaRepository<Person, Integer>{

}
