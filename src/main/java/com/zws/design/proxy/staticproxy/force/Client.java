package com.zws.design.proxy.staticproxy.force;

/**
 * @author zhengws
 * @date 2019-09-06 14:03
 */
public class Client {
    public static void main(String[] args) {
        IGamePlayer player = new GamePlayer("郑文山");
        IGamePlayer proxy = player.getProxy();
        proxy.login("zhengws", "1234");
        proxy.killBoss();
        proxy.upgrade();
    }
}
