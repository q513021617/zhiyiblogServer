package cn.zhiyigo.pblog.Model;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "article")
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name = "title")
    String title;
    @Column(name = "article_content")
    String articleContent;
    @Column(name = "article_comment_id")
    Integer articleCommentId;
}
