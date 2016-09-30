package fajarmaulanafirdaus.birthdayapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttoncok = (Button) findViewById(R.id.button);
        buttoncok.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent newIntent = new Intent(view.getContext(), Ucapanku.class);
                startActivity(newIntent);
                finish(); //difinish, biar ga makan memori? biar ga numpuk activity?
            }
        });
    }

}
