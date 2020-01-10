package cn.zhiyigo.pblog.Dao;


import cn.zhiyigo.pblog.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Integer> {

}
