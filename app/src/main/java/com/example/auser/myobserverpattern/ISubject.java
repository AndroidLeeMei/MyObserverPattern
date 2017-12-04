package com.example.auser.myobserverpattern;

/**
 * Created by auser on 2017/12/4.
 */

public interface ISubject {
    void RegisterObserver(IObserver pObserver);
    void RemoveObserver(IObserver pObserver);
    void notifyObservers(String pContent);
}
