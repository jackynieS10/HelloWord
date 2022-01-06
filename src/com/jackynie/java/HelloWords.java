package com.jackynie.java;

import java.util.ArrayList;
import java.util.List;

public class HelloWords {

    public static void main(String[] args) {

        List<String> tempList = new ArrayList<String>();
        tempList.add("1");
        tempList.add("2");
        tempList.add("3");
        System.out.println("HelloWords" + "wwww");
        for (int i = 0; i < tempList.size();i++) {
            System.out.println(tempList.get(i));
        }

    }

}
