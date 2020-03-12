package com.atguigu.springboot06.repository;

import com.atguigu.springboot06.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {

}
