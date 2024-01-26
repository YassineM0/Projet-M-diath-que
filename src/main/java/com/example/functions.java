package com.example;

import java.util.LinkedList;


public class functions {
    public String listToString(LinkedList<String> list) {
        String result = "";
        for(String str:list) {
            result += str;
            result += ',';
        }
        return result.substring(0,result.length()-1);
    }
    public LinkedList<String> StringToList(String s) {
        LinkedList<String> result = new LinkedList<>();
        String[] str = s.split(s, ',');
        for(String ss:str) {
            result.add(ss);
        }
        return result;
    }
}
