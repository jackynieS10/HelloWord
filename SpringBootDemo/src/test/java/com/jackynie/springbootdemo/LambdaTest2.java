package com.jackynie.springbootdemo;

import org.junit.jupiter.api.Test;
import java.util.Comparator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;

/**
 * @author jackynie
 * Lambda 表达式基础语法
 * JDK1.8引入了一种新的操作符号 "->" 箭头操作符 或者 叫做 Lambda操作符
 * 箭头操作符 将 Lambda 表达式 拆分成两部分
 * 左侧：Lambda 表达式的 参数列表
 * 右侧：Lambda 表达式中所需执行的功能，即 Lambda 体
 *
 * 语法格式1：无参数，无返回值
 *     () -> System.out.println("LambdaTest2.test1");
 *
 * 语法格式2：有一个参数，无返回值
 *     s -> System.out.println(s);  // 只有一个参数可以不要括号
 *
 * 语法格式3：有两个或者以上的参数，有返回值，并且Lambda体中有多条语句
 *          Comparator<Integer> com = (x,y) -> {
 *             String temp = " 人类的起源";
 *             System.out.println("有两个或者以上的参数，有返回值，并且Lambda体中有多条语句" + temp);
 *             return  Integer.compare(x,y);
 *         };
 *
 * 语法格式4：如果Lambda体中只有一条语句，return 和 大括号都不需要写(有返回值的情况)
 *      (o1, o2) -> Integer.compare(o1,o2);
 *
 * 语法格式5：Lambda 表达式的参数列表的数据类型可以不写。因为JVM编译器通过上下文推断出，数据类型，即：“类型推断”
 *      new ConcurrentHashMap 后面的 <> 可以不写 因为前面声明了的
 *
 *  上联：左右遇一括号省
 *  下联：左侧推断类型省
 *  横批：能省就省
 *  二、Lambda表达式需要"函数式接口"支持
 *  函数式接口 : 接口中只有一个抽象方法的接口 就是 函数式接口 。
 *  可以使用注解 @FunctionalInterface 声明 这个接口是函数式接口 并且只有一个抽象方法
 *
 * @create 2022 - 01 - 07 - 15:25
 */

public class LambdaTest2 {

    /**
     * 语法格式1：无参数，无返回值
     * () -> System.out.println("LambdaTest2.test1");
     */
    public void test1() {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("LambdaTest2.run " );
            }
        };
        r.run();
        Runnable r1 = () -> System.out.println("LambdaTest2.test1");
        r1.run();
    }

    /**
     * 有一个参数，无返回值
     * s -> System.out.println(s);  // 只有一个参数可以不要括号
     */
    public void test2() {
        // Lambda 表达式 就是对 Consumer 这个接口中accept这个方法的实现
        Consumer<String> con = s -> System.out.println(s);
        con.accept("把参数S传到Lambda体并且打印出来");
    }

    /**
     * 有两个或者以上的参数，有返回值，并且Lambda体中有多条语句
     */
    public void test3() {
        Comparator<Integer> com = (x,y) -> {
            String temp = " 人类的起源";
            System.out.println("有两个或者以上的参数，有返回值，并且Lambda体中有多条语句" + temp);
            return  Integer.compare(x,y);
        };
        com.compare(1,3);
    }


    /**
     * 如果Lambda体中只有一条语句，return 和 大括号都不需要写(有返回值的情况)
     * (o1, o2) -> Integer.compare(o1,o2);
     */
    @Test
    public void test4() {
        Comparator<Integer> com = (o1, o2) -> Integer.compare(o1,o2);
        System.out.println("LambdaTest2.test4 " + com.compare(4,2));
    }

    /**
     * Lambda 表达式的参数列表的数据类型可以不写。因为JVM编译器通过上下文推断出，数据类型，即：“类型推断”
     * new ConcurrentHashMap 后面的 <> 可以不写 因为前面声明了的
     */
    public void test5() {

        Map<String, Object> tempMap = new ConcurrentHashMap<>();
    }


    public static void main(String[] args) {

    }

}
