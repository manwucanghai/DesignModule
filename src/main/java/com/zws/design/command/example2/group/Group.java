package com.zws.design.command.example2.group;

/**
 * @author zhengws
 * @date 2019-12-26 06:57
 */
public interface Group {
    /**
     * 找到组别
     */
    void find();

    /**
     * 添加内容
     */
    void add();

    /**
     * 删除内容
     */
    void delete();

    /**
     * 修改内容
     */
    void change();

    /**
     * 变更计划
     */
    void plan();
}
