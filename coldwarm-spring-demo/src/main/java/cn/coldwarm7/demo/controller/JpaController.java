package cn.coldwarm7.demo.controller;

import cn.coldwarm7.demo.dao.StudentDao;
import cn.coldwarm7.demo.domain.Student;
import cn.coldwarm7.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Create by coldwarm on 2018/9/5.
 */
@RestController
@RequestMapping("/jpa")
public class JpaController {

    @Autowired
    private StudentDao studentDao;

    @Autowired
    private StudentService studentService;

    @GetMapping("/findById")
    public Student findById(@RequestParam Integer id){
        StudentService studentService = new StudentService();
        return studentDao.findById(id).orElse(new Student());
    }

    @GetMapping("/findAll")
    public List<Student> findAll(){
        return studentService.findAll(new Student());
    }
}
