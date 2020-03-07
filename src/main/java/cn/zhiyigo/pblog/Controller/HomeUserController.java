package cn.zhiyigo.pblog.Controller;

import cn.zhiyigo.pblog.Controller.CommonController.CommonUserController;
import cn.zhiyigo.pblog.Dao.UserDao;
import cn.zhiyigo.pblog.Model.WebUser;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Optional;

@RestController
@RequestMapping("/api/user")
public class HomeUserController {

    @Autowired
    private UserDao userDao;

    @PostMapping("/api/login")
    public Object userlogin(WebUser webUser){

        WebUser tempWebUser =userDao.findByemail(webUser.getEmail());

        if (tempWebUser != null && tempWebUser.getPassword().equals(webUser.getPassword())) {


            return tempWebUser;
        }
        return null;
    }

    @GetMapping("/{id}")
    public WebUser getUserByid(@PathVariable("id")Integer userid){

        Optional<WebUser> tempuser=userDao.findById(userid);
        return tempuser.orElse(null);
    }

    @PostMapping("/login")
    public Object adminlogin(WebUser webUser){

        WebUser tempWebUser =userDao.findByusername(webUser.getUsername());

        if (tempWebUser != null && tempWebUser.getPassword().equals(webUser.getPassword())) {


            return tempWebUser;
        }
        return null;
    }

    @PostMapping("/api/isExtisUser")
    public Object isExtisUser(WebUser webUser){

        WebUser tempWebUser = userDao.findByemail(webUser.getEmail());


        if (tempWebUser != null) {


            return true;
        }

        return false;
    }

    @PostMapping("/api/register")
    public Object userRegister(WebUser webUser){

        return userDao.save(webUser);
    }
}
