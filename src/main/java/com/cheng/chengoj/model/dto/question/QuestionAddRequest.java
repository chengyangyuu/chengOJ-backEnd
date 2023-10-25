package com.cheng.chengoj.model.dto.question;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 管理员添加题目 字段
 */
@Data
public class QuestionAddRequest implements Serializable {

    /**
     * 标题
     */
    private String title;

    /**
     * 内容
     */
    private String content;

    /**
     * 标签列表（json 数组）
     */
    private List<String> tags;

    /**
     * 题目答案
     */
    private String answer;

    /**
     * 判题用例(json 数组)
     */
    private List<JudgeCase> judgeCase;

    /**
     * 判题配置(json 数组)
     */
    private JudgeConfig  judgeConfig;


    private static final long serialVersionUID = 1L;
}
