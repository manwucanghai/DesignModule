package com.zws.design.proxy.staticproxy.normal;

/**
 * @author zhengws
 * @date 2019-09-06 13:58
 */
public class Client {
    public static void main(String[] args) {
        IGamePlayer proxy = new GamePlayerProxy("郑文山");
        proxy.login("zhengws", "1234");
        proxy.killBoss();
        proxy.upgrade();
    }
}
