package com.sss.service.impl;

import com.sss.dao.UserRepository;
import com.sss.model.UserModel;
import com.sss.service.UserService;
import com.sss.tools.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Lenovo
 * @Created 2018-08-09 15:30
 **/
//@Service("userService")
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public List<UserModel> getList(UserModel userModel) {
//        return userRepository.;
        return null;
    }

    @Override
    public PageInfo<UserModel> findPage(UserModel userModel, Integer pageSize,Integer currentPage) {
        Sort sort = new Sort(Sort.Direction.DESC, "addTime");
        Example<UserModel> example = Example.of(userModel);
        Pageable pageable = new PageRequest(currentPage-1, pageSize,sort);
        //总记录数
        long totalCount = userRepository.count(example);
        Page<UserModel> page = userRepository.findAll(example, pageable);
        int totalPage = countTotalPage(pageSize, (int) totalCount);
        return new PageInfo<>(pageSize,currentPage,totalCount,totalPage,page.getContent());
    }

    /**
     * 计算总页数,静态方法,供外部直接通过类名调用
     *
     * @param pageSize   每页记录数
     * @param totalCount 总记录数
     * @return 总页数
     */
    private int countTotalPage(final int pageSize, final int totalCount) {
        return totalCount % pageSize == 0 ? totalCount / pageSize : totalCount / pageSize + 1;
    }

    @Override
    public boolean updateOne(UserModel userModel) {
        UserModel save = userRepository.save(userModel);
        return save != null;
    }

    @Override
    public boolean deleteOne(Long id) {
        try {
            userRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public UserModel insertUser(UserModel userModel) {
        return userRepository.save(userModel);
    }
}
