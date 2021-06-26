package com.example.shukshuk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3, clip;
    TextView tarea;
    String tmp="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    btn1=findViewById(R.id.btn1);
    btn2=findViewById(R.id.btn2);
    btn3=findViewById(R.id.btn3);
    tarea=findViewById(R.id.tarea);
    clip=findViewById(R.id.clip);


    btn1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            tmp+="슉, ";
            tarea.setText(tmp);
        }
    });
    btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tmp+="슈슉, ";
                tarea.setText(tmp);
            }
        });
    btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tmp+="슈발럼아, ";
                tarea.setText(tmp);
            }
        });
    clip.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            ClipboardManager clipboardManager = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
            ClipData clipData = ClipData.newPlainText("복사된 내용", tmp);
            clipboardManager.setPrimaryClip(clipData);
            Toast.makeText(getApplication(), "복사되었습니다.", Toast.LENGTH_LONG).show();
        }
    });
    }
}