package com.zws.design.decorator;

/**
 * @author zhengws
 * @date 2019-09-06 14:44
 */
public class SortSchoolReportDecorator extends SchoolReportDecorator {
    public SortSchoolReportDecorator(SchoolReport schoolReport) {
        super(schoolReport);
    }

    @Override
    void report() {
        super.report();
        System.out.println("报告班级排名信息...");
    }

    @Override
    void sign(String name) {
        super.sign(name);
    }
}
