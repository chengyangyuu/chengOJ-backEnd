package com.cheng.chengoj.judge.strategy;

import com.cheng.chengoj.model.dto.question.JudgeCase;
import com.cheng.chengoj.model.dto.questionSubmit.JudgeInfo;
import com.cheng.chengoj.model.entity.Question;
import com.cheng.chengoj.model.entity.QuestionSubmit;
import lombok.Data;

import java.util.List;

@Data
public class JudgeContext {

    private JudgeInfo judgeInfo;

    private List<String> inputList;

    private List<String> outputList;

    private List<JudgeCase> judgeCaseList;

    private Question question;

    private QuestionSubmit questionSubmit;

}
