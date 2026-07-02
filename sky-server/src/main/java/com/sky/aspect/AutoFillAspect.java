package com.sky.aspect;

import com.sky.annotation.AutoFill;
import com.sky.enumeration.OperationType;
import com.sky.context.BaseContext;
import java.time.LocalDateTime;
import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AutoFillAspect {

    @Pointcut("execution(* com.sky.mapper.*.*(..)) && @annotation(com.sky.annotation.AutoFill)")
    public void autoFillPointcut(){}

    @Before("autoFillPointcut()")
    public void autoFill(JoinPoint joinPoint){

        //获取当前被拦截的方法上的数据库操作类型
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        AutoFill autoFill = signature.getMethod().getAnnotation(AutoFill.class);
        OperationType operationType = autoFill.value();

        //获取到当前被拦截方法的参数
        Object[] args = joinPoint.getArgs();
        Object entity = args[0];

        //准备赋值的数据
        LocalDateTime now = LocalDateTime.now();
        Long currentId = BaseContext.getCurrentId();

        //根据当前不同的操作类型，为对应的属性通过反射赋值
        if(operationType == OperationType.INSERT){
    //为4个公共字段赋值
    try {
        Method setCreateTime = entity.getClass().getDeclaredMethod("setCreateTime", LocalDateTime.class);
        Method setCreateUser = entity.getClass().getDeclaredMethod("setCreateUser", Long.class);
        Method setUpdateTime = entity.getClass().getDeclaredMethod("setUpdateTime", LocalDateTime.class);
        Method setUpdateUser = entity.getClass().getDeclaredMethod("setUpdateUser", Long.class);

        //通过反射为对象属性赋值
        setCreateTime.invoke(entity,now);
        setCreateUser.invoke(entity,currentId);
        setUpdateTime.invoke(entity,now);
        setUpdateUser.invoke(entity,currentId);
    } catch (Exception e) {
        e.printStackTrace();
    }

}else if(operationType == OperationType.UPDATE){
    //为2个公共字段赋值
    try {
        Method setUpdateTime = entity.getClass().getDeclaredMethod("setUpdateTime", LocalDateTime.class);
        Method setUpdateUser = entity.getClass().getDeclaredMethod("setUpdateUser", Long.class);

        //通过反射为对象属性赋值
        setUpdateTime.invoke(entity,now);
        setUpdateUser.invoke(entity,currentId);
    } catch (Exception e) {
        e.printStackTrace();
    }
}
    }

}
