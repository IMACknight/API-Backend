package com.acknight.myapicommon.service;


/**
* @author ACKnight
* @description 针对表【user_interface_info(用户调用接口关系表)】的数据库操作Service
* @createDate 2024-12-09 12:38:46
*/
public interface InnerUserInterfaceInfoService {
    
    /**
     * 调用接口统计
     * @param interfaceInfoId
     * @param userId
     * @return
     */
    boolean invokeCount(long interfaceInfoId, long userId);
}
