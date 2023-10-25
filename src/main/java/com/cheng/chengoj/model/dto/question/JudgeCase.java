package com.cheng.chengoj.model.dto.question;

import lombok.Data;

/**
 * 题目用例
 * 是个对象类型的数组
 */
@Data
public class JudgeCase {
    /**
     * 输入用例
     */
    private String input;
    /**
     * 输出用例
     */
    private String output;
}
