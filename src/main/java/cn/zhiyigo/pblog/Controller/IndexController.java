package cn.zhiyigo.pblog.Controller;

import cn.zhiyigo.pblog.Dao.UserDao;
import cn.zhiyigo.pblog.Model.QiNiu;
import com.qiniu.util.Auth;
import com.qiniu.util.StringMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;
import java.util.UUID;

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

    @RequestMapping("/getQiniuToken")
    @ResponseBody
    public QiNiu getQiniuToken(){
        QiNiu qiNiu = new QiNiu();
        String accessKey = "M6xnfG6jheYvd0gLHKkaZJztEGxmC5UW1jrfYjVG";
        String secretKey = "j2i1juXzp-Qg4yOuUNTcK362dAuPF1NY41UFdXyU";
        String bucket = "zhiyigo";
        long expireSeconds = 600;   //过期时间
        StringMap putPolicy = new StringMap();
        Auth auth = Auth.create(accessKey, secretKey);
        String upToken = auth.uploadToken(bucket,null, expireSeconds,putPolicy);
        qiNiu.setKey(UUID.randomUUID().toString().replaceAll("\\-", ""));
        qiNiu.setToken(upToken);
        return qiNiu;
    }

}
