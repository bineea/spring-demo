package my.demo.aspectj;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.reflect.MethodSignature;

import java.lang.reflect.Method;
import java.time.LocalDateTime;

public class LogAspectj {

    public void beforeExcute(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        LocalDateTime now = LocalDateTime.now();
        System.out.println("--->>>before执行方法："+methodName+"，开始执行，当前时间为："+now);
    }

    public void afterExcute(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        LocalDateTime now = LocalDateTime.now();
        System.out.println("--->>>after执行方法："+methodName+"，结束执行，当前时间为："+now);
    }

    public Object aroundExcute(ProceedingJoinPoint proceedingJoinPoint) {

        MethodSignature methodSignature = (MethodSignature) proceedingJoinPoint.getSignature();
        Method method = methodSignature.getMethod();
        LocalDateTime now = LocalDateTime.now();
        System.out.println("--->>>aroud执行方法before："+method.getName()+"，当前时间为："+now);
        Object proceed = null;
        try {
            proceed = proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        LocalDateTime end = LocalDateTime.now();
        System.out.println("--->>>aroud执行方法after："+method.getName()+"，当前时间为："+end);
        return proceed;
    }
}
