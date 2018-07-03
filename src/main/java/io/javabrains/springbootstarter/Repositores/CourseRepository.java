package io.javabrains.springbootstarter.Repositores;

import io.javabrains.springbootstarter.Models.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String> {


}
