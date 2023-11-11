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
//@RequestMapping("/question_submit")
@Slf4j

public class QuestionSubmitController {



}
