package cn.zhiyigo.pblog.Controller;

import cn.zhiyigo.pblog.Controller.CommonController.CommonUserController;
import cn.zhiyigo.pblog.Dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class HomeUserController extends CommonUserController {

    @Autowired
    private UserDao userDao;


}
