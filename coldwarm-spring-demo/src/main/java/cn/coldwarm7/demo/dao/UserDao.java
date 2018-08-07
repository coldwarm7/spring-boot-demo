package cn.coldwarm7.demo.dao;

import cn.coldwarm7.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Create by coldwarm on 2018/8/7.
 */
@Repository
public interface UserDao extends JpaRepository<User,Integer> {
}
