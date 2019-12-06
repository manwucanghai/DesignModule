package com.zws.design.proxy.staticproxy.normal;


/**
 * @author zhengws
 * @date 2019-09-02 18:03
 */
public class GamePlayer implements IGamePlayer {
    private String displayName = null;
    private IGamePlayer proxy;

    public GamePlayer(IGamePlayer proxy, String displayName) {
        if (proxy == null){
            throw new RuntimeException("请勿直接创建实体对象，通过代理进行调用");
        }
        this.proxy = proxy;
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
