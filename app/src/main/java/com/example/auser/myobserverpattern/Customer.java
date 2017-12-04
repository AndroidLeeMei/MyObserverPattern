package com.example.auser.myobserverpattern;

import android.util.Log;

/**
 * Created by auser on 2017/12/4.
 */

public class Customer implements IObserver {
    String myName;

    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }

    public Customer(String pName)
    {
        myName = pName;
    }
    @Override// 更新最新消息
    public void Update(String pMessage) {
        Log.d("mynews","   {" + myName + "} receive a new message:{" + pMessage + "}");
//        Conso…le.WriteLine("   {0} receive a new message:{1}", MyName, pMessage);

    }
}
