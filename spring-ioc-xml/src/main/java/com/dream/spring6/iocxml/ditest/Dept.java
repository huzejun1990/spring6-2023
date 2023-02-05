package com.dream.spring6.iocxml.ditest;

import java.util.List;

/**
 * @Author : huzejun
 * @Date: 2023/2/4-2:46
 */

//部门类
public class Dept {

    //一个部门有很多员工
    private List<Emp> empList;

    private String dname;

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public List<Emp> getEmpList() {
        return empList;
    }

    public void setEmpList(List<Emp> empList) {
        this.empList = empList;
    }

    public void info() {
        System.out.println("部门名称：" + dname);
        for (Emp emp:empList) {
            System.out.println(emp.getEname());
        }
    }
}
