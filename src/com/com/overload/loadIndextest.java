package com.com.overload;

import java.io.Serializable;

public class loadIndextest {
    public static void sayHello(Object arg) { System.out.println("Object"); }
    public static void sayHello(int arg) { System.out.println("int"); }
    public static void sayHello(long arg) { System.out.println("long"); }
    public static void sayHello(Character arg) { System.out.println("Character"); }
    public static void sayHello(char arg) { System.out.println("char"); }
    public static void sayHello(char... arg) { System.out.println("char..."); }
    public static void sayHello(Serializable arg) { System.out.println("Serializable"); }


    public static void main(String[] args) {
        loadIndextest.sayHello('q');
    }
}
