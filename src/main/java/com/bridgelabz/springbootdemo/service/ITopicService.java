package com.bridgelabz.springbootdemo.service;

import java.util.List;
import java.util.Optional;

import com.bridgelabz.springbootdemo.model.Topic;

public interface ITopicService {

	List<Topic> getAllTopics();

	Optional<Topic> getTopicById(int id);

	void addTopic(Topic topic);

	void updateTopic(Topic topic, int id);

	void deleteTopicById(int id);

}
