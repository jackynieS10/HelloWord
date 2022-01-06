package com.jackynie.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author jackynie
 * @create 2022 - 01 - 05 - 18:27
 */
public class TestMap {


    public static void main(String[] args) {

       Map<String, Object> hashMap = new ConcurrentHashMap<String,Object>();
        if (hashMap != null) {
            hashMap.put("key",3231);
        }

        List<String> resultList = new ArrayList<>();
        Map<String,Object> resultMap = new ConcurrentHashMap<>();


    }

}
