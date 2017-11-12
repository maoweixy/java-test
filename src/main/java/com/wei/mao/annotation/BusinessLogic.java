package com.wei.mao.annotation;

/**
 * @Author 毛伟
 * @Date 10/27/17  16:34
 */
public class BusinessLogic {
    public BusinessLogic() {
        super();
    }

    public void compltedMethod() {
        System.out.println("This method is complete");
    }

    @Todo(priority = Todo.Priority.HIGH)
    public void notYetStartedMethod() {
        // No Code Written yet
        System.out.println("mao");
    }

    @Todo(priority = Todo.Priority.MEDIUM, author = "Uday", status = Todo.Status.STARTED)
    public void incompleteMethod1() {
        //Some business logic is written
        //But its not complete yet
    }

    @Todo(priority = Todo.Priority.LOW, status = Todo.Status.STARTED )
    public void incompleteMethod2() {
        //Some business logic is written
        //But its not complete yet
    }
}
