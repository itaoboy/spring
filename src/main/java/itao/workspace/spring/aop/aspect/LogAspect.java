package itao.workspace.spring.aop.aspect;

import itao.workspace.spring.aop.annotation.Action;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @author itao
 * @since 2019-03-09 15:56
 */
@Aspect
@Component
public class LogAspect {

    //声明切点
    @Pointcut("@annotation(itao.workspace.spring.aop.annotation.Action)")
    public void annotationPointCut(){}

    //声明一个建言,根据注解拦截
    @After("annotationPointCut()")
    public void after (JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        //通过反射获得注解上的属性
        Action action = method.getAnnotation(Action.class);
        System.out.println("注解式拦截:"+action.name());
    }

    //声明一个建言，使用拦截规则
    @Before("execution(* itao.workspace.spring.aop.service.DemoMethodService.*(..))")
    public void before(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println("方法规则式拦截:"+method.getName());
    }

}
