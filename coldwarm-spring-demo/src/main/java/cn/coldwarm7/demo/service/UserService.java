package cn.coldwarm7.demo.service;

import cn.coldwarm7.demo.dao.UserDao;
import cn.coldwarm7.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Create by coldwarm on 2018/8/7.
 */
@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public List<User> findAll(){
        return userDao.findAll();
    }
}
