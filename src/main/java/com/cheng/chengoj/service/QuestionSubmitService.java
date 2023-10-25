package com.cheng.chengoj.service;

import com.cheng.chengoj.model.dto.questionSubmit.QuestionSubmitAddRequest;
import com.cheng.chengoj.model.entity.QuestionSubmit;
import com.baomidou.mybatisplus.extension.service.IService;
import com.cheng.chengoj.model.entity.User;

/**
 *
 */
public interface QuestionSubmitService extends IService<QuestionSubmit> {
    /**
     * 题目提交
     *
     * @param questionSubmitAddRequest  题目提交信息
     * @param loginUser
     * @return 提交表单的id
     */
    long doQuestionSubmit(QuestionSubmitAddRequest questionSubmitAddRequest, User loginUser);


}
