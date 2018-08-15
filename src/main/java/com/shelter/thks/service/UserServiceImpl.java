package com.shelter.thks.service;

import com.shelter.thks.mapper.UserMapper;
import com.shelter.thks.vo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by calling on 2018/8/15.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public UserInfo getUserInfo() {
        return userMapper.getUserInfo();
    }
}
