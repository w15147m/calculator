package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
  TextView resultTv,solutionTview;
   MaterialButton buttonc,buttonfb,buttonbb,buttonAC,buttondot;
   MaterialButton buttondivide,buttonmultiply,buttonminus,buttonplus,buttonequls;
   MaterialButton button1,button2,button3,button4,button5,button6,button7,button8,button9,button0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        // hooks
  resultTv = findViewById(R.id.result_tv);
  solutionTview = findViewById(R.id.solution_tview);

        solutionTview.setText("");
        resultTv.setText("");
        assingId(R.id.button_c);
        assingId(R.id.button_bb);
        assingId(R.id.button_fb);
        assingId(R.id.button_divide);
        assingId(R.id.button_1);
        assingId(R.id.button_2);
        assingId(R.id.button_3);
        assingId(R.id.button_multiply);
        assingId(R.id.button_4);
        assingId(R.id.button_5);
        assingId(R.id.button_6);
        assingId(R.id.button_plus);
        assingId(R.id.button_7);
        assingId(R.id.button_8);
        assingId(R.id.button_9);
        assingId(R.id.button_minus);
        assingId(R.id.button_AC);
        assingId(R.id.button_0);
        assingId(R.id.button_dot);
        assingId(R.id.button_equals);




    }
 void assingId(int id){

     MaterialButton btn = findViewById(id);
        btn.setOnClickListener(this);



 }

    @Override
    public void onClick(View v) {


        MaterialButton button = (MaterialButton) v;
        String btnText  = button.getText().toString();
        String dataToCalculat = solutionTview.getText().toString();



        if(btnText.equals("=")){

            resultTv.setText(solutionTview.getText());


        }
        if(btnText.equals("c")){

            dataToCalculat = dataToCalculat.substring(0 ,dataToCalculat.length()-1);
        }else{
            dataToCalculat = dataToCalculat + btnText;

        }
        if(btnText.equals("AC")){

            solutionTview.setText("");
            resultTv.setText("");
        }else {
            solutionTview.setText(dataToCalculat);
        }

    }
}