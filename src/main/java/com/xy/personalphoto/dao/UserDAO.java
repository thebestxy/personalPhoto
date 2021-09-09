package com.xy.personalphoto.dao;

import com.xy.personalphoto.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDAO {
    User selectUserById(int userID);
    List<User> selectAllUsers();
}
