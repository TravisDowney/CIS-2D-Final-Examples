package com.example.dondo.example2.utilities;

import android.content.Context;
import android.util.Log;
import android.widget.TextView;

public class ActivityHelper {

    public static void log(Context context, TextView tv, String message, boolean append) {
        if (tv != null && message != null && message.length() > 0){
            if (append){
                tv.append(message + "\n");
            } else {
                tv.setText(message);
            }
            Log.i(context.getClass().getSimpleName(), message);
        }
    }

}