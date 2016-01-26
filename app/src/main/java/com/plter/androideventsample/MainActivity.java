package com.plter.androideventsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.plter.ae.AEApplication;
import com.plter.ae.Event;
import com.plter.ae.EventListener;

public class MainActivity extends AppCompatActivity {

    private EventListener<Event> pConnectedListener = new EventListener<Event>(Events.POWER_CONNECTED) {
        @Override
        public boolean onReceive(Event event, Object target) {
            tv.setText(event.getName());
            return false;
        }
    };

    private EventListener<Event> pDisconnectedListener = new EventListener<Event>(Events.POWER_DISCONNECTED) {
        @Override
        public boolean onReceive(Event event, Object target) {
            tv.setText(event.getName());
            return false;
        }
    };

    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView) findViewById(R.id.tv);
    }


    private AEApplication getApp(){
        return (AEApplication) getApplicationContext();
    }

    @Override
    protected void onResume() {
        super.onResume();

        getApp().add(pConnectedListener);
        getApp().add(pDisconnectedListener);
    }

    @Override
    protected void onPause() {
        super.onPause();

        getApp().remove(pConnectedListener);
        getApp().remove(pDisconnectedListener);
    }
}
