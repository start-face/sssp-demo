package com.sss.service;

import com.sss.model.UserModel;
import com.sss.tools.PageInfo;

import java.util.List;

/**
 * @author Lenovo
 * @Created 2018-08-09 15:30
 **/
public interface UserService {

    List<UserModel> getList(UserModel userModel);

    PageInfo<UserModel> findPage(UserModel userModel, Integer pageSize, Integer currentPage);

    boolean updateOne(UserModel userModel);

    boolean deleteOne(Long id);

    UserModel insertUser(UserModel userModel);
}
