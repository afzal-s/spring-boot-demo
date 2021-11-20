package com.bridgelabz.springbootdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.springbootdemo.model.Topic;
import com.bridgelabz.springbootdemo.service.ITopicService;

@RestController
@RequestMapping("/home")
public class TopicController {
	
	@Autowired
	private ITopicService topicService;
	
	@GetMapping("/topics")
	public List<Topic> getAllTopics(){
		return topicService.getAllTopics();
	}
	
	@GetMapping("/topics/{id}")
	public Topic getTopicById(@PathVariable String id) {
		return topicService.getTopicById(id);
	}
	
	@PostMapping("/topics")
	public void addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);
	}
	
	@PutMapping("/topics/{id}")
	public void updateTopic(@RequestBody Topic topic, @PathVariable String id) {
		topicService.updateTopic(topic, id);
	}
	
	@DeleteMapping("/topics/{id}")
	public void deleteTopicById(@PathVariable String id) {
		topicService.deleteTopicById(id);
	}
}