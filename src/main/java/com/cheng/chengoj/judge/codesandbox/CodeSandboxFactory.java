package com.cheng.chengoj.judge.codesandbox;

import com.cheng.chengoj.judge.codesandbox.impl.ExampleCodeSandBox;
import com.cheng.chengoj.judge.codesandbox.impl.RemoteCodeSandBox;
import com.cheng.chengoj.judge.codesandbox.impl.ThirdPartyCodeSandBox;

/**
 * 代码沙箱 根据参数来 选择沙箱
 */
public class CodeSandboxFactory {

    public static CodeSandBox newInstance(String type){
        switch (type){
            case "example":
                return new ExampleCodeSandBox();
            case "remote":
                return new RemoteCodeSandBox();
            case "thirdParty":
                return new ThirdPartyCodeSandBox();
            default:
                return new ExampleCodeSandBox();
        }
    }
}
