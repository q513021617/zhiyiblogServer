package cn.zhiyigo.pblog.Dao;

import cn.zhiyigo.pblog.Model.Article;
import cn.zhiyigo.pblog.Model.Banner;
import cn.zhiyigo.pblog.Model.WebUser;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleDao extends JpaRepository<Article,Integer> {

    Page<Article> findAll(Pageable pageable);
}
