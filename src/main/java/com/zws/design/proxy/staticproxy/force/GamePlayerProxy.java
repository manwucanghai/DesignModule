package com.zws.design.proxy.staticproxy.force;

/**
 * @author zhengws
 * @date 2019-09-06 14:00
 */
public class GamePlayerProxy implements IGamePlayer {
    private IGamePlayer player;

    public GamePlayerProxy(IGamePlayer player) {
        this.player = player;
    }

    public void login(String username, String password) {
        this.player.login(username, password);
    }

    public void killBoss() {
        this.player.killBoss();
    }

    public void upgrade() {
        this.player.upgrade();
    }

    public IGamePlayer getProxy() {
        return null;
    }
}
