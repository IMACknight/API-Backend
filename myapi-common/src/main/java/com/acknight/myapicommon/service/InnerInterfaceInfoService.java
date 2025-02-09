package com.acknight.myapicommon.service;

import com.acknight.myapicommon.model.entity.InterfaceInfo;

/**
* @author ACKnight
* @description 针对表【interface_info(接口信息表)】的数据库操作Service
* @createDate 2024-11-22 17:14:10
*/
public interface InnerInterfaceInfoService {

    /**
     * 从数据库中查询模拟接口是否存在（请求路径， 请求方法， 返回接口信息，为空表示不存在）
     * @param url
     * @param method
     * @return
     */
    InterfaceInfo getInterfaceInfo(String url, String method);

}
