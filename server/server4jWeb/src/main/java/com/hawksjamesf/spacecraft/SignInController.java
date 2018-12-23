package com.hawksjamesf.spacecraft;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Copyright ® $ 2017
 * All right reserved.
 *
 * @author: hawks.jamesf
 * @since: Dec/20/2018  Thu
 */
@RestController
public class SignInController {

    @GetMapping("/")
    public String index() {
        return "Hello World";
    }

    @PostMapping("/signIn")
    public String signIn(@RequestBody String info) {
        return "sign in successfully:" + info;
    }

    @PostMapping("/signUp")
    public String signUp(@RequestBody String info) {
//        model.addAttribute("name", name);
        return "sign up successfully";
    }

    @PostMapping("/signOut")
    public String signOut(@RequestBody String info) {
        return "sign out successfully";
    }

    @GetMapping("404")
    public String handleError(){
        return "404"; // 这里返回的是文件名，这里会展示 404.html
    }

    @GetMapping("/greeting")
    public String greeting(){
        return "greeting"; // 这里返回的是文件名，这里会展示 404.html
    }


}
