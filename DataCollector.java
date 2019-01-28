package com.example.hp.firepro;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class DataCollector extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    FloatingActionButton mybutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_collector);
        mybutton = (FloatingActionButton)findViewById(R.id.floatingActionButton);

        Spinner cluchSpin = findViewById(R.id.spinner2);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.Cluch,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        cluchSpin.setAdapter(adapter);
        cluchSpin.setOnItemSelectedListener(this);

        Spinner engineSpin = findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> eadapter = ArrayAdapter.createFromResource(this,R.array.Engine_oil,android.R.layout.simple_spinner_item);
        eadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        engineSpin.setAdapter(eadapter);
        engineSpin.setOnItemSelectedListener(this);

        Spinner oilSpin = findViewById(R.id.spinner3);
        ArrayAdapter<CharSequence> oadapter = ArrayAdapter.createFromResource(this,R.array.Oil_Filter,android.R.layout.simple_spinner_item);
        oadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        oilSpin.setAdapter(oadapter);
        oilSpin.setOnItemSelectedListener(this);

        Spinner sparkSpin = findViewById(R.id.spinner4);
        ArrayAdapter<CharSequence> sadapter = ArrayAdapter.createFromResource(this,R.array.Spark_plug,android.R.layout.simple_spinner_item);
        sadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sparkSpin.setAdapter(sadapter);
        sparkSpin.setOnItemSelectedListener(this);

        Spinner transSpin = findViewById(R.id.spinner5);
        ArrayAdapter<CharSequence> tadapter = ArrayAdapter.createFromResource(this,R.array.TransmissionOil,android.R.layout.simple_spinner_item);
        tadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        transSpin.setAdapter(tadapter);
        transSpin.setOnItemSelectedListener(this);

        Spinner batterySpin = findViewById(R.id.spinner6);
        ArrayAdapter<CharSequence> badapter = ArrayAdapter.createFromResource(this,R.array.BatteryElectroLevel,android.R.layout.simple_spinner_item);
        badapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        batterySpin.setAdapter(badapter);
        batterySpin.setOnItemSelectedListener(this);


        mybutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(DataCollector.this,DataCollect2.class);
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
