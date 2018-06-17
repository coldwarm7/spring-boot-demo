package com.dharma.demo.controller;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;


/**
 * Created by Coldwarm on 18/6/2.
 */
@Controller
@RequestMapping(value = "/file")
public class FileController {
    private static final Logger logger = LoggerFactory.getLogger(FileController.class);

//    private final String filePath = "/Users/xu/Downloads";
    @Value(value = "${dharma.fileurl}")
    private String filePath;

    @RequestMapping(value = "/upload")
    @ResponseBody
    public String upload(@RequestParam("dharmaFile") MultipartFile file){
        if (file.isEmpty()){
            return "file empty";
        }

        String fileName = file.getOriginalFilename();
        logger.info("file name: " + fileName);

        String suffixName = fileName.substring(fileName.lastIndexOf("."));
        logger.info("file suffix: " + suffixName);

        fileName = UUID.randomUUID() + suffixName;

        File dest = new File(filePath + fileName);

        if (!dest.getParentFile().exists()){
            dest.getParentFile().mkdirs();
        }

        try {
            file.transferTo(dest);
            return "<img src= '/upload/" +fileName + " ' />";
        }catch (IllegalStateException | IOException e){
            e.printStackTrace();
        }

        return "upload failed ";
    }
}
