package com.cheng.chengoj.judge.codesandbox;

import com.cheng.chengoj.judge.codesandbox.model.ExecuteCodeRequest;
import com.cheng.chengoj.judge.codesandbox.model.ExecuteCodeResponse;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CodeSandboxProxy implements CodeSandBox {
    private final CodeSandBox codeSandBox;

    //构造函数
    public CodeSandboxProxy(CodeSandBox codeSandBox) {
        this.codeSandBox=codeSandBox;
    }

    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        //请求前的日志
        log.info(executeCodeRequest.toString());
        ExecuteCodeResponse executeCodeResponse = codeSandBox.executeCode(executeCodeRequest);
        //响应后的日志
        log.info(executeCodeResponse.toString());
        return executeCodeResponse;
    }
}
