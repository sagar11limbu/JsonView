package com.infodev.entities;

import javax.persistence.*;

/**
 * Created by reddevil on 2/12/2017.
 */

@Entity
@Table(name="Users")
public class User {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;

    @Column(name="username")
    private String username;


    @Column(name="password")
    private String password;

    public User(){

    }

    public User(int id,String username,String password){
        this.id=id;
        this.username=username;
        this.password=password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    }
