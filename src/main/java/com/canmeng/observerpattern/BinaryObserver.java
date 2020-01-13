package com.canmeng.observerpattern;

/**
 * @ClassName BinaryObserver
 * @Description TODO
 * @Author mkz
 * @Date 20/1/13 13:59
 * @Version 1.0
 **/
public class BinaryObserver extends Observer{

    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Binary String: "
                + Integer.toBinaryString( subject.getState() ) );
    }
}