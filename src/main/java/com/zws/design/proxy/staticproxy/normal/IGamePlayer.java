package com.zws.design.proxy.staticproxy.normal;

/**
 * @author zhengws
 * @date 2019-09-02 18:03
 */
public interface IGamePlayer {
    void login(String username, String password);

    void killBoss();

    void upgrade();
}
