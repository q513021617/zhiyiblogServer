package cn.zhiyigo.pblog.Dao;

import cn.zhiyigo.pblog.Model.Article;
import cn.zhiyigo.pblog.Model.Banner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleDao extends JpaRepository<Article,Integer> {

}
