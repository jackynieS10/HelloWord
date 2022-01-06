package com.jackynie.bean;

/**
 * @author jackynie
 * @create 2022 - 01 - 05 - 15:33
 */
public class Tuser {

    private  Long tid;

    private  String t_name;

    private  int age;

    public Long getTid() {
        return tid;
    }

    public String getT_name() {
        return t_name;
    }

    public int getAge() {
        return age;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }

    public void setT_name(String t_name) {
        this.t_name = t_name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
