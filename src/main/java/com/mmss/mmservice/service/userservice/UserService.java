package com.mmss.mmservice.service.userservice;

import com.mmss.mmservice.pojo.common.ResultVO;
import com.mmss.mmservice.pojo.user.User;

/**
 * @author 陈小虎
 * @description 用户基本类
 * @since 2022/5/4 16:29
 */

public interface UserService {

    ResultVO getUserInfo(User user);
}
