package vn.neo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.neo.dto.UserInfoDto;

/**
 * @author thanglv on 3/4/2022
 * @project unit-test
 */
@RestController
@RequestMapping("/")
public class UserController {

    @GetMapping("/hello-world")
    public String doHelloWorld() {
        return "HelloWorld";
    }

    @GetMapping("/user")
    public UserInfoDto getUserInfo() {
        return new UserInfoDto("admin", "123456");
    }

}
