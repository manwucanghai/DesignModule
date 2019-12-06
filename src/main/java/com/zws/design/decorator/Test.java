package com.zws.design.decorator;

/**
 * @author zhengws
 * @date 2019-09-06 14:45
 */
public class Test {
    public static void main(String[] args) {
        SchoolReport report = new RealSchoolReport();
        report = new HightScoreSchoolReportDecorator(report);
        report = new SortSchoolReportDecorator(report);

        report.report();
        report.sign("郑文山");
    }
}
