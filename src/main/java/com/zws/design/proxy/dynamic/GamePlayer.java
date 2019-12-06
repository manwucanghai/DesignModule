package com.zws.design.proxy.dynamic;

/**
 * @author zhengws
 * @date 2019-09-02 18:03
 */
public class GamePlayer implements IGamePlayer {
    private String displayName = null;

    public GamePlayer(String displayName) {
        this.displayName = displayName;
    }

    public void login(String username, String password) {
        System.out.println("用户名"+username + "登陆成功，显示名称为: " + this.displayName);
    }

    public void killBoss() {
        System.out.println("开始打怪");
    }

    public void upgrade() {
        System.out.println("开始升级..");
    }
}
