package ru.gb.JavaSpring.HW08.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class UserActionTrackingAspect {
    @Before("execution (* ru.gb.JavaSpring.HW08.services.*.*transfer*(..))\"")
    public void logUserActionToConsole(JoinPoint joinPoint){
        System.out.println("Tracking user action: " + joinPoint.getSignature().getName());
        System.out.println("Tracking user parameters: " + Arrays.toString(joinPoint.getArgs()));
    }
}
