package com.cheng.chengoj.judge;

import com.cheng.chengoj.model.entity.QuestionSubmit;
import com.cheng.chengoj.model.vo.QuestionSubmitVO;


public interface JudgeService {
    /**
     * 判题服务
     * @param questionSubmitId
     * @return
     */
    QuestionSubmit doJudge(long questionSubmitId);

}
