package com.github.encryptcase.service.impl;

import com.github.encryptcase.dao.UserDao;
import com.github.encryptcase.domain.User;
import com.github.encryptcase.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @author 尼古拉斯·亚历山大·许大仙
 * @version 1.0
 * @since 2023-02-22 15:26
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public void addUser(User user) {
        userDao.save(user);
    }

    @Override
    public void delUser(Integer id) {
        userDao.deleteById(id);
    }

    @Override
    public void updateUser(User user) {
        userDao.save(user);
    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public User findById(Integer id) {
        return userDao.findById(id).orElseThrow(() -> new RuntimeException("用户不存在"));
    }
}
