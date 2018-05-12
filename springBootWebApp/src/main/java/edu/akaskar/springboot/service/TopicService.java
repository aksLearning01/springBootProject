package edu.akaskar.springboot.service;

import java.util.List;

import edu.akaskar.springboot.model.Topic;

public interface TopicService {

	public List<Topic> getAllTopics();

	public Topic getTopicWithId(Long id);

	public void addTopic(Topic topic);

	public void updateTopic(Topic topic, Long topicId);

	public void deleteTopic(Long topicId);

}
