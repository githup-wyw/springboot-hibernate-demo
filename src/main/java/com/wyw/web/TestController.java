package com.wyw.web;

import com.wyw.dao.UserMapper;
import com.wyw.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @description:
 * @author: WYW
 * @date: 2020/1/18 001821:07
 */
@RestController
public class TestController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/select")
    public List<User> select(@RequestParam String userId){
//        List<User> list = userMapper.select(userId);
        List<User> list = userMapper.findAll();
        System.out.println(list);
        return list;
    }

    @GetMapping("/insert")
    public User insert(){
        User user = new User();
        user.setUserId("222");
        user.setUserName("xingming");
        user.setUserPhone("phone");
        User user1 = userMapper.save(user);
        return user1;
    }

    @GetMapping("/findByUserName")
    public User findByUserName(){
        User user1 = userMapper.findByUserName("xingming");
        return user1;
    }
}
