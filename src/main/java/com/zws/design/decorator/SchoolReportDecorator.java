package com.zws.design.decorator;

/**
 * @author zhengws
 * @date 2019-09-06 14:40
 */
public class SchoolReportDecorator extends SchoolReport {
    private SchoolReport schoolReport;

    public SchoolReportDecorator(SchoolReport schoolReport) {
        this.schoolReport = schoolReport;
    }

    void report() {
        this.schoolReport.report();
    }

    void sign(String name) {
        this.schoolReport.sign(name);
    }
}
