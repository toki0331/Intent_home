package com.example.toki.intent_home;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity implements View.OnClickListener{
    Button button;
    TextView textView1,textView2;
    String a[];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        String a[] = getIntent().getStringArrayExtra("toki");
        textView1=findViewById(R.id.name);
        textView2=findViewById(R.id.id);
        button=findViewById(R.id.btn);
        textView1.setText(a[0]);
        textView2.setText(a[1]);
        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(getApplicationContext(),Main4Activity.class);
        String a[] = getIntent().getStringArrayExtra("toki");
        intent.putExtra("abhi",a);
        startActivity(intent);
        Toast.makeText(getApplicationContext(),"fill your ID and Password",Toast.LENGTH_SHORT).show();
    }
}
