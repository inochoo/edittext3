package com.sibaamap.edittext3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText so1,so2;
    TextView kq;
    Button cong,tru,nhan,chia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        so1 = findViewById(R.id.name);
        so2 = findViewById(R.id.pass);
        kq = findViewById(R.id.pass1);
        cong = findViewById(R.id.cong);
        tru = findViewById(R.id.tru);
        nhan = findViewById(R.id.nhan);
        chia = findViewById(R.id.chia);

        cong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a,b;
                a=Double.parseDouble(so1.getText().toString());
                b=Double.parseDouble(so2.getText().toString());

                kq.setText(""+(a+b));
            }
        });
        tru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a,b;
                a=Double.parseDouble(so1.getText().toString());
                b=Double.parseDouble(so2.getText().toString());

                kq.setText(""+(a-b));
            }
        });
        nhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a,b;
                a=Double.parseDouble(so1.getText().toString());
                b=Double.parseDouble(so2.getText().toString());

                kq.setText(""+(a*b));
            }
        });
        chia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a,b;
                a=Double.parseDouble(so1.getText().toString());
                b=Double.parseDouble(so2.getText().toString());

                kq.setText(""+(a/b));
            }
        });

    }
}