package edu.akaskar.springboot.rest.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import edu.akaskar.springboot.model.Topic;
import edu.akaskar.springboot.service.TopicService;

@RestController
public class TopicController {

	@Autowired
	TopicService topicService;

	@GetMapping("/topics")
	public List<Topic> getAllTopics() {

		return topicService.getAllTopics();
	}

	@GetMapping("/topics/{topicId}")
	public Topic getSpecificTopic(@PathVariable("topicId") Long topicId) {
		if (null != topicService.getTopicWithId(topicId))
			return topicService.getTopicWithId(topicId);
		else {
			return new Topic(0l, "Not found", "Not found");
		}
	}

}
