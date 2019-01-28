package com.example.hp.firepro;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class DataCollect2 extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    FloatingActionButton mybutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_collect2);
        mybutton = (FloatingActionButton)findViewById(R.id.floatingActionButton3);


        Spinner brakeCam = findViewById(R.id.spinner2);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.Brake_Cam,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        brakeCam.setAdapter(adapter);
        brakeCam.setOnItemSelectedListener(this);

        Spinner carburettor = findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> cadapter = ArrayAdapter.createFromResource(this,R.array.Carburettor_assembly,android.R.layout.simple_spinner_item);
        cadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        carburettor.setAdapter(cadapter);
        carburettor.setOnItemSelectedListener(this);

        Spinner allSwitches = findViewById(R.id.spinner3);
        ArrayAdapter<CharSequence> sadapter = ArrayAdapter.createFromResource(this,R.array.All_Switches,android.R.layout.simple_spinner_item);
        sadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        allSwitches.setAdapter(sadapter);
        allSwitches.setOnItemSelectedListener(this);

        Spinner frontfork = findViewById(R.id.spinner4);
        ArrayAdapter<CharSequence> fadapter = ArrayAdapter.createFromResource(this,R.array.Front_Fork_Oil,android.R.layout.simple_spinner_item);
        fadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        frontfork.setAdapter(fadapter);
        frontfork.setOnItemSelectedListener(this);

        Spinner allCables = findViewById(R.id.spinner5);
        ArrayAdapter<CharSequence> acadapter = ArrayAdapter.createFromResource(this,R.array.All_Cables,android.R.layout.simple_spinner_item);
        acadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        allCables.setAdapter(acadapter);
        allCables.setOnItemSelectedListener(this);

        Spinner headlamp = findViewById(R.id.spinner6);
        ArrayAdapter<CharSequence> hadapter = ArrayAdapter.createFromResource(this,R.array.Head_lamp_beam,android.R.layout.simple_spinner_item);
        hadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        headlamp.setAdapter(hadapter);
        headlamp.setOnItemSelectedListener(this);

       mybutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(DataCollect2.this,DataCollect3.class);
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
