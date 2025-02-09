package com.acknight.project.service;


import com.acknight.myapicommon.model.entity.UserInterfaceInfo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author ACKnight
* @description 针对表【user_interface_info(用户调用接口关系表)】的数据库操作Service
* @createDate 2024-12-09 12:38:46
*/
public interface UserInterfaceInfoService extends IService<UserInterfaceInfo> {
    
    void validUserInterfaceInfo(UserInterfaceInfo userInterfaceInfo, boolean add);
    
    /**
     * 调用接口统计
     * @param interfaceInfoId
     * @param userId
     * @return
     */
    boolean invokeCount(long interfaceInfoId, long userId);
}
