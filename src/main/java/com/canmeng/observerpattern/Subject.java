package com.canmeng.observerpattern; /**
 * @ClassName Subject
 * @Description TODO
 * @Author mkz
 * @Date 20/1/13 13:58
 * @Version 1.0
 **/
import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> observers
            = new ArrayList<Observer>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
