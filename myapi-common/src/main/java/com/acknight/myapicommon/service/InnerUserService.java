package com.acknight.myapicommon.service;


import com.acknight.myapicommon.model.entity.User;


/**
 * 用户服务
 */
public interface InnerUserService {

    /**
     * 数据库中查是否已分配给用户密钥（accessKey, 返回用户信息，为空表示不存在）
     * @param accessKey
     * @return
     */
    User getInvokeUser(String accessKey);

}
