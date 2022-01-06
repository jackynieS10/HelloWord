package com.jackynie.java;

import com.jackynie.bean.jackynieClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author jackynie
 * @create 2022 - 01 - 05 - 16:09
 * 1、IDEA中代码模板所处的位置  settings- Editor - Live Templates / Postfix completion
 * Live Templates 可以改   Postfix completion 只能用不能改
 * 2、
 * 3、
 */
public class TemplatesTest {

    private static final jackynieClass jackynieClasss = new jackynieClass();

    public static final int EMDT = 10;




    public static void main(String[] args) {

        List<String> resultList = new ArrayList<>();
        resultList.add("张1");
        resultList.add("张2");
        resultList.add("张3");
        resultList.add("张4");
        resultList.add("张5");

        // fori
        for (int i = 0; i < resultList.size(); i++) {
            System.out.println("TemplatesTest.main " + resultList.get(i));
        }

        Map

        // iter 增强for循环
        for (String result : resultList) {
            System.out.println("TemplatesTest.main 增强for循环 " + result);
        }

        // itar 遍历数组
        for (int i = 0; i < args.length; i++) {
            String arg = args[i];

        }

        // resultList.forr 倒序遍历
        for (int i = resultList.size() - 1; i >= 0; i--) {
            
        }

        if (resultList == null) {
            
        }
        if (resultList != null) {
            
        }

        if (resultList != null) {

        }

        if (resultList == null) {

        }


    }

}
