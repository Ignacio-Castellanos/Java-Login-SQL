package com.app.authSpring.Controller;


import com.app.authSpring.DTO.UserDto;
import com.app.authSpring.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("user")
public class UserController {


    @Autowired
   private UserService userService;
    @PostMapping(path = "/save")
    public String createUser(@RequestBody UserDto userDto){
        String id = userService.addUser(userDto);
        return id;

    }

}
