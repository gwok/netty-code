package com.spi;

import java.util.Iterator;
import java.util.ServiceLoader;

public class LogInvoke {
    public static Log getLog(){
        Log log = null;
        ServiceLoader<Log> serviceLoader = ServiceLoader.load(Log.class);
        Iterator<Log> iterator = serviceLoader.iterator();
        if(iterator.hasNext()){
            log = iterator.next();
        }
        return log;
    }
}
