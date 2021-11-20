package com.bridgelabz.springbootdemo.topics;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class TopicController {
	
	@GetMapping("/topics")
	public List<Topic> getAllTopics(){
		return Arrays.asList(
				new Topic("S01", "Spring Framework", "Spring Framework Description"),
				new Topic("J01", "Java", "Java Description"),
				new Topic("C01", "C", "C Language Description")
				);
	}
}
