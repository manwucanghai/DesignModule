package com.zws.design.prototype;

import com.zws.design.prototype.clone.Mail;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author zhengws
 * @date 2019-07-24 19:21
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {

        Mail mail = new Mail();
        List<Object> list = new ArrayList<Object>();
        list.add("ahahahah");
        list.add(new Date(0L));
        mail.setContents(list);
        mail.setTitle("邮件标题");

        Mail clone = (Mail) mail.clone();

        System.out.println(mail);

        System.out.println(clone);
    }
}
