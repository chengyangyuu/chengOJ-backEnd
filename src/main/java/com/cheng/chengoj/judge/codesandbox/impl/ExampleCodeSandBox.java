package com.cheng.chengoj.judge.codesandbox.impl;

import com.cheng.chengoj.model.enums.JudgeInfoMessageEnum;
import com.cheng.chengoj.model.enums.QuestionSubmitStatusEnum;
import com.google.common.collect.Lists;
import com.cheng.chengoj.model.dto.questionSubmit.JudgeInfo;

import com.cheng.chengoj.judge.codesandbox.CodeSandBox;
import com.cheng.chengoj.judge.codesandbox.model.ExecuteCodeRequest;
import com.cheng.chengoj.judge.codesandbox.model.ExecuteCodeResponse;

import java.util.List;

/**
 * 示例代码沙箱(仅为了跑业务的)
 */
public class ExampleCodeSandBox implements CodeSandBox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        List<String> inputList = executeCodeRequest.getInputList();

        JudgeInfo judgeInfo = new JudgeInfo();
        judgeInfo.setMessage(JudgeInfoMessageEnum.Accepted.getText());
        judgeInfo.setMemory(100L);
        judgeInfo.setTime(100L);

        ExecuteCodeResponse executeCodeResponse = new ExecuteCodeResponse();
        executeCodeResponse.setOutputList(inputList);
        executeCodeResponse.setMessage("测试执行成功");
        executeCodeResponse.setStatus(QuestionSubmitStatusEnum.SUCCEED.getValue());
        executeCodeResponse.setJudgeInfo(judgeInfo);

        System.out.println("示例");
        return executeCodeResponse;
    }
}
