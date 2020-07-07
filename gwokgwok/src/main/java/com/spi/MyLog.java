package com.spi;

public class MyLog implements Log {
    @Override
    public void info(String msg) {
        System.out.println("我实现的日志"+msg);
    }
}
