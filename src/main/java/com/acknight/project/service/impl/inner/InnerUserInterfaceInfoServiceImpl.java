package com.acknight.project.service.impl.inner;

import com.acknight.myapicommon.service.InnerUserInterfaceInfoService;
import com.acknight.project.service.UserInterfaceInfoService;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;

@DubboService
public class InnerUserInterfaceInfoServiceImpl implements InnerUserInterfaceInfoService {
    
    @Resource
    private UserInterfaceInfoService userInterfaceInfoService;
    
    @Override
    public boolean invokeCount(long interfaceInfoId, long userId) {
        boolean result = userInterfaceInfoService.invokeCount(interfaceInfoId, userId);
        return result;
    }
}
