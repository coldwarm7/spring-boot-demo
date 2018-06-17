package com.dharma.demo.controller;

import com.dharma.demo.dao.FeedbackRepository;
import com.dharma.demo.model.Feedback;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Coldwarm on 18/6/17.
 */
@RestController
@RequestMapping("/feedback")
public class FeedbackController {

    private static final Logger logger = LoggerFactory.getLogger(FileController.class);

    private final FeedbackRepository feedbackRepository;

    public FeedbackController(FeedbackRepository feedbackRepository){
        this.feedbackRepository = feedbackRepository;
    }

//    @RequestMapping(value = "",method = RequestMethod.GET)
    @GetMapping("/getAll")
    public List<Feedback> getAllFeedbacks(){
        logger.info("get all Feedbacks");
        return feedbackRepository.findAll();
    }

    @GetMapping("/{feedbackId}")
    public Feedback getFeedbackById(@PathVariable String feedbackId){
        logger.info("get Feedback by id = " + feedbackId);
        return feedbackRepository.findById(feedbackId).orElse(null);
    }
}
