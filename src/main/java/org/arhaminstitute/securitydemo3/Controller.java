package org.arhaminstitute.securitydemo3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String sayHello() {
        return "Hello ";
    }

    @GetMapping("/user")
    public String sayUser() {
        return "Hello User ";
    }

    @GetMapping("/admin")
    public String sayAdmin() {
        return "Hello  Admin";
    }


}
