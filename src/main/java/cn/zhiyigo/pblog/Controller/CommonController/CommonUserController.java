package cn.zhiyigo.pblog.Controller.CommonController;

import cn.zhiyigo.pblog.Dao.UserDao;
import cn.zhiyigo.pblog.Model.User;
import org.hibernate.criterion.Example;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.internal.SessionImpl;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

public class CommonUserController {

    @Autowired
    private UserDao userDao;

    @GetMapping("/")
    public List<User> getUserList(){

        return userDao.findAll();
    }

    @GetMapping("/{id}")
    public User getUserByid(@PathVariable("id")Integer userid){

        return  userDao.findById(userid).get();
    }

    @PutMapping("/")
    public User updateUser(User user){


        return  userDao.save(user);
    }

    @PostMapping("/")
    public User addUser(User user){


        return  userDao.save(user);
    }

    @DeleteMapping("/")
    public void delOneUser(User user){

        userDao.delete(user);
    }

    @DeleteMapping("/all")
    public void delAllUser(){

        userDao.deleteAll();
    }

    @PostMapping("/login")
    public boolean userlogin(User user){

        return userDao.findByusername(user.getUsername()).getPassword().equals(user.getPassword());
    }

}
