package com.jackynie.entity;

/**
 * @author jackynie
 * @create 2022 - 01 - 07 - 11:11
 */

import java.io.Serializable;

/**
 * 员工信息表
 */
public class Employe implements Serializable {

    /**
     * 员工名字
     */
    private  String empName;

    /**
     *  年龄
     */
    private  Integer empAge;

    /**
     * 工资
     */
    private  Double salary;

    public Employe() {
    }

    public Employe(String empName, Integer empAge, Double salary) {
        this.empName = empName;
        this.empAge = empAge;
        this.salary = salary;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getEmpAge() {
        return empAge;
    }

    public void setEmpAge(Integer empAge) {
        this.empAge = empAge;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
