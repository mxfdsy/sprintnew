package com.aiprogram.aop;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by 没想法的岁月 on 2018/4/6.
 */
public class Logger {
    public void doLog(ProceedingJoinPoint proceedingJoinPoint){
        try {
            proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}
