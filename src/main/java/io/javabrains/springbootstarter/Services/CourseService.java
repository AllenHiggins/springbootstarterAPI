package io.javabrains.springbootstarter.Services;

import io.javabrains.springbootstarter.Models.Course;
import io.javabrains.springbootstarter.Repositores.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

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

    public List<Course> getAllCourses(String topicId){
        List<Course> courses = new ArrayList<>();
        courseRepository.findByTopicId(topicId).forEach(courses::add);
        return courses;
    }

    public Course getCourse(String id){
        //return topics.stream().filter(topic -> topic.getId().equals(id)).findFirst().get();
        //courseRepository.findByName(id);
        return courseRepository.findOne(id);
    }

    public void addCourse(Course course){
        //topics.add(topic);
        courseRepository.save(course);
    }

    // removed - String id - as argument
    public void updateCourse(Course course) {
        /*for(int i = 0; i < topics.size(); ++i){
            Topic t = topics.get(i);
            if(t.getId().equals(id)){
                topics.set(i,topic);
                return;
            }
        }*/
        courseRepository.save(course);

    }

    public void deleteCourse(String id) {
        //topics.removeIf(topic -> topic.getId().equals(id));
        courseRepository.delete(id);
    }
}
