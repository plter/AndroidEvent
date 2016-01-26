package com.plter.androideventsample;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.plter.ae.AEApplication;
import com.plter.ae.Event;

/**
 * Created by plter on 1/26/16.
 */
public class PowerDisconnectedReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        ((AEApplication)context.getApplicationContext()).dispatch(new Event(Events.POWER_DISCONNECTED));
    }
}
