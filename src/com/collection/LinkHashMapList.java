package com.collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkHashMapList {
    public static void main(String[] args) {
        Map<String,String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("zhangsan","20");
        linkedHashMap.put("lisi","30");
        linkedHashMap.put("alone","10");
//        for (String key : linkedHashMap.keySet()){
//            System.out.println(key + ": " + linkedHashMap.get(key));
//        }

        // lamda
        linkedHashMap.forEach((key,value)-> System.out.println(key+","+value));

        //sort
//        linkedHashMap.entrySet().
//                stream().
//                sorted(Map.Entry.comparingByKey()).
//                forEach(System.out::println);
    }
}
