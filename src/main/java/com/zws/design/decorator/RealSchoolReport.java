package com.zws.design.decorator;

/**
 * @author zhengws
 * @date 2019-09-06 14:39
 */
public class RealSchoolReport extends SchoolReport {
    public void report() {
        System.out.println("真实成绩....");
    }

    public void sign(String name) {
        System.out.println(name + "签名成功.");
    }
}
