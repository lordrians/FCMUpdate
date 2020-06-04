package com.example.fcmupdate;

import android.content.Context;

import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

public class NotificationHelper {


    public static void displayNotification(Context context, String title, String body){
        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(context , MainActivity.CHANNEL_ID);
        mBuilder.setSmallIcon(R.mipmap.ic_launcher)
                .setContentTitle(title)
                .setContentText(body)
                .setPriority(NotificationCompat.PRIORITY_DEFAULT);

        NotificationManagerCompat mNotifMngr = NotificationManagerCompat.from(context);
        mNotifMngr.notify(1,mBuilder.build());
    }

}
