package cn.zhiyigo.pblog.Model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "menu")
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @Column(name = "menu_name")
    String menuName;
    @Column(name = "menu_url")
    String menuUrl;

}
