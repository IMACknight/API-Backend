package com.acknight.acknightapiclientsdk.client;

import cn.hutool.core.util.RandomUtil;
import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONUtil;
import com.acknight.acknightapiclientsdk.utils.SignUtils;
import com.acknight.myapicommon.model.entity.User;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

/**
 * 调用第三方接口的客户端
 */

public class ACKnightClient {
    
    public static final String GATEWAY_HOST = "http://localhost:8090";

    private String accessKey;

    private String secretKey;

    public ACKnightClient(String accessKey, String secretKey) {
        this.accessKey = accessKey;
        this.secretKey = secretKey;
    }

    public String getNameByGet(String name) {
        //可以单独传入http参数，这样参数会自动做URL编码，拼接在URL中
        HashMap<String, Object> paramMap = new HashMap<>();
        paramMap.put("name", name);

        String result = HttpUtil.get(GATEWAY_HOST + "/api/name", paramMap);
        System.out.println(result);

        return result;
    }

    public String getNameByPost(String name) {
        //可以单独传入http参数，这样参数会自动做URL编码，拼接在URL中
        HashMap<String, Object> paramMap = new HashMap<>();
        paramMap.put("name", name);

        String result = HttpUtil.post(GATEWAY_HOST + "/api/name", paramMap);
        System.out.println(result);

        return result;
    }

    private Map<String, String> getHeaderMap(String body) {
        Map<String, String> headerMap = new HashMap<>();
        headerMap.put("accessKey", accessKey);
        // 一定不能明文直接发送，不能发送给后端，可以在后端通过密钥校验
//        headerMap.put("secretKey", secretKey); // 该参数不传递
        headerMap.put("nonce", RandomUtil.randomNumbers(4));
        headerMap.put("body", body);
        headerMap.put("timestamp", String.valueOf(System.currentTimeMillis() / 1000));
        headerMap.put("sign", SignUtils.getSign(body, secretKey));
        return headerMap;
    }



    public String getUsernameByPost(User user) {
        String json = JSONUtil.toJsonStr(user);
        HttpResponse httpResponse = HttpRequest.post(GATEWAY_HOST + "/api/name/user")
                .charset(StandardCharsets.UTF_8)
                .addHeaders(getHeaderMap(json))
                .body(json)
                .execute();

        System.out.println(httpResponse.getStatus());
        System.out.println(user);
        String result = httpResponse.body();
        System.out.println(result);

        return result;
    }
}
