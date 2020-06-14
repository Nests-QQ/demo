package cn.yykjc.demo.user.controller;

import cn.yykjc.demo.user.entity.UserEntity;
import cn.yykjc.demo.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.List;
import java.util.Map;
/*
* @RestController = @ResponseBody+@Controller
* */

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService userService;

    @ResponseBody
    @RequestMapping("/getAll")
    public List<UserEntity> getAll(Map map) {
        return userService.getAll(map);
    }

    @RequestMapping("/delById")
    public String delById(Integer id) {
        userService.delById(id);
        return "redirect:/index.html";

    }
    //保存用户的接口
    @RequestMapping("/save")
    @ResponseBody
    //public String save(String username,String password,Integer id,)尽量不要选择这种形式来接受用户的参数
    public String save(@RequestBody UserEntity userEntity){
        userService.save(userEntity);
        return "success";
    }
    //根据id查询用户信息
    @RequestMapping("/getUserById")
    @ResponseBody
    public UserEntity getUserById(Integer id){

        return userService.getUserById(id);
    }
    //根据id修改用户信息
    @RequestMapping("/updateUserById")
    @ResponseBody
    public String updateUserById(@RequestBody UserEntity userEntity){
        userService.updateUserById(userEntity);
        return "success";
    }
}
