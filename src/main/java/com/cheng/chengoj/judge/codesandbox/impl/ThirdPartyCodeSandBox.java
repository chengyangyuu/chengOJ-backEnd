package com.cheng.chengoj.judge.codesandbox.impl;

import com.cheng.chengoj.judge.codesandbox.CodeSandBox;
import com.cheng.chengoj.judge.codesandbox.model.ExecuteCodeRequest;
import com.cheng.chengoj.judge.codesandbox.model.ExecuteCodeResponse;

/**
 * 第三方代码沙箱(调用网上别人现成的沙箱)
 */
public class ThirdPartyCodeSandBox implements CodeSandBox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        System.out.println("3fang");
        return null;
    }

}
