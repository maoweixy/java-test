package com.wei.mao.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @Author 毛伟
 * @Email wei.mao@xinmei365.com
 * @Date 17/7/17  18:24
 */
public class reflectTest {
    public void printClass(String arg) throws ClassNotFoundException {
        Class child = Class.forName(arg);
        Class parent = child.getSuperclass();
        String modifiers = Modifier.toString(child.getModifiers());
        if (modifiers.length() > 0) {
            System.out.print(modifiers + " ");
        }
        System.out.println("class " + arg);
        if (parent != null && parent != Object.class) {
            System.out.print(" extends " + parent.getName());
        }
        System.out.println("{");
        printConstructors(child);
        System.out.println();
        printMethods(child);
        System.out.println();
        printFields(child);
        System.out.println("}");
    }

    public void printConstructors(Class cl) {
        Constructor[] constructors = cl.getDeclaredConstructors();
        for (Constructor c : constructors) {
            System.out.print("    ");
            String modifiers = Modifier.toString(c.getModifiers());
            if (modifiers.length() > 0) {
                System.out.print(modifiers + " ");
                System.out.print(c.getName() + "(");
                Class[] paramTypes = c.getParameterTypes();
                for (int i = 0; i < paramTypes.length; i++) {
                    if (i > 0) {
                        System.out.println(", ");
                    }
                    System.out.println(paramTypes[i].getName());
                }
                System.out.print(");");
            }
        }
    }

    public void printMethods(Class cl) {
        Method[] methods = cl.getDeclaredMethods();

        for (Method m : methods)

        {

            Class retType = m.getReturnType();

            String name = m.getName();

            System.out.print(" ");
            // print modifiers, return type and method name
            String modifiers = Modifier.toString(m.getModifiers());
            if (modifiers.length() > 0) System.out.print(modifiers + " ");
            System.out.print(retType.getName() + " " + name + "(");

            // print parameter types
            Class[] paramTypes = m.getParameterTypes();
            for (int j = 0; j < paramTypes.length; j++) {

                if (j > 0) System.out.print(", ");

                System.out.print(paramTypes[j].getName());
            }
            System.out.println(");");

        }
    }

    public static void printFields(Class cl) {
        Field[] fields = cl.getDeclaredFields();

        for (Field f : fields) {
            Class type = f.getType();
            String name = f.getName();
            System.out.print(" ");
            String modifiers = Modifier.toString(f.getModifiers());
            if (modifiers.length() > 0) System.out.print(modifiers + " ");
            System.out.println(type.getName() + " " + name + ";");
        }

    }


}