package com.cheng.chengoj.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cheng.chengoj.model.dto.question.QuestionQueryRequest;
import com.cheng.chengoj.model.dto.questionSubmit.QuestionSubmitAddRequest;
import com.cheng.chengoj.model.dto.questionSubmit.QuestionSubmitQueryRequest;
import com.cheng.chengoj.model.entity.Question;
import com.cheng.chengoj.model.entity.QuestionSubmit;
import com.baomidou.mybatisplus.extension.service.IService;
import com.cheng.chengoj.model.entity.User;
import com.cheng.chengoj.model.vo.QuestionSubmitVO;
import com.cheng.chengoj.model.vo.QuestionVO;

import javax.servlet.http.HttpServletRequest;

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


    /**
     * 获取查询条件
     *
     * @param questionSubmitQueryRequest
     * @return
     */
    QueryWrapper<QuestionSubmit> getQueryWrapper(QuestionSubmitQueryRequest questionSubmitQueryRequest);


    /**
     * 获取题目 封装
     *
     * @param questionSubmit
     * @param loginUser
     * @return
     */
    QuestionSubmitVO getQuestionSubmitVO(QuestionSubmit questionSubmit, User loginUser);

    /**
     * 分页获取题目封装
     *
     * @param questionSubmitPage
     * @param loginUser
     * @return
     */
    Page<QuestionSubmitVO> getQuestionSubmitVOPage(Page<QuestionSubmit> questionSubmitPage, User loginUser);

}
