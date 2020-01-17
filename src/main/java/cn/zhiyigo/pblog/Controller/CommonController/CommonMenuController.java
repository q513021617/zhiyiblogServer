package cn.zhiyigo.pblog.Controller.CommonController;

import cn.zhiyigo.pblog.Dao.MenuDao;
import cn.zhiyigo.pblog.Dao.RoleDao;
import cn.zhiyigo.pblog.Model.Menu;
import cn.zhiyigo.pblog.Model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class CommonMenuController {

    @Autowired
    private MenuDao menuDao;


    @GetMapping("/")
    public List<Menu> getMenuList(){

        return menuDao.findAll();
    }

    @GetMapping("/{id}")
    public Menu getMenuByid(@PathVariable("id")Integer id){

        return  menuDao.findById(id).get();
    }

    @PutMapping("/")
    public Menu updateMenu(Menu menu){


        return  menuDao.save(menu);
    }

    @PostMapping("/")
    public Menu addRole(Menu menu){


        return  menuDao.save(menu);
    }

    @DeleteMapping("/")
    public void delOneRole(Menu menu){

        menuDao.delete(menu);
    }

    @DeleteMapping("/all")
    public void delAllRole(){

        menuDao.deleteAll();
    }
}
