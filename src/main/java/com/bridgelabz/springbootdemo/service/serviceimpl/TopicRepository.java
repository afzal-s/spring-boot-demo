package com.bridgelabz.springbootdemo.service.serviceimpl;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bridgelabz.springbootdemo.model.Topic;

//public interface TopicRepository extends CrudRepository<Topic, String>{}

@Repository
public interface TopicRepository extends JpaRepository<Topic, String> {

}
