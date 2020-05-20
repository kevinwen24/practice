package com.string;

public class Stringtest {
    public static void main(String[] args) {
        int a =10;
        String.valueOf(10);
        Integer.parseInt("1");
        Integer i = null;
        System.out.println(String.valueOf(i));
        System.out.println(String.valueOf(1));
        System.out.println(String.valueOf("null"));
        String.valueOf(null);
    }
    public static String valueOf(char data[]) {
        char[] data1 = "null".toCharArray();
        return new String(data);
    }
}
