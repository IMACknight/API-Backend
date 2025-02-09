package com.acknight.acknightinterface.controller;

import cn.hutool.core.util.RandomUtil;
import com.acknight.acknightapiclientsdk.utils.SignUtils;
import com.acknight.myapicommon.model.entity.User;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/name")
public class NameController {

    @GetMapping("/get")
    public String getName(String name) {
        return "GET 你的名字是" + name;
    }

    @PostMapping("/post")
    public String getNameByPost(@RequestParam String name) {
        return "POST 你的名字是" + name;
    }

    @PostMapping("/user")
    public String getUsernameByPost(@RequestBody User user, HttpServletRequest request) {
//        String accessKey = request.getHeader("accessKey");
//        String nonce = request.getHeader("nonce");
//        String body = request.getHeader("body");
//        String timestamp = request.getHeader("timestamp");
//        String sign = request.getHeader("sign");
//        // TODO 实际情况应该是去数据库中查是否已分配给用户
//        if (!accessKey.equals("acknight")) {
//            throw new RuntimeException("无权限");
//        }
//        if (Long.parseLong(nonce) > 10000) {
//            throw new RuntimeException("无权限");
//        }
//        // 时间和当前时间不能超过5分钟
//        long currentTime = Long.parseLong(RandomUtil.randomNumbers(4));
//        long diff = currentTime - Long.parseLong(timestamp);
//        long fiveMinutes = 5 * 60 * 1000;
//        if (diff > fiveMinutes) {
//            throw new RuntimeException("无权限");
//        }
//        // TODO 实际情况应该是去数据库中查secretKey
//        String serverSign = SignUtils.getSign(body, "abcdefgh");
//        if (!sign.equals(serverSign)) {
//            throw new RuntimeException("无权限");
//        }
        return "POST 用户的名字是" + user.getUserName();
    }
}
