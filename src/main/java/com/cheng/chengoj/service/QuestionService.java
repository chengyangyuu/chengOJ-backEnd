package com.cheng.chengoj.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cheng.chengoj.model.dto.question.QuestionQueryRequest;
import com.cheng.chengoj.model.entity.Question;
import com.cheng.chengoj.model.entity.Question;
import com.baomidou.mybatisplus.extension.service.IService;
import com.cheng.chengoj.model.entity.QuestionSubmit;
import com.cheng.chengoj.model.vo.QuestionSubmitVO;
import com.cheng.chengoj.model.vo.QuestionVO;

import javax.servlet.http.HttpServletRequest;

/**
 *
 */
public interface QuestionService extends IService<Question> {


    /**
     * 校验
     *
     * @param question
     * @param add
     */
    void validQuestion(Question question, boolean add);

    /**
     * 获取查询条件
     *
     * @param questionQueryRequest
     * @return
     */
    QueryWrapper<Question> getQueryWrapper(QuestionQueryRequest questionQueryRequest);


    /**
     * 获取题目 封装
     *
     * @param question
     * @param request
     * @return
     */
    QuestionVO getQuestionVO(Question question, HttpServletRequest request);

    /**
     * 分页获取题目封装
     *
     * @param questionPage
     * @param request
     * @return
     */
    Page<QuestionVO> getQuestionVOPage(Page<Question> questionPage, HttpServletRequest request);

}
