package com.acknight.project.service.impl.inner;

import com.acknight.myapicommon.model.entity.User;
import com.acknight.myapicommon.service.InnerUserService;
import com.acknight.project.common.ErrorCode;
import com.acknight.project.exception.BusinessException;
import com.acknight.project.mapper.UserMapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.apache.commons.lang3.StringUtils;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;

@DubboService
public class InnerUserServiceImpl implements InnerUserService {
    
    @Resource
    private UserMapper userMapper;
    
    @Override
    public User getInvokeUser(String accessKey) {
        if (StringUtils.isAnyBlank(accessKey)) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("accessKey", accessKey);
        User invokeUser = userMapper.selectOne(queryWrapper);
        return invokeUser;
    }
}
