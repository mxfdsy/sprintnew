package com.aiprogram.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by 平凡的世界 on 2018/4/4.
 */

//@Component()
//@Aspect//声明切面
public class UserAspect {
//    //表示扫描* com.aiprogram..service下的全部类和全部方法
//
//    @Pointcut(value  = "execution(* com.aiprogram.serveice.*.*(..))")
//    public void pointCut(){}
//
//    //advice 我要干的事情，什么时候干
//    @Before(value = "pointCut()")
//    public void doBefoe(JoinPoint joinPont){//链接点 程序执行的点多指的是程序的方法
//        //获取的拦截到的那个点的方法名称
//        String name = joinPont.getSignature().getName();
//        //获取拦截的的点的参数
//        Object[] args = joinPont.getArgs();
//
//        System.out.println(name + args.toString());
//    }
//    @After(value = "pointCut()")
//    public void doAfter(JoinPoint joinPoint){
//        //获取的拦截到的那个点的方法名称
//        String name = joinPoint.getSignature().getName();
//        //获取拦截的的点的参数
//        Object[] args = joinPoint.getArgs();
//        System.out.println("后执行" + name);
//    }
//    //返回运行时的参数
//    @AfterReturning(value = "pointCut()" ,returning = "result")
//    public void afterReturning(JoinPoint joinPoint,Object result){
//        System.out.println(result);
//    }
////    这里在控制拦截到的进程，是否给他运行
//    @Around(value = "pointCut()")
//    public void around (ProceedingJoinPoint proceedingJoinPoint){
//        //如果里面没有东西，拦截到的所有进程都会在这里无法运作
//        try {
//            //允许进程通过
//            proceedingJoinPoint.proceed();
//        } catch (Throwable throwable) {
//            throwable.printStackTrace();
//        }
//   }
}
