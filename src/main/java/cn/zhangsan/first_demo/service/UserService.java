package cn.zhangsan.first_demo.service;

import cn.zhangsan.first_demo.dao.UserDao;
import cn.zhangsan.first_demo.model.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Create on 2021/5/17
 *
 **/
@Service
public class UserService {

    @Autowired
    UserDao userDao;

    public List<User> getAllUsers() {
        return userDao.findAll();
    }

    public String getUserPwd(int id) {
        return userDao.findPwdById(id);
    }

}
