package com.cheng.chengoj.judge.strategy;

import com.cheng.chengoj.model.dto.questionSubmit.JudgeInfo;

/**
 * 判题策略
 */
public interface JudgeStrategy {
    JudgeInfo doJudge(JudgeContext judgeContext);
}

