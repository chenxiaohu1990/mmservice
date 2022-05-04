package com.mmss.mmservice.dao.user;

import com.mmss.mmservice.pojo.user.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {

    User getUserInfo(User user);
}
