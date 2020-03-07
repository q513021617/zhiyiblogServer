package cn.zhiyigo.pblog.Controller;

import cn.zhiyigo.pblog.Dao.ArticleDao;
import cn.zhiyigo.pblog.Model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/aricle")
public class HomeAricleController  {
    @Autowired
    private ArticleDao articleDao;

    @GetMapping("/{page}/{size}")
    public Iterable<Article> getUserList(@PathVariable("page")String page, @PathVariable("size")int size){
        Pageable pageable = new PageRequest(Integer.parseInt(page),size);

        return articleDao.findAll(pageable);
    }


    @GetMapping("/{id}")
    public Article getArticleByid(@PathVariable("id")Integer id){

        return  articleDao.findById(id).get();
    }

}
