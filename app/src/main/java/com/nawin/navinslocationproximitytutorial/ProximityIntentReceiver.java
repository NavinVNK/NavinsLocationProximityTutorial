package com.nawin.navinslocationproximitytutorial;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;
import android.util.Log;
import android.widget.Toast;

public class ProximityIntentReceiver extends BroadcastReceiver {
    private static final int NOTIFICATION_ID = 1000;
    @Override
    public void onReceive(Context context, Intent intent) {
        String key = LocationManager.KEY_PROXIMITY_ENTERING;
       Boolean entering = intent.getBooleanExtra(key, false);
        if (entering) {
            Log.d("Location", "entering");
            Toast.makeText(context,"Entering the region" ,Toast.LENGTH_LONG).show();
        }

        else {

            Log.d("Location", "exiting");
            Toast.makeText(context,"Exiting the region" ,Toast.LENGTH_LONG).show();
        }
       /* NotificationManager notificationManager =
                (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        PendingIntent pendingIntent = PendingIntent.getActivity(context, 0, null, 0);
        NotificationCompat notification ;//= createNotification();
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context);
        builder.setAutoCancel(false);
        builder.setTicker("this is ticker text");
        builder.setContentTitle("WhatsApp Notification");
        builder.setContentText("You have a new message");
        builder.setSmallIcon(R.drawable.pills5);
        builder.setContentIntent(pendingIntent);
        builder.setOngoing(true);
        builder.setSubText("This is subtext...");   //API level 16
        builder.setNumber(100);
        //builder.build();
       // notification=builder.build();
        notificationManager.notify(NOTIFICATION_ID, builder.build());*/
    }



}