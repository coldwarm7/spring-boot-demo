package cn.coldwarm7.demo.service;

import cn.coldwarm7.demo.dao.UserDao;
import cn.coldwarm7.demo.domain.Users;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * mvc
 * m model domain
 * v view 前端
 * c controller
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public  List<Users> findAll(){
        return userDao.findAll();

    }
}
