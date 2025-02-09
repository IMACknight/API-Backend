package com.acknight.project.model.vo;

import cn.hutool.json.JSONUtil;
import com.acknight.myapicommon.model.entity.InterfaceInfo;
import com.acknight.project.model.entity.Post;
import lombok.Data;
import org.springframework.beans.BeanUtils;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 接口信息封装视图
 */
@Data
public class InterfaceInfoVO extends InterfaceInfo {

    /**
     * 调用次数
     */
    private Integer totalNum;
}
