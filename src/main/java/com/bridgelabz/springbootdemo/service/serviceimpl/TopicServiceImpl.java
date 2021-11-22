package com.bridgelabz.springbootdemo.service.serviceimpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.springbootdemo.model.Topic;
import com.bridgelabz.springbootdemo.repository.TopicRepository;
import com.bridgelabz.springbootdemo.service.ITopicService;

@Service
public class TopicServiceImpl implements ITopicService {
	
	@Autowired
	private TopicRepository topicRepository;

	@Override
	public List<Topic> getAllTopics() {
		List<Topic> topicsList = new ArrayList<>();
		topicRepository.findAll().forEach(topicsList::add);
		return topicsList;
	}

	@Override
	public Optional<Topic> getTopicById(int id) {
		return topicRepository.findById(id);
	}

	@Override
	public void addTopic(Topic topic) {
		topicRepository.save(topic);
	}

	@Override
	public void updateTopic(Topic topic, int id) {
		Optional<Topic> topicId = topicRepository.findById(id);
		if (topicId.isPresent()) {
			topicId.get().setId(topic.getId());
			topicId.get().setName(topic.getName());
			topicId.get().setDescription(topic.getDescription());
			topicRepository.save(topicId.get());
		}
	}

	@Override
	public void deleteTopicById(int id) {
		topicRepository.deleteById(id);
	}

	 
}