package cn.zhiyigo.pblog.Controller.admin;

import cn.zhiyigo.pblog.Controller.CommonController.CommonUserController;
import cn.zhiyigo.pblog.Dao.UserDao;
import cn.zhiyigo.pblog.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.relational.core.sql.In;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin/user")
public class AdminUserController extends CommonUserController{

    @Autowired
    private UserDao userDao;



}
