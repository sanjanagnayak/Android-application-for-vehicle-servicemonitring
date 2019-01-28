package com.example.hp.firepro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;


public class DataCollect3 extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_collect3);
        button = (Button)findViewById(R.id.button5);

        Spinner streeing = findViewById(R.id.spinner2);
        ArrayAdapter<CharSequence> sadapter = ArrayAdapter.createFromResource(this,R.array.SteeringSmoothOp,android.R.layout.simple_spinner_item);
        sadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        streeing.setAdapter(sadapter);
        streeing.setOnItemSelectedListener(this);

        Spinner frontwheel = findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> fadapter = ArrayAdapter.createFromResource(this,R.array.FrontWheel,android.R.layout.simple_spinner_item);
        fadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        frontwheel.setAdapter(fadapter);
        frontwheel.setOnItemSelectedListener(this);

        Spinner kickStarter = findViewById(R.id.spinner3);
        ArrayAdapter<CharSequence> kadapter = ArrayAdapter.createFromResource(this,R.array.KickStarter,android.R.layout.simple_spinner_item);
        kadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        kickStarter.setAdapter(sadapter);
        kickStarter.setOnItemSelectedListener(this);

        Spinner brakeEfficency = findViewById(R.id.spinner4);
        ArrayAdapter<CharSequence> badapter = ArrayAdapter.createFromResource(this,R.array.BrakeEfficiency,android.R.layout.simple_spinner_item);
        badapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        brakeEfficency.setAdapter(badapter);
        brakeEfficency.setOnItemSelectedListener(this);

        Spinner Carburretor = findViewById(R.id.spinner5);
        ArrayAdapter<CharSequence> cadapter = ArrayAdapter.createFromResource(this,R.array.CarburretorBreathHose,android.R.layout.simple_spinner_item);
        cadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Carburretor.setAdapter(cadapter);
        Carburretor.setOnItemSelectedListener(this);


        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(DataCollect3.this,Entry.class);
                startActivity(intent);
            }
        });


    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

        if(adapterView.getItemAtPosition(i).equals("choose"))
        {

        }
        else{
            String text = adapterView.getItemAtPosition(i).toString();
        }


    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
