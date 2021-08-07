package com.pd.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.logging.Level;

import static java.util.logging.Level.parse;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void myClickFun(View view){

        EditText name = (EditText)findViewById(R.id.edt_name);
        EditText pcontact = (EditText)findViewById(R.id.edt_pw);
        EditText add = (EditText)findViewById(R.id.ed_address);
        Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show();
       // Toast.makeText(this, name.getText().toString(), Toast.LENGTH_SHORT).show();

      /*  Log.i("Username",name.getText().toString());
        Log.i("P/w", pcontact.getText().toString());*/

        String P_name = name.getText().toString();
        String P_cont = pcontact.getText().toString();
        String P_add = add.getText().toString();

        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        intent.putExtra("PassName",P_name);
        intent.putExtra("PassContact",P_cont);
        intent.putExtra("PassAddress",P_add);
        startActivity(intent);

       /* String address = name.getText().toString();
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(address));
    startActivity(intent);*/
    }
}
