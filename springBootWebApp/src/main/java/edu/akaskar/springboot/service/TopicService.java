package edu.akaskar.springboot.service;

import java.util.List;

import edu.akaskar.springboot.model.Topic;

public interface TopicService {
	
	
	public List<Topic> getAllTopics();
	
	public Topic getTopicWithId(Long id);

}
