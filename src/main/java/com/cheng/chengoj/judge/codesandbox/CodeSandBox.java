package com.cheng.chengoj.judge.codesandbox;

import com.cheng.chengoj.judge.codesandbox.model.ExecuteCodeRequest;
import com.cheng.chengoj.judge.codesandbox.model.ExecuteCodeResponse;

public interface CodeSandBox {

    /**
     * 执行代码
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);


}
