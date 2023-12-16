package me.Sergio.SpringLab3.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PocketAspect {

    // Pointcut для всіх методів setItem в класі Pocket
    @Pointcut("execution(* me.Sergio.SpringLab3.Pocket.setItem(..))")
    public void setItemMethod() {}

    // Pointcut для всіх методів getWidth в класі Pocket
    @Pointcut("execution(int me.Sergio.SpringLab3.Pocket.getWidth())")
    public void getWidthMethod() {}

    // Pointcut для всіх методів getHeight в класі Pocket
    @Pointcut("execution(int me.Sergio.SpringLab3.Pocket.getHeight())")
    public void getHeightMethod() {}

    // Advice метод, що викликається перед викликом методу setItem
    @Before("setItemMethod()")
    public void beforeSetItem(JoinPoint joinPoint) {
        System.out.println("> Before setting item in the pocket");
    }

    // Advice метод, що викликається перед викликом методу getWidth
    @Before("getWidthMethod()")
    public void beforeGetWidth(JoinPoint joinPoint) {
        System.out.println("> Before getting width of the pocket");
    }

    // Advice метод, що викликається перед викликом методу getHeight
    @Before("getHeightMethod()")
    public void beforeGetHeight(JoinPoint joinPoint) {
        System.out.println("> Before getting height of the pocket");
    }
}
