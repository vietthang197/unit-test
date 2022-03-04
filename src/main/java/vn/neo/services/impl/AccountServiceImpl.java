package vn.neo.services.impl;

import org.springframework.stereotype.Service;
import vn.neo.services.AccountService;

/**
 * @author thanglv on 3/4/2022
 * @project unit-test
 */
@Service
public class AccountServiceImpl implements AccountService {
    @Override
    public String test1(int num) {
        return num % 2 == 0 ? "OK" : "NOK";
    }

    @Override
    public String test2(int num) {
        return null;
    }
}
