package com.kaineras.madlibs;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class ResultTextActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        final TextView textResult=(TextView) findViewById(R.id.textResult);
        final Button buttonBack = (Button) findViewById(R.id.button2);
                buttonBack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });

        String relative1 = getIntent().getStringExtra("relative1");
        String relative2 = getIntent().getStringExtra("relative2");
        String adjective1 = getIntent().getStringExtra("adjective1");
        String adjective2 = getIntent().getStringExtra("adjective2");
        String adjective3 = getIntent().getStringExtra("adjective3");
        String nameof = getIntent().getStringExtra("nameofperson");
        String body = getIntent().getStringExtra("body");
        String verbed = getIntent().getStringExtra("verbed");
        String verbing = getIntent().getStringExtra("verbing");
        String name = getIntent().getStringExtra("name");


        textResult.setText("Dear "+name+"\nLook, I guarantee there'll be "+adjective1+" times"+
                        " But I also guarantee that if I don't ask you to be "+adjective2+", I'll " + verbing+
                        " it for the rest of my "+relative1+", because I know, in my "+body+", you`re the "+adjective3+" one for me."+
                        "\nAlways yours "+nameof+"\nPD I enjoy long, Particular walks on the beach, getting "+
                        verbed+" in the rain and serendipitous encounters with "+relative2
        );
    }
}