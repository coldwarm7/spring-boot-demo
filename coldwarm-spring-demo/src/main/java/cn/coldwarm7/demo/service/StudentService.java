package cn.coldwarm7.demo.service;

import cn.coldwarm7.demo.dao.StudentSpecificationDao;
import cn.coldwarm7.demo.domain.Student;
import com.github.wenhao.jpa.Specifications;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

/**
 * Create by coldwarm on 2018/9/5.
 *
 * 使用github上一个优化过的JPA动态查询库进行查询demo
 */
@Service
public class StudentService {
    @Autowired
    private StudentSpecificationDao studentSpecificationDao;

    //查询id在30到38之间
    public List<Student> findAll(Student student){
        Specification<Student> specification = Specifications.<Student>and()
                .between(Objects.nonNull(student.getId()),"id",30,38)
                .gt()
                .build();

        return studentSpecificationDao.findAll(specification);
    }
}
