package cn.zhiyigo.pblog.Dao;

import cn.zhiyigo.pblog.Model.Menu;
import cn.zhiyigo.pblog.Model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuDao extends JpaRepository<Menu,Integer> {
}
