package com.example.auser.myobserverpattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class NewspaperOffice extends AppCompatActivity implements ISubject{
    List<IObserver> lstObservers; // 使用List來存放觀察者名單

    public NewspaperOffice()
    {
        lstObservers = new ArrayList();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newspaper_office);
    }

    @Override// 加入觀察者
    public void RegisterObserver(IObserver pObserver) {
        lstObservers.add(pObserver);

    }

    @Override// 移除觀察者
    public void RemoveObserver(IObserver pObserver) {
        if (lstObservers.indexOf(pObserver) >= 0)
            lstObservers.remove(pObserver);
    }

    @Override// 發送通知給在監聽名單中的觀察者
    public void notifyObservers(String pContent) {
        for(IObserver observer : lstObservers)
        {
            Log.d("mynew,obseretMyName=",((Customer)observer).getMyName()+"");
//            Log.d("mynew,observer=",observer.getClass()+"");
            observer.Update(pContent);
        }
//
//        for(IObserver observer : lstObservers)
//        {
//            Log.d("mynew,observer=",observer.getClass()+"");
//            observer.Update(pContent);
//        }


    }
    // 訂閱報紙
    public void SubscribeNewspaper(IObserver pCustomer)
    {
        RegisterObserver(pCustomer);
    }
    // 取消訂閱報紙
    public void UnsubscribeNewspaper(IObserver pCustomer)
    {
        RemoveObserver(pCustomer);
    }
    // 發送新消息
    public void SendNewspaper(String pContent)
    {
//        Console.WriteLine("Send News..");
        Log.d("mynew","Send News..");
        notifyObservers(pContent);
    }
}
