package com.github.encryptcase.dao;

import com.github.encryptcase.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author 尼古拉斯·亚历山大·许大仙
 * @version 1.0
 * @since 2023-02-22 15:25
 */
public interface UserDao extends JpaRepository<User, Integer> {

}
