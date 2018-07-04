package io.javabrains.springbootstarter.Repositores;

import io.javabrains.springbootstarter.Models.Course;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course, String> {

    public List<Course> findByTopicId(String topicId);

}
