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

public class LoginActivity extends AppCompatActivity {

    private EditText email;
    private EditText pass;
    private FirebaseAuth firebaseAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        email = (EditText) findViewById(R.id.editText);
        pass = (EditText) findViewById(R.id.editText2);
        firebaseAuth = FirebaseAuth.getInstance();
    }


    public void button3_Click(View view)
    {
        if(email==null)
        {
            email.setError("empty field");
            email.requestFocus();
            return;
        }

        if(pass==null)
        {
            pass.setError("empty field");
            pass.requestFocus();
            return;
        }
        final ProgressDialog processDialog = ProgressDialog.show(LoginActivity.this,"please wait","Processing...",true);
        (firebaseAuth.signInWithEmailAndPassword(email.getText().toString(),pass.getText().toString())).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                processDialog.dismiss();
                if(task.isSuccessful()){

                    Toast.makeText(LoginActivity.this,"Login successfullllll",Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(LoginActivity.this,UserActivity.class);

                    startActivity(i);
                }
                else
                {
                    Log.e("error",task.getException().toString());
                    Toast.makeText(LoginActivity.this,task.getException().getMessage(),Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
