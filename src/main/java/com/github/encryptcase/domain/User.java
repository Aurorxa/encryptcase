package com.github.encryptcase.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

/**
 * @author 尼古拉斯·亚历山大·许大仙
 * @version 1.0
 * @since 2023-02-22 15:22
 */
@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name="tb_user")
@ToString(callSuper = false)
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    private String username;
    private String password;

}
