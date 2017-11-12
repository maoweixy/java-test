package com.wei.mao.annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Author 毛伟
 * @Date 10/27/17  16:35
 */
public class TodoReport {
    public TodoReport() {
        super();
    }

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        getTodoReportForBusinessLogic();
    }

    /**
     * 解析使用注解的类，获取通过注解设置的属性
     */
    private static void getTodoReportForBusinessLogic() throws InvocationTargetException, IllegalAccessException {
        Class businessLogicClass = BusinessLogic.class;
        for(Method method : businessLogicClass.getMethods()) {
            Todo todoAnnotation = method.getAnnotation(Todo.class);
            if(todoAnnotation != null) {
                System.out.println(" Method Name : " + method.getName());
                System.out.println(" Author : " + todoAnnotation.author());
                System.out.println(" Priority : " + todoAnnotation.priority());
                System.out.println(" Status : " + todoAnnotation.status());
                if (todoAnnotation.priority() == Todo.Priority.HIGH) {
                    method.invoke(new BusinessLogic());
                }
                System.out.println(" --------------------------- ");
            }
        }
    }
}
