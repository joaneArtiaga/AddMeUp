package com.example.joane14.addmeup;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.btnResult);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addMe(v);
            }
        });


    }



    public void addMe(View view){

        try {
            EditText first;

            first = (EditText) findViewById(R.id.numbF);
            EditText second;
            second = (EditText) findViewById(R.id.numbS);
            TextView result;
            result = (TextView) findViewById(R.id.txtResult);

            double num1 = 0.0, num2 = 0.0, ans;

            num1 = Double.parseDouble(first.getText().toString());
            num2 = Double.parseDouble(second.getText().toString());
            ans = num1 + num2;
            result.setText(ans + "");
        }catch(Exception e){
            AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
            alertDialog.setMessage("Invalid");
            alertDialog.show();
        }

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btnResult:
                
                break;
            default:
                break;
        }
    }
}
