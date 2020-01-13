package com.canmeng.observerpattern;

/**
 * @ClassName Observer
 * @Description TODO
 * @Author mkz
 * @Date 20/1/13 13:58
 * @Version 1.0
 **/
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
