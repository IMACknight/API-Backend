package com.acknight.project.common;

import lombok.Data;

import java.io.Serializable;

/**
 * 使用id的请求
 */
@Data
public class IdRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    private static final long serialVersionUID = 1L;
}