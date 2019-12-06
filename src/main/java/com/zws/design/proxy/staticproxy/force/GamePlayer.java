package com.zws.design.proxy.staticproxy.force;


/**
 * @author zhengws
 * @date 2019-09-02 18:03
 */
public class GamePlayer implements IGamePlayer {
    private String displayName = null;
    private IGamePlayer proxy;

    public GamePlayer(String displayName) {
        this.displayName = displayName;
    }

    public void login(String username, String password) {
        if (isProxy()){
            System.out.println("用户名"+username + "登陆成功，显示名称为: " + this.displayName);
        }
    }

    public void killBoss() {
        if (isProxy()){
            System.out.println("开始打怪");
        }
    }

    public void upgrade() {
        if (isProxy()){
            System.out.println("开始升级..");
        }
    }

    public IGamePlayer getProxy() {
        proxy = new GamePlayerProxy(this);
        return this.proxy;
    }

    private boolean isProxy(){
        return this.proxy != null;
    }
}
