package com.canmeng.observerpattern;

/**
 * @ClassName OctalObserver
 * @Description TODO
 * @Author mkz
 * @Date 20/1/13 14:00
 * @Version 1.0
 **/
public class OctalObserver extends Observer{

    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Octal String: "
                + Integer.toOctalString( subject.getState() ) );
    }
}
