package com.example.auser.myobserverpattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 產生一間報社
        NewspaperOffice office = new NewspaperOffice();

        // Arvin 想要訂閱報紙
        Customer arvin = new Customer("Arvin");
        office.SubscribeNewspaper(arvin);

        // Jack 想要訂閱報紙
        Customer jack = new Customer("Jack");
        office.SubscribeNewspaper(jack);

        // 報社發送了第一則新聞
        office.SendNewspaper("News One.......");

        // Arvin 不想看報紙了，要退訂
        office.UnsubscribeNewspaper(arvin);

        // 報社發送了第二則新聞
        office.SendNewspaper("News Two.......");

//        Console.Read();
//        Console.Read();
    }

}
