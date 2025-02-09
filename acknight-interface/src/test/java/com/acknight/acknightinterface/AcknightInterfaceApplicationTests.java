package com.acknight.acknightinterface;

import com.acknight.acknightapiclientsdk.client.ACKnightClient;
import com.acknight.myapicommon.model.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class AcknightInterfaceApplicationTests {

    @Resource
    private ACKnightClient acKnightClient;

    @Test
    void contextLoads() {
        String result = acKnightClient.getNameByGet("acknight");
        User user = new User();
        user.setUserName("hahaha");
        String usernameByPost = acKnightClient.getUsernameByPost(user);
        System.out.println(result);
        System.out.println(usernameByPost);
    }

}
