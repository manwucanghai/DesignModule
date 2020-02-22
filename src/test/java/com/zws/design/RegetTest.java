package com.zws.design;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author zhengws
 * @date 2020-01-06 20:07
 */
public class RegetTest {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("(?>[+-]?(?:(?:[0-9]+(?:\\.[0-9]+)?)|(?:\\.[0-9]+)))");

        Matcher matcher = pattern.matcher("     -3");
        System.out.println(matcher.find());
        System.out.println(matcher.group(0));
    }
}
