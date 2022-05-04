package com.mmss.mmservice.controller.user;

import com.mmss.mmservice.pojo.common.ResultVO;
import com.mmss.mmservice.pojo.user.User;
import com.mmss.mmservice.service.userservice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 陈小虎
 * @description UserController
 * @since 2022/5/4 17:47
 */
@RequestMapping("/User")
@RestController
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/getUserInfo")
    public ResultVO getUserInfo(User user) {
        return userService.getUserInfo(user);
    }
}
