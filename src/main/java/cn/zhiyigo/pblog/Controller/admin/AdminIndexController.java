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

    @RequestMapping("/admin/admin_articleManage")
    public String articleManage(Map<String,Object> map){

        return "admin/articleManage";
    }

    @RequestMapping("/admin/admin_photomanage")
    public String photomanage(Map<String,Object> map){

        return "admin/photomanage";
    }

    @RequestMapping("/admin/admin_seomanage")
    public String seomanage(Map<String,Object> map){

        return "admin/seomanage";
    }
    @RequestMapping("/admin/admin_skilltree")
    public String skilltree(Map<String,Object> map){

        return "admin/skilltree";
    }
    @RequestMapping("/admin/admin_usermanager")
    public String usermanager(Map<String,Object> map){

        return "admin/usermanager";
    }
}
