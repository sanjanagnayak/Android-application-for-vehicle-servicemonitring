package com.example.hp.firepro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class UserActivity extends AppCompatActivity implements View.OnClickListener{

    private CardView profileCardView,historyCardView,serviceCardView,locationCardView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        profileCardView = findViewById(R.id.profileCardViewId);
        serviceCardView = findViewById(R.id.serviceCardViewId);
        historyCardView = findViewById(R.id.historyCardViewId);
        locationCardView = findViewById(R.id.locationCardViewId);

        profileCardView.setOnClickListener(this);
        historyCardView.setOnClickListener(this);
        serviceCardView.setOnClickListener(this);
        locationCardView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId())
        {
            case R.id.profileCardViewId:
            {
                intent = new Intent(this,Profile.class);
                startActivity(intent);
                break;
            }

            case R.id.serviceCardViewId:
            {
                intent = new Intent(this,Service.class);
                startActivity(intent);
                break;
            }

            case R.id.historyCardViewId:
            {
                intent = new Intent(this,History.class);
                startActivity(intent);
                break;
            }

            case R.id.locationCardViewId:
            {
                intent = new Intent(this,Location.class);
                startActivity(intent);
                break;
            }
        }

    }
}
