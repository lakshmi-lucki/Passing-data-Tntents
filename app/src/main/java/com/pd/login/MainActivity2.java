package com.pd.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
       ImageView img_babu = (ImageView)findViewById(R.id.img);
       //String img = getIntent().toUri(0);
        TextView tv_name = (TextView)findViewById(R.id.tv_name);
        TextView tv_con = (TextView)findViewById(R.id.tv_cont);
        TextView tv_add = (TextView)findViewById(R.id.tv_address);
       // Intent ty = getIntent();

        String img = getIntent().getStringExtra("PassImage");
        String in_name = getIntent().getStringExtra("PassName");

        String in_cont = getIntent().getStringExtra("PassContact");
        String in_add = getIntent().getStringExtra("PassAddress");

        tv_name.setText(in_name);
        tv_con.setText(in_cont);
        tv_add.setText(in_add);


        //Toast.makeText(this, "Thank you!", Toast.LENGTH_SHORT).show();
    }

}