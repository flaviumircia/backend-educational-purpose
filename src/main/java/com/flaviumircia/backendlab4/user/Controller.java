package com.flaviumircia.backendlab4.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/users/")
public class Controller {

    private final Service userService;

    @Autowired
    public Controller(Service userService) {
        this.userService = userService;
    }

    @GetMapping("getUsers/")
    public List<User> getUsers(){
        return userService.getAll();
    }
    @PostMapping("addUser/")
    public void postUser(@RequestBody User user){
        userService.addUser(user);
    }
}
