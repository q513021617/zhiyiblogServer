package cn.zhiyigo.pblog.Controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class AdminIndexController {

    @RequestMapping("/admin/")
    public String index(Map<String,Object> map){

        return "admin/adminIndex";
    }

}
