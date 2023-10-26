package com.cheng.chengoj.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cheng.chengoj.annotation.AuthCheck;
import com.cheng.chengoj.common.BaseResponse;
import com.cheng.chengoj.common.ErrorCode;
import com.cheng.chengoj.common.ResultUtils;
import com.cheng.chengoj.constant.UserConstant;
import com.cheng.chengoj.exception.BusinessException;
import com.cheng.chengoj.model.dto.question.QuestionQueryRequest;
import com.cheng.chengoj.model.dto.questionSubmit.QuestionSubmitAddRequest;
import com.cheng.chengoj.model.dto.questionSubmit.QuestionSubmitQueryRequest;
import com.cheng.chengoj.model.dto.user.UserQueryRequest;
import com.cheng.chengoj.model.entity.QuestionSubmit;
import com.cheng.chengoj.model.entity.User;
import com.cheng.chengoj.model.vo.QuestionSubmitVO;
import com.cheng.chengoj.service.QuestionSubmitService;
import com.cheng.chengoj.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * 帖子点赞接口
 *
 */
@RestController
@RequestMapping("/question_submit")
@Slf4j
public class QuestionSubmitController {

    @Resource
    private QuestionSubmitService questionSubmitService;

    @Resource
    private UserService userService;

    /**
     * 提交题目
     * @param questionSubmitAddRequest
     * @param request
     * @return resultNum
     */
    @PostMapping("/")
    public BaseResponse<Long> doQuestionSubmit(@RequestBody QuestionSubmitAddRequest questionSubmitAddRequest,
            HttpServletRequest request) {
        if (questionSubmitAddRequest == null || questionSubmitAddRequest.getQuestionId() <= 0) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        // 登录才能点赞
        final User loginUser = userService.getLoginUser(request);
        long questionSubmitId = questionSubmitService.doQuestionSubmit(questionSubmitAddRequest, loginUser);
        return ResultUtils.success(questionSubmitId);
    }
    /**
     * 分页获取题目提交列表（管理员外的人 只能看到非答案 提交代码等公开信息）
     *
     * @param questionSubmitQueryRequest
     * @param request
     * @return
     */
    @PostMapping("/list/page")
    public BaseResponse<Page<QuestionSubmitVO>> listQuestionSubmitByPage(@RequestBody QuestionSubmitQueryRequest questionSubmitQueryRequest,
                                                                         HttpServletRequest request) {
        //查询到原始分页数据
        long current = questionSubmitQueryRequest.getCurrent();
        long size = questionSubmitQueryRequest.getPageSize();
        Page<QuestionSubmit> questionSubmitPage = questionSubmitService.page(new Page<>(current, size),
                questionSubmitService.getQueryWrapper(questionSubmitQueryRequest));
        final User loginUser = userService.getLoginUser(request);
        //返回脱敏信息
        return ResultUtils.success(questionSubmitService.getQuestionSubmitVOPage(questionSubmitPage,loginUser));

    }


}
