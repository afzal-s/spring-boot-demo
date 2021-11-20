package com.bridgelabz.springbootdemo.service;

import java.util.List;

import com.bridgelabz.springbootdemo.model.Topic;

public interface ITopicService {

	List<Topic> getAllTopics();

	Topic getTopicById(String id);

}
