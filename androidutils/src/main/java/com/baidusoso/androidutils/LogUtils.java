package com.baidusoso.androidutils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LogUtils {
    @After("call(* android.app.mia.MiaMdmPolicyManager.getMiaBuildNumber(..))")
    public void test(JoinPoint joinPoint){
        System.out.println("getMiaBuildNumber:"+ joinPoint.getTarget().toString() + "#" + joinPoint.getSignature().getName());
    }
}
