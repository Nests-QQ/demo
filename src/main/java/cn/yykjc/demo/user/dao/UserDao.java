package cn.yykjc.demo.user.dao;

import cn.yykjc.demo.user.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Map;
import java.util.List;
@Mapper
public interface UserDao {
    List<UserEntity> getAll(@Param("content") Map map);

    void delById(Integer id);

    void save(UserEntity userEntity);

    public  UserEntity getUserById(Integer id);

    public String updateUserById(UserEntity userEntity);
}
