package service.impl;

import config.RootConfig;
import domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import service.UserService;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = RootConfig.class)
public class UserServiceImplTest {

    @Autowired
    private UserService userService;

    @Test
    public void test() {
        User user = new User();
        user.setId(1);

        userService.update(user);
    }

}