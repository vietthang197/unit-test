package vn.neo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
