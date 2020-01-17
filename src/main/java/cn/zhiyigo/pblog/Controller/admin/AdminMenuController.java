package cn.zhiyigo.pblog.Controller.admin;

import cn.zhiyigo.pblog.Controller.CommonController.CommonMenuController;
import cn.zhiyigo.pblog.Controller.CommonController.CommonUserController;
import cn.zhiyigo.pblog.Dao.MenuDao;
import cn.zhiyigo.pblog.Model.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/admin/menu")
public class AdminMenuController extends CommonMenuController {

    @Autowired
    private MenuDao menuDao;

}
