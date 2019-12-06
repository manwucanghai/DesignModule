package com.zws.design.proxy.staticproxy.normal;

/**
 * @author zhengws
 * @date 2019-09-06 13:54
 */
public class GamePlayerProxy implements IGamePlayer{
    private IGamePlayer player;

    public GamePlayerProxy(String displayName) {
        player = new GamePlayer(this, displayName);
    }

    public void login(String username, String password) {
        player.login(username, password);
    }

    public void killBoss() {
        player.killBoss();
    }

    public void upgrade() {
        player.upgrade();
    }
}
