package com.example.toki.intent_home;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    String s;
    EditText editText1,editText2,editText3,editText4,editText5,editText6;
    Button button;
    RadioButton radioButton1,radioButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1=findViewById(R.id.et1);
        editText2=findViewById(R.id.et2);
        editText3=findViewById(R.id.et3);
        editText4=findViewById(R.id.et4);
        editText5=findViewById(R.id.et5);
        editText6=findViewById(R.id.et6);
        button=findViewById(R.id.btn);
        radioButton1=findViewById(R.id.man);
        radioButton2=findViewById(R.id.woman);
        button.setOnClickListener(this);
        radioButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s = "man";
            }
        });
        radioButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s="woman";
            }
        });

    }

    @Override
    public void onClick(View view) {


        String a[] = new String[7];
        a[0]=editText1.getText().toString();
        a[1]=editText2.getText().toString();
        a[2]=editText3.getText().toString();
        a[3]=editText4.getText().toString();
        a[4]=s;
        a[5]=editText5.getText().toString();
        a[6]=editText6.getText().toString();


        Intent intent=new Intent(getApplicationContext(),Main2Activity.class);
        intent.putExtra("toki",a);
        startActivity(intent);

        Toast.makeText(getApplicationContext(),"change conformation",Toast.LENGTH_SHORT).show();

    }
}
