package com.zws.design;


import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author zhengws
 * @date 2019-07-22 14:07
 */
public class ArgsToMapTest {
    public static void main(String[] args) {
        String str = "java=version.1,python=version2.2";

        final Map<String, String> map = new HashMap<String, String>();
        Scanner scanner = new Scanner(str);
        scanner.useDelimiter("\\s*,\\s*");

        while (scanner.hasNext()){
            String token = scanner.next();
            int assign = token.indexOf('=');

            if (assign == -1) {
                map.put(token, "");
            } else {
                String key = token.substring(0, assign);
                String value = token.substring(assign + 1);
                map.put(key, value);
            }
        }
        scanner.close();
        // 生成不可修改的map.
        Map<String, String> map1 = Collections.unmodifiableMap(map);
        System.out.println(map1);
        /**
         * Exception in thread "main" java.lang.UnsupportedOperationException
         */
        map1.put("adaa", "cccc");
        System.out.println(map1);
    }
}
