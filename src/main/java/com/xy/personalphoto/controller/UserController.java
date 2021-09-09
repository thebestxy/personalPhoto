package com.xy.personalphoto.controller;

import com.xy.personalphoto.dao.UserDAO;
import com.xy.personalphoto.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserDAO userDAO;

    @GetMapping( value = "/id={id}")
    public User getUserById(@PathVariable int id){
        User user = userDAO.selectUserById(id);
        System.out.println(user);
        return user;
    }

    @GetMapping( value = "/selctallusers")
    public List<User> selectAllUsers(){
        List<User> list =userDAO.selectAllUsers();
        System.out.println(list);
        return list;
    }

//    @GetMapping(value = "/deleteByOnlyStr={onlyStr}")
//    public int deleteFilm(@PathVariable String onlyStr){
//        System.out.println(onlyStr+"删除");
//        int i = filmService.deleteFilm(onlyStr);
//        return i;
//    }




}
