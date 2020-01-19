package com.wyw.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @program: modules-demo
 * @description: User
 * @author: Mr.WYW
 * @create: 2020-01-15 17:
 */
@Data
@Entity(name = "user")
public class User {

    @Id
    @Column(name="user_id")
    private String userId;
    @Column(name="user_name")
    private String userName;
    @Column(name="user_phone")
    private String userPhone;
}
