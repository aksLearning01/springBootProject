package edu.akaskar.springboot.rest.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.akaskar.springboot.model.Topic;

@RestController
public class TopicController {

	@GetMapping("/topics")
	public List<Topic> getAllTopics() {

		return Arrays.asList(new Topic(1l, "Java", "Java 8 Tutorial"), new Topic(2l, "Angular4", "Angular 4 Tutorial"),
				new Topic(3l, "Big Data", "Hadoop Introduction"));
	}

}
