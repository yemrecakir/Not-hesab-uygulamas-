package com.android.ktharflinot;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class DonemActivity extends AppCompatActivity  {
    private Button kaydet,hesapla;
    private String derssayisi;
    private Double dersnotu1,dersnotu2,dersnotu3,dersnotu4,dersnotu5,dersnotu6,dersnotu7,dersnotu8,dersnotu9,dersnotu10,
     kredi1,kredi2,kredi3,kredi4,kredi5,kredi6,kredi7,kredi8,kredi9,kredi10;
    private EditText not1,not2,not3,not4,not5,not6,not7,not8,not9,not10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donem);
        final EditText kacders=findViewById(R.id.kacders);
        not1=(EditText)findViewById(R.id.not1);
        not2=(EditText)findViewById(R.id.not2);
        not3=(EditText)findViewById(R.id.not3);
        not4=(EditText)findViewById(R.id.not4);
        not5=(EditText)findViewById(R.id.not5);
        not6=(EditText)findViewById(R.id.not6);
        not7=(EditText)findViewById(R.id.not7);
        not8=(EditText)findViewById(R.id.not8);
        not9=(EditText)findViewById(R.id.not9);
        not10=(EditText)findViewById(R.id.not10);
        final TextView not=(TextView)findViewById(R.id.not);
        final TextView notun=findViewById(R.id.notun);
        final TextView finalnotun=findViewById(R.id.finalnot);
        notun.setVisibility(View.INVISIBLE);
        finalnotun.setVisibility(View.INVISIBLE);


        final EditText ders1=(EditText) findViewById(R.id.ders1);
        final EditText ders2=(EditText) findViewById(R.id.ders2);
        final EditText ders3=(EditText) findViewById(R.id.ders3);
        final EditText ders4=(EditText) findViewById(R.id.ders4);
        final EditText ders5=(EditText) findViewById(R.id.ders5);
        final EditText ders6=(EditText) findViewById(R.id.ders6);
        final EditText ders7=(EditText) findViewById(R.id.ders7);
        final EditText ders8=(EditText) findViewById(R.id.ders8);
        final EditText ders9=(EditText) findViewById(R.id.ders9);
        final EditText ders10=(EditText) findViewById(R.id.ders10);
        final EditText derskredi1=(EditText) findViewById(R.id.derskredi1);
        final EditText derskredi2=(EditText) findViewById(R.id.derskredi2);
        final EditText derskredi3=(EditText) findViewById(R.id.derskredi3);
        final EditText derskredi4=(EditText) findViewById(R.id.derskredi4);
        final EditText derskredi5=(EditText) findViewById(R.id.derskredi5);
        final EditText derskredi6=(EditText) findViewById(R.id.derskredi6);
        final EditText derskredi7=(EditText) findViewById(R.id.derskredi7);
        final EditText derskredi8=(EditText) findViewById(R.id.derskredi8);
        final EditText derskredi9=(EditText) findViewById(R.id.derskredi9);
        final EditText derskredi10=(EditText) findViewById(R.id.derskredi10);
        not1.setVisibility(View.INVISIBLE);
        not2.setVisibility(View.INVISIBLE);
        not3.setVisibility(View.INVISIBLE);
        not4.setVisibility(View.INVISIBLE);
        not5.setVisibility(View.INVISIBLE);
        not6.setVisibility(View.INVISIBLE);
        not7.setVisibility(View.INVISIBLE);
        not8.setVisibility(View.INVISIBLE);
        not9.setVisibility(View.INVISIBLE);
        not10.setVisibility(View.INVISIBLE);
        ders1.setVisibility(View.INVISIBLE);
        ders2.setVisibility(View.INVISIBLE);
        ders3.setVisibility(View.INVISIBLE);
        ders4.setVisibility(View.INVISIBLE);
        ders5.setVisibility(View.INVISIBLE);
        ders6.setVisibility(View.INVISIBLE);
        ders7.setVisibility(View.INVISIBLE);
        ders8.setVisibility(View.INVISIBLE);
        ders9.setVisibility(View.INVISIBLE);
        ders10.setVisibility(View.INVISIBLE);
        derskredi1.setVisibility(View.INVISIBLE);
        derskredi2.setVisibility(View.INVISIBLE);
        derskredi3.setVisibility(View.INVISIBLE);
        derskredi4.setVisibility(View.INVISIBLE);
        derskredi5.setVisibility(View.INVISIBLE);
        derskredi6.setVisibility(View.INVISIBLE);
        derskredi7.setVisibility(View.INVISIBLE);
        derskredi8.setVisibility(View.INVISIBLE);
        derskredi9.setVisibility(View.INVISIBLE);
        derskredi10.setVisibility(View.INVISIBLE);

       kaydet=(Button) findViewById(R.id.kaydet);
       kaydet.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
                derssayisi=kacders.getText().toString();

               if(derssayisi.equals("1") ){
                   ders1.setVisibility(View.VISIBLE);
                   derskredi1.setVisibility(View.VISIBLE);
                   not1.setVisibility(View.VISIBLE);

               }
               else if(derssayisi.equals("2") ){

                   ders1.setVisibility(View.VISIBLE);
                   derskredi1.setVisibility(View.VISIBLE);
                   ders2.setVisibility(View.VISIBLE);
                   derskredi2.setVisibility(View.VISIBLE);
                   not1.setVisibility(View.VISIBLE);
                   not2.setVisibility(View.VISIBLE);


               }
               else if(derssayisi.equals("3") ){

                   ders1.setVisibility(View.VISIBLE);
                   derskredi1.setVisibility(View.VISIBLE);
                   ders2.setVisibility(View.VISIBLE);
                   derskredi2.setVisibility(View.VISIBLE);
                   ders3.setVisibility(View.VISIBLE);
                   derskredi3.setVisibility(View.VISIBLE);
                   not1.setVisibility(View.VISIBLE);
                   not2.setVisibility(View.VISIBLE);
                   not3.setVisibility(View.VISIBLE);


               }
               else if(derssayisi.equals("4") ){

                   ders1.setVisibility(View.VISIBLE);
                   derskredi1.setVisibility(View.VISIBLE);
                   ders2.setVisibility(View.VISIBLE);
                   derskredi2.setVisibility(View.VISIBLE);
                   ders3.setVisibility(View.VISIBLE);
                   derskredi3.setVisibility(View.VISIBLE);
                   ders4.setVisibility(View.VISIBLE);
                   derskredi4.setVisibility(View.VISIBLE);
                   not1.setVisibility(View.VISIBLE);
                   not2.setVisibility(View.VISIBLE);
                   not3.setVisibility(View.VISIBLE);
                   not4.setVisibility(View.VISIBLE);
               }
               else if(derssayisi.equals("5") ){

                   ders1.setVisibility(View.VISIBLE);
                   derskredi1.setVisibility(View.VISIBLE);
                   ders2.setVisibility(View.VISIBLE);
                   derskredi2.setVisibility(View.VISIBLE);
                   ders3.setVisibility(View.VISIBLE);
                   derskredi3.setVisibility(View.VISIBLE);
                   ders4.setVisibility(View.VISIBLE);
                   derskredi4.setVisibility(View.VISIBLE);
                   ders5.setVisibility(View.VISIBLE);
                   derskredi5.setVisibility(View.VISIBLE);
                   not1.setVisibility(View.VISIBLE);
                   not2.setVisibility(View.VISIBLE);
                   not3.setVisibility(View.VISIBLE);
                   not4.setVisibility(View.VISIBLE);
                   not5.setVisibility(View.VISIBLE);
               }
               else if(derssayisi.equals("6") ){

                   ders1.setVisibility(View.VISIBLE);
                   derskredi1.setVisibility(View.VISIBLE);
                   ders2.setVisibility(View.VISIBLE);
                   derskredi2.setVisibility(View.VISIBLE);
                   ders3.setVisibility(View.VISIBLE);
                   derskredi3.setVisibility(View.VISIBLE);
                   ders4.setVisibility(View.VISIBLE);
                   derskredi4.setVisibility(View.VISIBLE);
                   ders5.setVisibility(View.VISIBLE);
                   derskredi5.setVisibility(View.VISIBLE);
                   ders6.setVisibility(View.VISIBLE);
                   derskredi6.setVisibility(View.VISIBLE);
                   not1.setVisibility(View.VISIBLE);
                   not2.setVisibility(View.VISIBLE);
                   not3.setVisibility(View.VISIBLE);
                   not4.setVisibility(View.VISIBLE);
                   not5.setVisibility(View.VISIBLE);
                   not6.setVisibility(View.VISIBLE);
               }
               else if(derssayisi.equals("7") ){

                   ders1.setVisibility(View.VISIBLE);
                   derskredi1.setVisibility(View.VISIBLE);
                   ders2.setVisibility(View.VISIBLE);
                   derskredi2.setVisibility(View.VISIBLE);
                   ders3.setVisibility(View.VISIBLE);
                   derskredi3.setVisibility(View.VISIBLE);
                   ders4.setVisibility(View.VISIBLE);
                   derskredi4.setVisibility(View.VISIBLE);
                   ders5.setVisibility(View.VISIBLE);
                   derskredi5.setVisibility(View.VISIBLE);
                   ders6.setVisibility(View.VISIBLE);
                   derskredi6.setVisibility(View.VISIBLE);
                   ders7.setVisibility(View.VISIBLE);
                   derskredi7.setVisibility(View.VISIBLE);
                   not1.setVisibility(View.VISIBLE);
                   not2.setVisibility(View.VISIBLE);
                   not3.setVisibility(View.VISIBLE);
                   not4.setVisibility(View.VISIBLE);
                   not5.setVisibility(View.VISIBLE);
                   not6.setVisibility(View.VISIBLE);
                   not7.setVisibility(View.VISIBLE);
               }
               else if(derssayisi.equals("8") ){

                   ders1.setVisibility(View.VISIBLE);
                   derskredi1.setVisibility(View.VISIBLE);
                   ders2.setVisibility(View.VISIBLE);
                   derskredi2.setVisibility(View.VISIBLE);
                   ders3.setVisibility(View.VISIBLE);
                   derskredi3.setVisibility(View.VISIBLE);
                   ders4.setVisibility(View.VISIBLE);
                   derskredi4.setVisibility(View.VISIBLE);
                   ders5.setVisibility(View.VISIBLE);
                   derskredi5.setVisibility(View.VISIBLE);
                   ders6.setVisibility(View.VISIBLE);
                   derskredi6.setVisibility(View.VISIBLE);
                   ders7.setVisibility(View.VISIBLE);
                   derskredi7.setVisibility(View.VISIBLE);
                   ders8.setVisibility(View.VISIBLE);
                   derskredi8.setVisibility(View.VISIBLE);
                   not1.setVisibility(View.VISIBLE);
                   not2.setVisibility(View.VISIBLE);
                   not3.setVisibility(View.VISIBLE);
                   not4.setVisibility(View.VISIBLE);
                   not5.setVisibility(View.VISIBLE);
                   not6.setVisibility(View.VISIBLE);
                   not7.setVisibility(View.VISIBLE);
                   not8.setVisibility(View.VISIBLE);
               }
               else if(derssayisi.equals("9") ){

                   ders1.setVisibility(View.VISIBLE);
                   derskredi1.setVisibility(View.VISIBLE);
                   ders2.setVisibility(View.VISIBLE);
                   derskredi2.setVisibility(View.VISIBLE);
                   ders3.setVisibility(View.VISIBLE);
                   derskredi3.setVisibility(View.VISIBLE);
                   ders4.setVisibility(View.VISIBLE);
                   derskredi4.setVisibility(View.VISIBLE);
                   ders5.setVisibility(View.VISIBLE);
                   derskredi5.setVisibility(View.VISIBLE);
                   ders6.setVisibility(View.VISIBLE);
                   derskredi6.setVisibility(View.VISIBLE);
                   ders7.setVisibility(View.VISIBLE);
                   derskredi7.setVisibility(View.VISIBLE);
                   ders8.setVisibility(View.VISIBLE);
                   derskredi8.setVisibility(View.VISIBLE);
                   ders9.setVisibility(View.VISIBLE);
                   derskredi9.setVisibility(View.VISIBLE);
                   not1.setVisibility(View.VISIBLE);
                   not2.setVisibility(View.VISIBLE);
                   not3.setVisibility(View.VISIBLE);
                   not4.setVisibility(View.VISIBLE);
                   not5.setVisibility(View.VISIBLE);
                   not6.setVisibility(View.VISIBLE);
                   not7.setVisibility(View.VISIBLE);
                   not8.setVisibility(View.VISIBLE);
                   not9.setVisibility(View.VISIBLE);
               }
               else if(derssayisi.equals("10") ){

                   ders1.setVisibility(View.VISIBLE);
                   derskredi1.setVisibility(View.VISIBLE);
                   ders2.setVisibility(View.VISIBLE);
                   derskredi2.setVisibility(View.VISIBLE);
                   ders3.setVisibility(View.VISIBLE);
                   derskredi3.setVisibility(View.VISIBLE);
                   ders4.setVisibility(View.VISIBLE);
                   derskredi4.setVisibility(View.VISIBLE);
                   ders5.setVisibility(View.VISIBLE);
                   derskredi5.setVisibility(View.VISIBLE);
                   ders6.setVisibility(View.VISIBLE);
                   derskredi6.setVisibility(View.VISIBLE);
                   ders7.setVisibility(View.VISIBLE);
                   derskredi7.setVisibility(View.VISIBLE);
                   ders8.setVisibility(View.VISIBLE);
                   derskredi8.setVisibility(View.VISIBLE);
                   ders9.setVisibility(View.VISIBLE);
                   derskredi9.setVisibility(View.VISIBLE);
                   ders10.setVisibility(View.VISIBLE);
                   derskredi10.setVisibility(View.VISIBLE);
                   not1.setVisibility(View.VISIBLE);
                   not2.setVisibility(View.VISIBLE);
                   not3.setVisibility(View.VISIBLE);
                   not4.setVisibility(View.VISIBLE);
                   not5.setVisibility(View.VISIBLE);
                   not6.setVisibility(View.VISIBLE);
                   not7.setVisibility(View.VISIBLE);
                   not8.setVisibility(View.VISIBLE);
                   not9.setVisibility(View.VISIBLE);
                   not10.setVisibility(View.VISIBLE);
               }



           }
       });

        hesapla=(Button)findViewById(R.id.hesapla);
        hesapla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(derssayisi.equals("1")){
                     dersnotu1=Double.parseDouble(not1.getText().toString());
                     kredi1=Double.parseDouble(derskredi1.getText().toString());
                     double sonnot= dersnotu1;


                     kaydet.setVisibility(View.INVISIBLE);
                     hesapla.setVisibility(View.INVISIBLE);

                     finalnotun.setText(Double.toString(sonnot));
                    notun.setVisibility(View.VISIBLE);
                    finalnotun.setVisibility(View.VISIBLE);


                }
                else if(derssayisi.equals("2")){
                    dersnotu1=Double.parseDouble(not1.getText().toString());
                    dersnotu2=Double.parseDouble(not2.getText().toString());
                    kredi1=Double.parseDouble(derskredi1.getText().toString());
                    kredi2=Double.parseDouble(derskredi2.getText().toString());
                    double sonnot=(kredi1*dersnotu1+kredi2*dersnotu2)/(kredi1+kredi2);
                    kaydet.setVisibility(View.INVISIBLE);
                    hesapla.setVisibility(View.INVISIBLE);


                    finalnotun.setText(Double.toString(sonnot));
                    notun.setVisibility(View.VISIBLE);
                    finalnotun.setVisibility(View.VISIBLE);

                }
                else if(derssayisi.equals("3")){
                    dersnotu1=Double.parseDouble(not1.getText().toString());
                    dersnotu2=Double.parseDouble(not2.getText().toString());
                    dersnotu3=Double.parseDouble(not3.getText().toString());
                    kredi1=Double.parseDouble(derskredi1.getText().toString());
                    kredi2=Double.parseDouble(derskredi2.getText().toString());
                    kredi3=Double.parseDouble(derskredi3.getText().toString());
                    double sonnot=(kredi1*dersnotu1+kredi2*dersnotu2+kredi3*dersnotu3)/(kredi1+kredi2+kredi3);
                    kaydet.setVisibility(View.INVISIBLE);
                    hesapla.setVisibility(View.INVISIBLE);

                    finalnotun.setText(Double.toString(sonnot));
                    notun.setVisibility(View.VISIBLE);
                    finalnotun.setVisibility(View.VISIBLE);

                }
                else if(derssayisi.equals("4")){
                    dersnotu1=Double.parseDouble(not1.getText().toString());
                    dersnotu2=Double.parseDouble(not2.getText().toString());
                    dersnotu3=Double.parseDouble(not3.getText().toString());
                    dersnotu4=Double.parseDouble(not4.getText().toString());
                    kredi1=Double.parseDouble(derskredi1.getText().toString());
                    kredi2=Double.parseDouble(derskredi2.getText().toString());
                    kredi3=Double.parseDouble(derskredi3.getText().toString());
                    kredi4=Double.parseDouble(derskredi4.getText().toString());
                    double sonnot=(kredi1*dersnotu1+kredi2*dersnotu2+kredi3*dersnotu3+kredi4*dersnotu4)/(kredi1+kredi2+kredi3+kredi4);
                    kaydet.setVisibility(View.INVISIBLE);
                    hesapla.setVisibility(View.INVISIBLE);

                    finalnotun.setText(Double.toString(sonnot));
                    notun.setVisibility(View.VISIBLE);
                    finalnotun.setVisibility(View.VISIBLE);

                }
                else if(derssayisi.equals("5")){
                    dersnotu1=Double.parseDouble(not1.getText().toString());
                    dersnotu2=Double.parseDouble(not2.getText().toString());
                    dersnotu3=Double.parseDouble(not3.getText().toString());
                    dersnotu4=Double.parseDouble(not4.getText().toString());
                    dersnotu5=Double.parseDouble(not5.getText().toString());
                    kredi1=Double.parseDouble(derskredi1.getText().toString());
                    kredi2=Double.parseDouble(derskredi2.getText().toString());
                    kredi3=Double.parseDouble(derskredi3.getText().toString());
                    kredi4=Double.parseDouble(derskredi4.getText().toString());
                    kredi5=Double.parseDouble(derskredi5.getText().toString());
                    double sonnot=(kredi1*dersnotu1+kredi2*dersnotu2+kredi3*dersnotu3+kredi4*dersnotu4+kredi5*dersnotu5)/(kredi1+kredi2+kredi3+kredi4+kredi5);
                    kaydet.setVisibility(View.INVISIBLE);
                    hesapla.setVisibility(View.INVISIBLE);

                    finalnotun.setText(Double.toString(sonnot));
                    notun.setVisibility(View.VISIBLE);
                    finalnotun.setVisibility(View.VISIBLE);

                }
                else if(derssayisi.equals("6")){
                    dersnotu1=Double.parseDouble(not1.getText().toString());
                    dersnotu2=Double.parseDouble(not2.getText().toString());
                    dersnotu3=Double.parseDouble(not3.getText().toString());
                    dersnotu4=Double.parseDouble(not4.getText().toString());
                    dersnotu5=Double.parseDouble(not5.getText().toString());
                    dersnotu6=Double.parseDouble(not6.getText().toString());
                    kredi1=Double.parseDouble(derskredi1.getText().toString());
                    kredi2=Double.parseDouble(derskredi2.getText().toString());
                    kredi3=Double.parseDouble(derskredi3.getText().toString());
                    kredi4=Double.parseDouble(derskredi4.getText().toString());
                    kredi5=Double.parseDouble(derskredi5.getText().toString());
                    kredi6=Double.parseDouble(derskredi6.getText().toString());
                    double sonnot=(kredi1*dersnotu1+kredi2*dersnotu2+kredi3*dersnotu3+kredi4*dersnotu4+kredi5*dersnotu5+kredi6*dersnotu6)
                            /(kredi1+kredi2+kredi3+kredi4+kredi5+kredi6);
                    kaydet.setVisibility(View.INVISIBLE);
                    hesapla.setVisibility(View.INVISIBLE);

                    finalnotun.setText(Double.toString(sonnot));
                    notun.setVisibility(View.VISIBLE);
                    finalnotun.setVisibility(View.VISIBLE);

                }
                else if(derssayisi.equals("7")){
                    dersnotu1=Double.parseDouble(not1.getText().toString());
                    dersnotu2=Double.parseDouble(not2.getText().toString());
                    dersnotu3=Double.parseDouble(not3.getText().toString());
                    dersnotu4=Double.parseDouble(not4.getText().toString());
                    dersnotu5=Double.parseDouble(not5.getText().toString());
                    dersnotu6=Double.parseDouble(not6.getText().toString());
                    dersnotu7=Double.parseDouble(not7.getText().toString());
                    kredi1=Double.parseDouble(derskredi1.getText().toString());
                    kredi2=Double.parseDouble(derskredi2.getText().toString());
                    kredi3=Double.parseDouble(derskredi3.getText().toString());
                    kredi4=Double.parseDouble(derskredi4.getText().toString());
                    kredi5=Double.parseDouble(derskredi5.getText().toString());
                    kredi6=Double.parseDouble(derskredi6.getText().toString());
                    kredi7=Double.parseDouble(derskredi7.getText().toString());
                    double sonnot=(kredi1*dersnotu1+kredi2*dersnotu2+kredi3*dersnotu3+kredi4*dersnotu4+kredi5*dersnotu5+kredi6*dersnotu6+
                            kredi7*dersnotu7)
                            /(kredi1+kredi2+kredi3+kredi4+kredi5+kredi6+kredi7);
                    kaydet.setVisibility(View.INVISIBLE);
                    hesapla.setVisibility(View.INVISIBLE);
                    finalnotun.setText(Double.toString(sonnot));
                    notun.setVisibility(View.VISIBLE);
                    finalnotun.setVisibility(View.VISIBLE);

                }
                else if(derssayisi.equals("8")){
                    dersnotu1=Double.parseDouble(not1.getText().toString());
                    dersnotu2=Double.parseDouble(not2.getText().toString());
                    dersnotu3=Double.parseDouble(not3.getText().toString());
                    dersnotu4=Double.parseDouble(not4.getText().toString());
                    dersnotu5=Double.parseDouble(not5.getText().toString());
                    dersnotu6=Double.parseDouble(not6.getText().toString());
                    dersnotu7=Double.parseDouble(not7.getText().toString());
                    dersnotu8=Double.parseDouble(not8.getText().toString());
                    kredi1=Double.parseDouble(derskredi1.getText().toString());
                    kredi2=Double.parseDouble(derskredi2.getText().toString());
                    kredi3=Double.parseDouble(derskredi3.getText().toString());
                    kredi4=Double.parseDouble(derskredi4.getText().toString());
                    kredi5=Double.parseDouble(derskredi5.getText().toString());
                    kredi6=Double.parseDouble(derskredi6.getText().toString());
                    kredi7=Double.parseDouble(derskredi7.getText().toString());
                    kredi8=Double.parseDouble(derskredi8.getText().toString());
                    double sonnot=(kredi1*dersnotu1+kredi2*dersnotu2+kredi3*dersnotu3+kredi4*dersnotu4+kredi5*dersnotu5+kredi6*dersnotu6+
                            kredi7*dersnotu7+kredi8*dersnotu8)
                            /(kredi1+kredi2+kredi3+kredi4+kredi5+kredi6+kredi7+kredi8);
                    kaydet.setVisibility(View.INVISIBLE);
                    hesapla.setVisibility(View.INVISIBLE);
                    finalnotun.setText(Double.toString(sonnot));
                    notun.setVisibility(View.VISIBLE);
                    finalnotun.setVisibility(View.VISIBLE);

                }
                else if(derssayisi.equals("9")){
                    dersnotu1=Double.parseDouble(not1.getText().toString());
                    dersnotu2=Double.parseDouble(not2.getText().toString());
                    dersnotu3=Double.parseDouble(not3.getText().toString());
                    dersnotu4=Double.parseDouble(not4.getText().toString());
                    dersnotu5=Double.parseDouble(not5.getText().toString());
                    dersnotu6=Double.parseDouble(not6.getText().toString());
                    dersnotu7=Double.parseDouble(not7.getText().toString());
                    dersnotu8=Double.parseDouble(not8.getText().toString());
                    dersnotu9=Double.parseDouble(not9.getText().toString());
                    kredi1=Double.parseDouble(derskredi1.getText().toString());
                    kredi2=Double.parseDouble(derskredi2.getText().toString());
                    kredi3=Double.parseDouble(derskredi3.getText().toString());
                    kredi4=Double.parseDouble(derskredi4.getText().toString());
                    kredi5=Double.parseDouble(derskredi5.getText().toString());
                    kredi6=Double.parseDouble(derskredi6.getText().toString());
                    kredi7=Double.parseDouble(derskredi7.getText().toString());
                    kredi8=Double.parseDouble(derskredi8.getText().toString());
                    kredi9=Double.parseDouble(derskredi9.getText().toString());
                    double sonnot=(kredi1*dersnotu1+kredi2*dersnotu2+kredi3*dersnotu3+kredi4*dersnotu4+kredi5*dersnotu5+kredi6*dersnotu6+
                            kredi7*dersnotu7+kredi8*dersnotu8+kredi9*dersnotu9)
                            /(kredi1+kredi2+kredi3+kredi4+kredi5+kredi6+kredi7+kredi8+kredi9);
                    kaydet.setVisibility(View.INVISIBLE);
                    hesapla.setVisibility(View.INVISIBLE);
                    finalnotun.setText(Double.toString(sonnot));
                    notun.setVisibility(View.VISIBLE);
                    finalnotun.setVisibility(View.VISIBLE);

                }
                else if(derssayisi.equals("10")){
                    dersnotu1=Double.parseDouble(not1.getText().toString());
                    dersnotu2=Double.parseDouble(not2.getText().toString());
                    dersnotu3=Double.parseDouble(not3.getText().toString());
                    dersnotu4=Double.parseDouble(not4.getText().toString());
                    dersnotu5=Double.parseDouble(not5.getText().toString());
                    dersnotu6=Double.parseDouble(not6.getText().toString());
                    dersnotu7=Double.parseDouble(not7.getText().toString());
                    dersnotu8=Double.parseDouble(not8.getText().toString());
                    dersnotu9=Double.parseDouble(not9.getText().toString());
                    dersnotu10=Double.parseDouble(not10.getText().toString());
                    kredi1=Double.parseDouble(derskredi1.getText().toString());
                    kredi2=Double.parseDouble(derskredi2.getText().toString());
                    kredi3=Double.parseDouble(derskredi3.getText().toString());
                    kredi4=Double.parseDouble(derskredi4.getText().toString());
                    kredi5=Double.parseDouble(derskredi5.getText().toString());
                    kredi6=Double.parseDouble(derskredi6.getText().toString());
                    kredi7=Double.parseDouble(derskredi7.getText().toString());
                    kredi8=Double.parseDouble(derskredi8.getText().toString());
                    kredi9=Double.parseDouble(derskredi9.getText().toString());
                    kredi10=Double.parseDouble(derskredi10.getText().toString());
                    double sonnot=(kredi1*dersnotu1+kredi2*dersnotu2+kredi3*dersnotu3+kredi4*dersnotu4+kredi5*dersnotu5+kredi6*dersnotu6+
                            kredi7*dersnotu7+kredi8*dersnotu8+kredi9*dersnotu9+kredi10*dersnotu10)
                            /(kredi1+kredi2+kredi3+kredi4+kredi5+kredi6+kredi7+kredi8+kredi9+kredi10);
                    kaydet.setVisibility(View.INVISIBLE);
                    hesapla.setVisibility(View.INVISIBLE);
                    finalnotun.setText(Double.toString(sonnot));
                    notun.setVisibility(View.VISIBLE);
                    finalnotun.setVisibility(View.VISIBLE);

                }
                kaydet.setVisibility(View.INVISIBLE);

            }
        });









    }






}
