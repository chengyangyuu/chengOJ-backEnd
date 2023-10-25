package com.cheng.chengoj.model.dto.question;

import lombok.Data;

/**
 * 判题信息
 * 是个对象类型的数组
 */
@Data
public class JudgeConfig {
    /**
     * 时间限制(ms)
     */
    private Long timeLimit;

    /**
     * 内存限制(kb)
     */
    private Long memoryLimit;

    /**
     * 堆栈限制(kb)
     */
    private Long stackLimit;
}
