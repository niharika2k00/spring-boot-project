package com.application.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
//@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class SpringbootApplication {

  public static void main(String[] args) {
    System.out.println("Project started 👀...");

    SpringApplication.run(SpringbootApplication.class, args);
  }

  //List<Role> roles = new ArrayList<>();
  //roles.add(new Role("ROLE_ADMIN"));
  //roles.add(new Role("ROLE_DEVELOPER"));
  //roles.add(new Role("ROLE_EDITOR"));
  //roles.add(new Role("ROLE_GUEST"));
  //roles.add(new Role("ROLE_MANAGER"));
  //roles.add(new Role("ROLE_OPERATOR"));
  //roles.add(new Role("ROLE_SUPER_ADMIN"));
  //roles.add(new Role("ROLE_USER"));
  //roles.add(new Role("ROLE_VIEWER"));

}
