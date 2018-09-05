package cn.coldwarm7.demo.dao;

import cn.coldwarm7.demo.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Create by coldwarm on 2018/9/5.
 */
@Repository
public interface StudentDao extends JpaRepository<Student,Integer> {
    Student findById(int id);
}
