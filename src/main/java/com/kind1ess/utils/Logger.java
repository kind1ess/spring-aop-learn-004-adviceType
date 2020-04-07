package com.kind1ess.utils;

import org.aspectj.lang.ProceedingJoinPoint;

public class Logger {

    /**
     * 前置通知
     */
    public void beforePrintLog(){
        System.out.println("前置通知Logger类中的beforePrintLog方法开始记录日志了。。。");
    }

    /**
     * 后置通知
     */
    public void afterReturningPrintLog(){
        System.out.println("后置通知Logger类中的afterReturningPrintLog方法开始记录日志了。。。");
    }

    /**
     * 异常通知
     */
    public void afterThrowingPrintLog(){
        System.out.println("异常通知Logger类中的afterThrowingPrintLog方法开始记录日志了。。。");
    }

    /**
     * 最终通知
     */
    public void afterPrintLog(){
        System.out.println("最终通知Logger类中的afterPrintLog方法开始记录日志了。。。");
    }

    /**
     * 环绕通知
     * 需要使用Spring提供的一个接口：
     *      ProceedingJoinPoint:
     *          该接口有一个方法:Proceed()，此方法调用切入点方法。
     *          该接口可作为环绕通知的方法参数，在程序执行时，spring框架会提供该接口的实现类供我们使用。
     */
    public Object aroundPrintLog(ProceedingJoinPoint pjp){
        Object returnValue = null;
        try {
            Object[] args = pjp.getArgs();//得到切入点方法的参数
            System.out.println("Logger类中的aroundPrintLog方法开始记录日志了。。。前置");
            returnValue = pjp.proceed(args);//明确调用切入点方法
            System.out.println("Logger类中的aroundPrintLog方法开始记录日志了。。。后置");
        } catch (Throwable throwable) {
            System.out.println("Logger类中的aroundPrintLog方法开始记录日志了。。。异常");
            throwable.printStackTrace();
        } finally {
            System.out.println("Logger类中的aroundPrintLog方法开始记录日志了。。。最终");
        }
        return returnValue;
    }
}
