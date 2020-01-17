package cn.zhiyigo.pblog.Controller;

import cn.zhiyigo.pblog.Controller.CommonController.CommonMenuController;
import cn.zhiyigo.pblog.Dao.MenuDao;
import cn.zhiyigo.pblog.Model.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/menu")
public class HomeMenuController extends CommonMenuController {

    @Autowired
    private MenuDao menuDao;


}
