package com.xw.service.impl;

import com.xw.entiry.User;
import com.xw.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTest {

    @Autowired
    private IUserService userService;

    @Test
    public void save() {
        User user = new User();
        user.setName("xiongwei22");
        user.setPassword("123");
        userService.save(user);
    }

    @Test
    public void findByName() {
        User xiongwei = userService.findByName("xiongwei");

    }


}