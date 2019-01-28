package com.example.hp.firepro;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class RegisterActivity extends AppCompatActivity {

    private EditText txtmail;
    private  EditText txtPass;
    private FirebaseAuth firebaseAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        txtmail = (EditText) findViewById(R.id.email);
        txtPass = (EditText) findViewById(R.id.password);
        firebaseAuth = FirebaseAuth.getInstance();
    }

    public void button_next_Click(View v)
    {
        if(txtmail==null)
        {
            txtmail.setError("empty field");
            txtmail.requestFocus();
            return;
        }

        if(txtPass==null)
        {
            txtPass.setError("empty field");
            txtPass.requestFocus();
            return;
        }
        final ProgressDialog processDialog = ProgressDialog.show(RegisterActivity.this,"please wait","Processing...",true);
        (firebaseAuth.createUserWithEmailAndPassword(txtmail.getText().toString(),txtPass.getText().toString())).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
            processDialog.dismiss();
            if(task.isSuccessful()){
                Toast.makeText(RegisterActivity.this,"Registration successful",Toast.LENGTH_SHORT).show();
                Intent i = new Intent(RegisterActivity.this,Signinto.class);
                startActivity(i);
            }
            else
            {
                Log.e("error",task.getException().toString());
                Toast.makeText(RegisterActivity.this,task.getException().getMessage(),Toast.LENGTH_SHORT).show();
            }
            }
        });


    }
}
