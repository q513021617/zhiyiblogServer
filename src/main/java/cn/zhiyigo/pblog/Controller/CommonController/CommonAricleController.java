package cn.zhiyigo.pblog.Controller.CommonController;

import cn.zhiyigo.pblog.Dao.ArticleDao;
import cn.zhiyigo.pblog.Model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class CommonAricleController {

        @Autowired
       private ArticleDao articleDao;

    @GetMapping("/")
    public List<Article> getArticleList(){

        return articleDao.findAll();
    }

    @GetMapping("/{id}")
    public Article getArticleByid(@PathVariable("id")Integer id){

        return  articleDao.findById(id).get();
    }

    @PutMapping("/")
    public Article updateMenu(Article article){


        return  articleDao.save(article);
    }

    @PostMapping("/")
    public Article addArticle(Article article){


        return  articleDao.save(article);
    }

    @DeleteMapping("/")
    public void delOneArticle(Article article){

        articleDao.delete(article);
    }

    @DeleteMapping("/all")
    public void delAllArticle(){

        articleDao.deleteAll();
    }
}
