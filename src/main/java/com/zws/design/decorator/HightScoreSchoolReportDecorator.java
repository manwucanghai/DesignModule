package com.zws.design.decorator;

/**
 * @author zhengws
 * @date 2019-09-06 14:42
 */
public class HightScoreSchoolReportDecorator extends SchoolReportDecorator {
    public HightScoreSchoolReportDecorator(SchoolReport schoolReport) {
        super(schoolReport);
    }

    @Override
    void report() {
        System.out.println("报告最高成绩如下....");
        super.report();
    }

    @Override
    void sign(String name) {
        super.sign(name);
    }
}
