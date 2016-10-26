package org.babypro.test;

import org.babypro.domain.User;
import org.babypro.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by johnzhu on 10/27/2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class UserServiceTest {

    @Autowired
    IUserService mUserService;

    @Test
    public void save() throws Exception{
        User user = new User();
        user.setPhoneNum("1309302930");
        user.setUUId("uuid");
        mUserService.save(user);
    }
}
