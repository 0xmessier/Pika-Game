package ik.dev.testgame;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by İsmail Kaya on 28.08.2017.
 */

public class pika_rec extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        Intent service = new Intent(context, pika_service.class);
        context.startService(service);

    }
}