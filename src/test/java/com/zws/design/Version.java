package com.zws.design;

/**
 * @author zhengws
 * @date 2020-01-06 19:58
 */
public class Version {
    public static void main(String[] args) {
        Package pag = Version.class.getPackage();
        String version = pag.getImplementationVersion();
        System.out.println(version);
    }
}
