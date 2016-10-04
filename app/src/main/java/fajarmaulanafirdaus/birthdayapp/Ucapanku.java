package fajarmaulanafirdaus.birthdayapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by heimdall on 9/30/16
 * This is the second classes for the second activity. Happy to finally solved (?) this :))
 */

public class Ucapanku extends AppCompatActivity{
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view2);
    }

    public void onBackPressed(){
        /*
        * Done nih, ngga tau, mungkin ada implementasi yang lebih cakep dari ini?
        */
        Intent intent2 = new Intent(this, MainActivity.class);
        startActivity(intent2);
        finish();

    }

}
