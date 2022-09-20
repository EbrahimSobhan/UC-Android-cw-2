package com.example.secondclasswork;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText exfirstnum = findViewById(R.id.edittextfirstnumber);
        EditText exsecondsnum = findViewById(R.id.edittextsecondnumber);
        TextView resuittext = findViewById(R.id.textviewresult);
        Button calc = findViewById(R.id.button);

        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a = exfirstnum.getText().toString();
                String b = exsecondsnum.getText().toString();

                int x = Integer.parseInt(a);
                int y = Integer.parseInt(b);

                int z = sum(x, y);

                resuittext.setText(String.valueOf(z));
            }
        });
    }

    public int sum(int x, int y) {
        int z = x+y;
        return z;
    }


}