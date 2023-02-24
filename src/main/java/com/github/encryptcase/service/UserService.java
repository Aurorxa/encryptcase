package com.github.encryptcase.service;

import com.github.encryptcase.domain.User;

import java.util.List;

/**
 * @author 尼古拉斯·亚历山大·许大仙
 * @version 1.0
 * @since 2023-02-22 15:26
 */
public interface UserService {
    void addUser(User user);

    void delUser(Integer id);

    void updateUser(User user);

    List<User> findAll();

    User findById(Integer id);
}
