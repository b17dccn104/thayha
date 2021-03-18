package com.example.baiha;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private EditText e1,e2;
private Button b1,b2,b3,b4,b5;
private TextView result;
private String dau = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            dau = "+";
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dau = "-";
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dau = "*";
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dau = "/";
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double n1 = Double.parseDouble(e1.getText().toString());
                    double n2 = Double.parseDouble(e2.getText().toString());
                    double kq = 0;
                    switch (dau){
                        case "+":{
                            kq = n1 + n2;
                            break;
                        }
                        case "-":{
                            kq = n1 - n2;
                            break;
                        }
                        case "/":{
                            kq = n1 / n2;
                            break;
                        }
                        case "*":{
                            kq = n1 * n2;
                            break;
                        }
                    }
                    result.setText(kq + "");
                }catch (NumberFormatException e){
                    System.out.println(e);
                }
            }
        });

    }

    private void initView() {
        e1 =findViewById(R.id.n1);
        e2=findViewById(R.id.n2);
        b1=findViewById(R.id.button);
        b2=findViewById(R.id.button2);
        b3=findViewById(R.id.button3);
        b4=findViewById(R.id.button4);
        b5=findViewById(R.id.button5);
        result=findViewById(R.id.textView3);
    }
}