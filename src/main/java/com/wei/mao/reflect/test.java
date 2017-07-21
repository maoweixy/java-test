package com.wei.mao.reflect;

import com.wei.mao.constant.Person;

/**
 * @Author 毛伟
 * @Email wei.mao@xinmei365.com
 * @Date 17/7/17  17:56
 */
public class test {
    public static void main(String args[]) throws ClassNotFoundException {
        Person person = new Person();
        person.setName("maowei");
        Class personClass = person.getClass();
        Class intClass = int.class;
        System.out.println(intClass.getName());
        System.out.println(personClass.getName());
        reflectTest reflectTest = new reflectTest();
        reflectTest.printClass(personClass.getName());

        System.out.println("毛伟");
    }
}
