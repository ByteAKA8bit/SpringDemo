package learn.spring.demo;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import learn.spring.demo.entity.User;
import learn.spring.demo.service.UserService;

public class TestUserService {
  public ApplicationContext act = new ClassPathXmlApplicationContext("/applicationContext.xml");

  @Test
  public void testUserService() {
    ApplicationContext act = new ClassPathXmlApplicationContext("/applicationContext.xml");
    UserService userService = (UserService) act.getBean("userService");
    userService.print();
  }

  @Test
  public void testUser() {
    User user = (User) act.getBean("user");
    System.out.println("姓名：" + user.getName());
    System.out.println("性别：" + user.getAge());
  }
}
