package com.cheng.chengoj.judge.codesandbox.impl;

import com.cheng.chengoj.judge.codesandbox.CodeSandBox;
import com.cheng.chengoj.judge.codesandbox.model.ExecuteCodeRequest;
import com.cheng.chengoj.judge.codesandbox.model.ExecuteCodeResponse;

/**
 * 示例代码沙箱(仅为了跑业务的)
 */
public class ExampleCodeSandBox implements CodeSandBox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        System.out.println("示例");
        return null;
    }
}
