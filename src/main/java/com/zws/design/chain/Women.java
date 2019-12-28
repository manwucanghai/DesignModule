package com.zws.design.chain;

/**
 * @author zhengws
 * @date 2019-12-28 19:25
 */
public class Women implements IWomen {

    private int type;

    public Women(int type) {
        this.type = type;
    }

    public int getType() {
        return this.type;
    }

    public String request() {
        String content = null;
        switch (type) {
            case 1:
                content = "来自女儿的请求";
                break;
            case 2:
                content = "来自妻子的请求";
                break;
            case 3:
                content = "来自母亲的请求";
                break;
            default:
                throw new RuntimeException("该状态不在处理范围内");
        }
        return content;
    }
}
