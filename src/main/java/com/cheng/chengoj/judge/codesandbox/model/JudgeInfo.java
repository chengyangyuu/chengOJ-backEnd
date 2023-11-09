package com.cheng.chengoj.judge.codesandbox.model;

import lombok.Data;

/**
 * 题目用例
 * 是个对象类型的数组
 */
@Data
public class JudgeInfo {
    /**
     * 程序执行信息
     */
    private String message;

    /**
     * 消耗内存(kb)
     */
    private Long memory;

    /**
     * 消耗时间(ms)
     */
    private Long time;

}
