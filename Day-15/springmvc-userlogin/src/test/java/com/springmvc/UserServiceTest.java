package com.springmvc;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.springmvc.model.Login;
import com.springmvc.model.User;
import com.springmvc.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:com/config/user-beans.xml" })
public class UserServiceTest {

  @Autowired
  private UserService userService;

  @Test
  public void testRegister() {
    User user = new User();
    user.setUsername("Ayan");
    user.setPassword("Abc123");
    user.setFirstname("Ayan");
    user.setLastname("Ghosh");
    user.setAddress("Hi-tech city, Hyderabad");
    user.setEmail("ayan@gmail.com");
    user.setPhone(987654321);

    int result = userService.register(user);
    Assert.assertEquals(1, result);
  }

  @Test
  public void testValidateUser() {
    Login login = new Login();
    login.setUsername("Ayan");
    login.setPassword("Abc123");

    User user = userService.validateUser(login);
    Assert.assertEquals("Ayan", user.getFirstname());
  }

}
