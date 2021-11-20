package com.bridgelabz.springbootdemo.service;

import java.util.List;

import com.bridgelabz.springbootdemo.model.Topic;

public interface ITopicService {

	List<Topic> getAllTopics();

	Topic getTopicById(String id);

	void addTopic(Topic topic);

	void updateTopic(Topic topic, String id);

	void deleteTopicById(String id);

}
