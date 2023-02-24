package com.github.encryptcase.init;

import cn.hutool.core.collection.CollUtil;
import com.github.encryptcase.domain.User;
import com.github.encryptcase.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author 尼古拉斯·亚历山大·许大仙
 * @version 1.0
 * @since 2023-02-22 15:39
 */
@Order(1)
@Component
public class DefaultCommandLineRunner implements CommandLineRunner {

    @Autowired
    private UserService userService;

    @Override
    public void run(String... args) throws Exception {
        List<User> userList = userService.findAll();
        if (CollUtil.isEmpty(userList)) {
            User u1 = new User();
            u1.setUsername("zhangsan");
            u1.setPassword("123456");
            userService.addUser(u1);
            User u2 = new User();
            u2.setUsername("lisi");
            u2.setPassword("123456");

            userService.addUser(u2);
        }
    }
}
