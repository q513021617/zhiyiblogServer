package cn.zhiyigo.pblog.Model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "username")
    String username;

    @Column(name = "password")
    String password;

    @Column(name = "sex")
    Integer sex;

    @Column(name = "email")
    String email;

    @Column(name = "role")
    Integer role;

}
