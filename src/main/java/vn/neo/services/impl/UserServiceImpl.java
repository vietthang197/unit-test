package vn.neo.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.neo.dao.UserInfoDAO;
import vn.neo.dto.UserInfoDto;
import vn.neo.services.UserService;

/**
 * @author thanglv on 3/4/2022
 * @project unit-test
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserInfoDAO userInfoDAO;

    @Override
    public void test3() {

    }

    @Override
    public UserInfoDto findOneUserInfo() {
        return userInfoDAO.findOneUserInfo();
    }
}
