package com.acknight.project.service.impl.inner;

import com.acknight.myapicommon.model.entity.InterfaceInfo;
import com.acknight.myapicommon.service.InnerInterfaceInfoService;
import com.acknight.project.common.ErrorCode;
import com.acknight.project.exception.BusinessException;
import com.acknight.project.mapper.InterfaceInfoMapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.apache.commons.lang3.StringUtils;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;

@DubboService
public class InnerInterfaceInfoServiceImpl implements InnerInterfaceInfoService {
    
    @Resource
    private InterfaceInfoMapper interfaceInfoMapper;
    
    @Override
    public InterfaceInfo getInterfaceInfo(String url, String method) {
        if (StringUtils.isAnyBlank(url, method)) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        QueryWrapper<InterfaceInfo> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("url", url);
        queryWrapper.eq("method", method);
        InterfaceInfo interfaceInfo = interfaceInfoMapper.selectOne(queryWrapper);
        return interfaceInfo;
    }
}
