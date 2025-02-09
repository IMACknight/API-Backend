package com.acknight.project.service;

import com.acknight.myapicommon.model.entity.InterfaceInfo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author ACKnight
* @description 针对表【interface_info(接口信息表)】的数据库操作Service
* @createDate 2024-11-22 17:14:10
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {

    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}
