package com.cheng.chengoj.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cheng.chengoj.model.entity.Question;
import com.cheng.chengoj.service.QuestionService;
import com.cheng.chengoj.mapper.QuestionMapper;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class QuestionServiceImpl extends ServiceImpl<QuestionMapper, Question>
    implements QuestionService{

}




