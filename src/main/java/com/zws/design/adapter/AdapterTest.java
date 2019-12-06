package com.zws.design.adapter;

/**
 * @author zhengws
 * @date 2019-10-08 13:44
 */
public class AdapterTest {
    public static void main(String[] args) {
//        ClassAdapter classAdapter = new ClassAdapter();
//        int v = classAdapter.voltage5V();
//        System.out.println("输出电压为:"+ v + "V");
        ObjectAdapter objectAdapter = new ObjectAdapter(new AcAdaptee());
        int i = objectAdapter.voltage5V();
        System.out.println("输出电压为:"+ i + "V");
        /**
         *
         * 源电压220v
         * 将220v转换为5v..
         * 输出电压为:5V
         */
    }
}
