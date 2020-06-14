package cn.yykjc.demo.user.service;

import cn.yykjc.demo.user.entity.UserEntity;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Map;

public interface UserService {
    List<UserEntity> getAll(Map map);

    void delById(Integer id);

    //保存用户
    public void save(UserEntity userEntity);

    //根据id查询用户信息
    public UserEntity getUserById(Integer id);

    //根据id修改用户信息
    public String updateUserById(@RequestBody UserEntity userEntity);
}
