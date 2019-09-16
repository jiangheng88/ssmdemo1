package cn.qst.ssmdemo.service;

import cn.qst.ssmdemo.entity.User;

public interface UserService {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    /*登录的方法*/
    public User dologin(User user);
}
