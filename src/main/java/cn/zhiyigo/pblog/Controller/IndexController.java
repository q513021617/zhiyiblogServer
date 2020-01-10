package cn.zhiyigo.pblog.Controller;

import cn.zhiyigo.pblog.Dao.UserDao;
import cn.zhiyigo.pblog.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@Controller
public class IndexController {

    @Autowired
    UserDao userDao;



    @RequestMapping("/")
    public String index(Map<String,Object> map){
//        List<User> userList=userDao.findAll();
//        map.put("data",userList);
        return "index";
    }

}