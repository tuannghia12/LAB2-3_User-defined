    package com.example.lab2_3_user_defined;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyBrocast extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String input = intent.getStringExtra("poly");
            if (input.equals("MEM537128")){
                Toast.makeText(context,"Bạn được khuyến mãi 10%",Toast.LENGTH_LONG).show();
            }
            else if (input.equals("MEM537129")){
            Toast.makeText(context,"Bạn được khuyến mãi 20%",Toast.LENGTH_LONG).show();
            }
            else if (input.equals("VIP537128")){
            Toast.makeText(context,"Bạn được khuyến mãi 30%",Toast.LENGTH_LONG).show();
            }
            else if (input.equals("VIP537129")){
                Toast.makeText(context,"Bạn được khuyến mãi 30%",Toast.LENGTH_LONG).show();
            }
            else if (input.substring(0,3).equals("MEN")){
                Toast.makeText(context,"Bạn được khuyến mãi 10 - 20%",Toast.LENGTH_LONG).show();
            }
            else if (input.substring(0,3).equals("VIP")){
                Toast.makeText(context,"Bạn được khuyến mãi 30 - 50%",Toast.LENGTH_LONG).show();
            }
            else {
                Toast.makeText(context," KHÔNG CÓ KHUYẾN MÃI",Toast.LENGTH_LONG).show();
            }
    }
}   
