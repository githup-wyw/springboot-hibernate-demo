package com.wyw.dao;

import com.wyw.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Table;
import java.util.List;

/**
 * @description:
 * @author: WYW
 * @date: 2020/1/18 001821:49
 *
 * CrudRepository<User,String>  <对象，表主键>
 * JpaRepository<User,String>
 *     以上两个继承类封装了一些对数据库的基本操作：增伤改查等等
 */
@Repository
public interface UserMapper extends JpaRepository<User,String> {

    @Query("select u from user u where user_id = :userId")
    List<User> select(@Param("userId") String userId);

    List<User> findAll();

    @Transactional
    //@Query(value = "insert into user value(?,?,?)",nativeQuery = true)
    User save(User user);

    User findByUserName(String userName);


}
