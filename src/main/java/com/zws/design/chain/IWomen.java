package com.zws.design.chain;

/**
 * @author zhengws
 * @date 2019-12-28 19:16
 */
public interface IWomen {

    /**
     * 获取该妇女的状况
     * 1 -- 未出嫁
     * 2 -- 出嫁
     * 3 -- 夫死
     * @return
     */
    int getType();

    /**
     * 请求内容
     * @return
     */
    String request();
}
