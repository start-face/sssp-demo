package com.sss.model;
import com.google.common.base.MoreObjects;

import javax.persistence.*;
import java.util.Date;

/**
 * @author Lenovo
 * @Created 2018-08-08 16:40
 **/
@Entity
@Table(name="user")
public class UserModel implements java.io.Serializable {

//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String userName;
    private String passWord;
    private String phone;
    private Date addTime;
    private Integer status;

    public UserModel() {
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", id)
                .add("userName", userName)
                .add("passWord", passWord)
                .add("phone", phone)
                .add("addTime", addTime)
                .add("status", status)
                .toString();
    }

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public UserModel setId(Long id) {
        this.id = id;
        return this;
    }

    public String getUserName() {
        return userName;
    }

    public UserModel setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getPassWord() {
        return passWord;
    }

    public UserModel setPassWord(String passWord) {
        this.passWord = passWord;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public UserModel setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public Date getAddTime() {
        return addTime;
    }

    public UserModel setAddTime(Date addTime) {
        this.addTime = addTime;
        return this;
    }

    public Integer getStatus() {
        return status;
    }

    public UserModel setStatus(Integer status) {
        this.status = status;
        return this;
    }
}
