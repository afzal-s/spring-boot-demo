package com.bridgelabz.springbootdemo.service.serviceimpl;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bridgelabz.springbootdemo.model.Topic;
import com.bridgelabz.springbootdemo.service.ITopicService;

@Service
public class TopicServiceImpl implements ITopicService {
	
	 private List<Topic> topicsList = Arrays.asList(
				new Topic("S01", "Spring Framework", "Spring Framework Description"),
				new Topic("J01", "Java", "Java Description"),
				new Topic("C01", "C", "C Language Description")
				);

	@Override
	public List<Topic> getAllTopics() {
		return topicsList;
	}

	@Override
	public Topic getTopicById(String id) {
		return topicsList.stream().filter(topic -> topic.getId().equals(id)).findFirst().get();
	}

	 
}