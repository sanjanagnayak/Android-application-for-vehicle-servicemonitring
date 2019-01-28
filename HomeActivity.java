package com.example.hp.firepro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    Button signinbutton;
    Button servbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        signinbutton = (Button)findViewById(R.id.button2);
        servbutton = (Button) findViewById(R.id.button);
        final Boolean isFirstRun = false;
                //getSharedPreferences("PREFERENCE",MODE_PRIVATE).getBoolean("isfirstrun",true);
        signinbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isFirstRun) {
                Intent intent = new Intent(HomeActivity.this, RegisterActivity.class);
                startActivity(intent);
                getSharedPreferences("PREFERENCE", MODE_PRIVATE).edit().putBoolean("isfirstrun", false).commit();
                 }
                 else
                {
                    Toast.makeText(HomeActivity.this,"hi",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(HomeActivity.this,Main2Activity.class);
                    startActivity(intent);
                    Toast.makeText(HomeActivity.this,"Loglll",Toast.LENGTH_SHORT).show();
                }
            }
        });

        servbutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(HomeActivity.this,DataCollector.class);
                startActivity(intent);
            }
        });
    }
}
