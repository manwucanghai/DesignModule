package com.zws.design.proxy.dynamic;

/**
 * @author zhengws
 * @date 2019-09-02 18:15
 */
public class Client {
    public static void main(String[] args) {
        IGamePlayer player = new GamePlayer("郑文山");
        IGamePlayer proxy = DynamicProxy.newProxyInstance(player);
        proxy.login("zhengws", "1234");
        proxy.killBoss();
        proxy.upgrade();
    }
}
