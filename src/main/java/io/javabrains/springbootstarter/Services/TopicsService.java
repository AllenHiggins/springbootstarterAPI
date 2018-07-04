package io.javabrains.springbootstarter.Services;
import io.javabrains.springbootstarter.Models.Topic;
import io.javabrains.springbootstarter.Repositores.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

// singelton
@Service
public class TopicsService {

    @Autowired
    private TopicRepository topicRepository;

   /* List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic(
                    "spring",
                    "Spring Framework",
                    "Spring Framework Description"),
            new Topic(
                    "java",
                    "Java Core",
                    "Java Core Description")
    ));*/

    public List<Topic> getAllTopics(){
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }

    public Topic getTopic(String id){
        //return topics.stream().filter(topic -> topic.getId().equals(id)).findFirst().get();
        return topicRepository.findOne(id);
    }

    public void addTopic(Topic topic){
        //topics.add(topic);
        topicRepository.save(topic);
    }

    // removed - String id - as argument
    public void updateTopic(Topic topic) {
        /*for(int i = 0; i < topics.size(); ++i){
            Topic t = topics.get(i);
            if(t.getId().equals(id)){
                topics.set(i,topic);
                return;
            }
        }*/
        topicRepository.save(topic);

    }

    public void deleteTopic(String id) {
        //topics.removeIf(topic -> topic.getId().equals(id));
        topicRepository.delete(id);
    }

}
