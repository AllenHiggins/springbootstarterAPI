package io.javabrains.springbootstarter.Repositores;

import io.javabrains.springbootstarter.Models.Topic;
import org.springframework.data.repository.CrudRepository;
// Common CRUD is implemented by default
// Only need to implement none common opp's
public interface TopicRepository extends CrudRepository<Topic, String> {

}
