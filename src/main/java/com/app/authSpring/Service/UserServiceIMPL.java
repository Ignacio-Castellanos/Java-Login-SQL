package com.app.authSpring.Service;

import com.app.authSpring.DTO.UserDto;
import com.app.authSpring.Entity.User;
import com.app.authSpring.Repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceIMPL implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;
    @Override
    public String addUser(UserDto userDto) {
        User user = new User(
                userDto.getId(),
                userDto.getUserName(),
                userDto.getEmail(),
                userDto.getPassword(),
                this.passwordEncoder.encode(userDto.getPassword())
        );
        userRepository.save(user);
        return user.getUserName();
    }
}
