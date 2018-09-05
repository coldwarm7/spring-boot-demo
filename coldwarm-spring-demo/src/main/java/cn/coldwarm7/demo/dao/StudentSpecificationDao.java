package cn.coldwarm7.demo.dao;

import cn.coldwarm7.demo.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Create by coldwarm on 2018/9/5.
 */

public interface StudentSpecificationDao extends JpaRepository<Student,Integer>,JpaSpecificationExecutor<Student> {
}
