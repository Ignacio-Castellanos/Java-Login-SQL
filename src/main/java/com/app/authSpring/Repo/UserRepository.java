package com.app.authSpring.Repo;

import com.app.authSpring.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Integer> {


}
