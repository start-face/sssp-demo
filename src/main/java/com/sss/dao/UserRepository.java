package com.sss.dao;

import com.sss.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Lenovo
 * @Created 2018-08-09 15:47
 **/
//public interface UserRepository extends CrudRepository<UserModel,Long> {
//public interface UserRepository extends JpaRepository<UserModel,Long>, JpaSpecificationExecutor<UserModel> {
public interface UserRepository extends JpaRepository<UserModel,Long> {
}
