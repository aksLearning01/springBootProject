package edu.akaskar.springboot.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import edu.akaskar.springboot.model.Topic;

@Service("TopicService")
public class TopicServiceImpl implements TopicService {

	private List<Topic> topicsList = new ArrayList<>(Arrays.asList(new Topic(1l, "Java", "Java 8 Tutorial"),
			new Topic(2l, "Angular4", "Angular 4 Tutorial"), new Topic(3l, "Big Data", "Hadoop Introduction")));

	public List<Topic> getAllTopics() {
		return topicsList;
	}

	public Topic getTopicWithId(Long id) {
		Topic topic = null;
		try {
			topic = topicsList.stream().filter(x -> x.getId().equals(id)).findFirst().get();
			return topic;
		} catch (Exception e) {
			return topic;
		}
	}

	public void addTopic(Topic topic) {
		topicsList.add(topic);
		topicsList.forEach(System.out::println);
	}

}
