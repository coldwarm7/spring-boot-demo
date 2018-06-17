package com.dharma.demo.dao;

import com.dharma.demo.model.Feedback;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Coldwarm on 18/6/17.
 */
@Repository
public interface FeedbackRepository extends MongoRepository<Feedback,String> {
}
