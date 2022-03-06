package vn.neo.dao.impl;

import org.springframework.stereotype.Repository;
import vn.neo.dao.UserInfoDAO;
import vn.neo.dto.UserInfoDto;

@Repository
public class UserInfoDAOImpl implements UserInfoDAO {

    @Override
    public UserInfoDto findOneUserInfo() {
        return new UserInfoDto("xxx", "yyy");
    }
}
