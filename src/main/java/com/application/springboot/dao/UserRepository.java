package com.application.springboot.dao;

import com.application.springboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

//public interface <name> extends JpaRepository<entityType, primaryKey>
public interface UserRepository extends JpaRepository<User, Integer> {

  //  @Query(value = "select * from user where email = ?1", nativeQuery = true)
  //  @Query("select u from User u where u.email = ?1")
  Optional<User> findByEmail(String email);
}
