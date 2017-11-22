package com.example.toki.intent_home;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7;
    Button button1,button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView1=findViewById(R.id.et1);
        textView2=findViewById(R.id.et2);
        textView3=findViewById(R.id.et3);
        textView4=findViewById(R.id.et7);
        textView5=findViewById(R.id.et4);
        textView6=findViewById(R.id.et5);
        textView7=findViewById(R.id.et6);
        button1=findViewById(R.id.btn1);
        button2=findViewById(R.id.btn2);

        Intent intent=getIntent();
        String []a=getIntent().getStringArrayExtra("toki");
        textView1.setText(a[0]);
        textView2.setText(a[1]);
        textView3.setText(a[2]);
        textView4.setText(a[4]);
        textView5.setText(a[3]);
        textView6.setText(a[5]);
        textView7.setText(a[6]);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[]a=getIntent().getStringArrayExtra("toki");
                Intent intent = new Intent(getApplicationContext(),Main3Activity.class);
                intent.putExtra("toki",a);
                startActivity(intent);
            }
        });
    }
}
