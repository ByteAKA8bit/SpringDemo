package learn.spring.demo.service.implement;

import learn.spring.demo.service.UserService;

public class UserServiceImplement implements UserService {
  @Override
  public void print() {
    System.out.println("Hello");
  }
}
