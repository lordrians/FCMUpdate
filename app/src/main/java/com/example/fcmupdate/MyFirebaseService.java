package com.example.fcmupdate;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class MyFirebaseService extends FirebaseMessagingService {
//    dYdKKnTv5YQ:APA91bEgtz9UNmQs1W-fv-skupkq38j2QH5u6yEatp_NFJCBmduZnMuz7bZz1qrqZiTbImb5Sfnk49BurAl6NxUYtb2a98c3YncSYzwqYOpPXvlJtA-XbwvgBrin0YxApbpZM0j67sTz
//    ePu2Si0m_KY:APA91bFB1bseDJ2Eg_-cEy3WRDlNbECxeUZJ6h4A88iQtj7ync0cP2PltO6eRcKf4LD7Vemrdkk9krM8VeIbcD3c_D4jTWkpYXSo4PsKIxO4ycm0h86AvtIhrS_XXmHkWaQQoTmt9TLv
    @Override
    public void onNewToken(String s) {
        Log.d("Token", "Token = " + s);

    }

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        if (remoteMessage.getNotification() != null){
            String title = remoteMessage.getNotification().getTitle();
            String body = remoteMessage.getNotification().getBody();

            NotificationHelper.displayNotification(getApplicationContext(), title, body);
        }
    }
}
