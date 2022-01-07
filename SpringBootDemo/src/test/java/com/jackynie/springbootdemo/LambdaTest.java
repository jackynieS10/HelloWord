package com.jackynie.springbootdemo;

import com.jackynie.entity.Employe;
import com.jackynie.entity.PhoneCall;
import com.jackynie.lambdaface.MyLambdaInterFace;
import com.jackynie.mapper.PhoneCallMapper;
import com.jackynie.util.DateUtil;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 * @author jackynie
 * @create 2022 - 01 - 07 - 8:44
 */
@SpringBootTest
public class LambdaTest {

    @Resource
    private PhoneCallMapper phoneCallMapper;


    public void findPhoneForLambda() {
        List<PhoneCall> userList = this.phoneCallMapper.selectList(null);
        System.err.println(userList);

        for (PhoneCall pcll : userList) {
            System.err.println(pcll.getPhoneId() + " " + pcll.getPhoneName() + " " + pcll.getPhoneType() + " "
                    + pcll.getPhoneBrand() + " " + pcll.getPhoneCpu() + " " + pcll.getPhoneMemory() + " "
                    + DateUtil.dateFormat(pcll.getPublicDate()));
        }
    }


    public void LambdaIntegerComparator() {
        System.out.println("LambdaTest.LambdaOneTest" );

        // 原来的写法 2个数比较 用匿名内部类
        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1,o2);
            }
        };
        TreeSet<Integer> ts = new TreeSet<>(com);

        // Lambda 表达式做比较
        Comparator<Integer> com1 = (o1, o2) -> Integer.compare(o1,o2);
        TreeSet<Integer> ts1 = new TreeSet<>(com1);

    }

    // 初始化数据
    private List<Employe> resulstList = Arrays.asList(
            new Employe("张宇",29,2900.11),
            new Employe("张学友",48,3000.11),
            new Employe("张国荣",55,6000.11),
            new Employe("李霞",25,5100.11),
            new Employe("杨杰",35,7000.11),
            new Employe("邓丽",60,2100.11)
    );

    /**
     * 获取当前公司中员工年龄大于35的员工信息
     * @return employe 年龄大于35的员工信息集合
     */
    public void findAgefor35() {
        List<Employe> changeList = new ArrayList<>(); // 改变后的List集合
        for (Employe employe : resulstList) {
            if (employe != null) {
                if (employe.getEmpAge() >= 35) {
                    changeList.add(employe);
                }
            }
        }
        for (Employe employe1 : changeList) {
            System.out.print("年龄大于35" + employe1.getEmpName() + " " + employe1.getEmpAge() + " " + employe1.getSalary() + " ");
        }
    }

    /**
     * 获取当前公司中员工工資大于5000的员工信息
     * @return employe 工資大于5000的员工信息集合
     */
    public void findSalaryfor5000() {
        List<Employe> changeList = new ArrayList<>(); // 改变后的List集合
        for (Employe employe : resulstList) {
            if (employe != null) {
                if (employe.getSalary() >= 5000) {
                    changeList.add(employe);
                }
            }
        }
        for (Employe employe1 : changeList) {
            System.out.print("工資大于5000" + employe1.getEmpName() + " " + employe1.getEmpAge() + " " + employe1.getSalary() + " ");
        }
    }

    public void Salaryfor5000ForLambda() {
        List<Employe> resulstList = Arrays.asList(
                new Employe("张宇",29,2900.11),
                new Employe("张学友",48,3000.11),
                new Employe("张国荣",55,6000.11),
                new Employe("李霞",25,5100.11),
                new Employe("杨杰",35,7000.11),
                new Employe("邓丽",60,2100.11)
        );
        List<String> resulList = resulstList.stream().filter(s -> s.getSalary() >= 5000).limit(2).map(Employe::getEmpName).collect(Collectors.toList());
        List<Employe> tempList = resulstList.stream().filter(s -> s.getEmpName().startsWith("张")).collect(Collectors.toList());
        tempList.forEach(s -> System.out.println("LambdaTest.Salaryfor5000ForLambda" + s.getEmpName()));
        resulList.forEach(System.out::println);
    }

    @Test
    public void getPrivateLongforLambda() {
        System.out.println("LambdaTest.getPrivateLongforLambda" + this.getPrivateLong(100,num -> num * num));
    }


    public Integer getPrivateLong(Integer num, MyLambdaInterFace mif) {
        return  mif.findGetLong(num);
    }

    public static void main(String[] args) {
        System.out.println("2313 = " + 2313);
    }



}
