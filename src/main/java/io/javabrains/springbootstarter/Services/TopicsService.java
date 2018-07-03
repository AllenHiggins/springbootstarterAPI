package io.javabrains.springbootstarter.Services;

import io.javabrains.springbootstarter.Models.Topic;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

// singelton
@Service
public class TopicsService {
    List<Topic> topics = Arrays.asList(
            new Topic(
                    "spring",
                    "Spring Framework",
                    "Spring Framework Description"),
            new Topic(
                    "java",
                    "Java Core",
                    "Java Core Description")
    );

    public List<Topic> getAllTopics(){
        return topics;
    }
}
