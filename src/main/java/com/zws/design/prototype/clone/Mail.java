package com.zws.design.prototype.clone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zhengws
 * @date 2019-07-24 19:22
 */
public class Mail implements Cloneable {
    private String title;
    private List<Object> contents;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Object> getContents() {
        return contents;
    }

    public void setContents(List<Object> contents) {
        this.contents = contents;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Mail clone = (Mail) super.clone();
        clone.setContents(new ArrayList<Object>(contents));
        return clone;
    }

    @Override
    public String toString() {
        return "Mail{" +
                "title='" + title + '\'' +
                ", contents=" + contents +
                '}' + super.toString();
    }
}
