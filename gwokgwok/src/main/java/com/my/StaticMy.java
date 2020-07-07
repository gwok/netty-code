package com.my;

public class StaticMy {
    static {
        System.out.println("运行了静态代码块");
//        System.out.println(i);
    }
    {
        System.out.println("运行了非静态代码块");
    }
    public  B b = new B();

    public static  Integer i = new Integer(10);
    static public  A a =  new A();



    static void diuLei(){
        System.out.println("调用了静态方法");
    }

}
