package com.kaineras.madlibs;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {
    Button button=null;

    EditText text1=null;
    EditText text2=null;
    EditText text3=null;
    EditText text4=null;
    EditText text5=null;
    EditText text6=null;
    EditText text7=null;
    EditText text8=null;
    EditText text9=null;
    EditText text10=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        prepareButton();
        prepareText();
    }

    private void prepareText() {
        text1=(EditText) findViewById(R.id.input1);
        text2=(EditText) findViewById(R.id.input2);
        text3=(EditText) findViewById(R.id.input3);
        text4=(EditText) findViewById(R.id.input4);
        text5=(EditText) findViewById(R.id.input5);
        text6=(EditText) findViewById(R.id.input6);
        text7=(EditText) findViewById(R.id.input7);
        text8=(EditText) findViewById(R.id.input8);
        text9=(EditText) findViewById(R.id.input9);
        text10=(EditText) findViewById(R.id.input10);

        TextWatcher MyListener = new TextWatcher() {

            public void afterTextChanged(Editable s) {
                if(!text1.getText().toString().isEmpty() &&
                        !text2.getText().toString().isEmpty() &&
                        !text3.getText().toString().isEmpty() &&
                        !text4.getText().toString().isEmpty() &&
                        !text5.getText().toString().isEmpty() &&
                        !text6.getText().toString().isEmpty() &&
                        !text7.getText().toString().isEmpty() &&
                        !text8.getText().toString().isEmpty() &&
                        !text9.getText().toString().isEmpty() &&
                        !text10.getText().toString().isEmpty())
                    button.setEnabled(true);
                else
                    button.setEnabled(false);

            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            public void onTextChanged(CharSequence s, int start, int before, int count) {}
        };

        text1.addTextChangedListener(MyListener);
        text2.addTextChangedListener(MyListener);
        text3.addTextChangedListener(MyListener);
        text4.addTextChangedListener(MyListener);
        text5.addTextChangedListener(MyListener);
        text6.addTextChangedListener(MyListener);
        text7.addTextChangedListener(MyListener);
        text8.addTextChangedListener(MyListener);
        text9.addTextChangedListener(MyListener);
        text10.addTextChangedListener(MyListener);
    }

    private void prepareButton() {
        button=(Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            String relative1=text1.getText().toString();
            String adjective1=text2.getText().toString();
            String adjective2=text3.getText().toString();
            String adjective3=text4.getText().toString();
            String body=text5.getText().toString();
            String relative2=text6.getText().toString();
            String name=text7.getText().toString();
            String verbing=text8.getText().toString();
            String verbed=text9.getText().toString();
            String nameof=text10.getText().toString();


            Intent i = new Intent (MainActivity.this, ResultTextActivity.class);
            i.putExtra("relative1", relative1);
            i.putExtra("adjective1", adjective1);
            i.putExtra("adjective2", adjective2);
            i.putExtra("nameofperson", nameof);
            i.putExtra("adjective3", adjective3);
            i.putExtra("verbed", verbed);
            i.putExtra("body", body);
            i.putExtra("verbing", verbing);
            i.putExtra("relative2", relative2);
            i.putExtra("name", name);
            startActivity(i);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
