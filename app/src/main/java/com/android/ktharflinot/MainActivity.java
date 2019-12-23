package com.android.ktharflinot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private Button anamenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anamenu=(Button) findViewById(R.id.anamenu);
        anamenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                anamenuyedon();
            }
        });
    }
    public void anamenuyedon(){
        Intent intent=new Intent(this,Asasmainactivity.class);
        startActivity(intent);
    }

    public void onButtonClick (View view) {
        CheckBox checkBox;
        TextView txt1 = findViewById(R.id.txt1);
        TextView txt5 = findViewById(R.id.textView5);
        TextView text42=findViewById(R.id.textView42);
        TextView text43=findViewById(R.id.textView43);
        EditText editText3 = findViewById(R.id.editText3);
        EditText editText4 = findViewById(R.id.editText4);
        EditText editText5 = findViewById(R.id.editText5);
        EditText editText6 = findViewById(R.id.editText6);

        TextView txtaa = findViewById(R.id.textView6);
        TextView txtba = findViewById(R.id.textView7);
        TextView txtbb = findViewById(R.id.textView10);
        TextView txtcb = findViewById(R.id.textView11);
        TextView txtcc = findViewById(R.id.textView12);
        TextView txtdc = findViewById(R.id.textView13);
        TextView txtdd = findViewById(R.id.textView14);
        TextView txtfd = findViewById(R.id.textView21);
        TextView txtff = findViewById(R.id.textView22);
        TextView notaaicin = findViewById(R.id.textView8);
        TextView notfficin = findViewById(R.id.textView24);
        TextView notfdicin = findViewById(R.id.textView26);
        TextView notddicin = findViewById(R.id.textView28);
        TextView notdcicin = findViewById(R.id.textView29);
        TextView notccicin = findViewById(R.id.textView32);
        TextView notcbicin = findViewById(R.id.textView34);
        TextView notbbicin = findViewById(R.id.textView36);
        TextView notbaicin = findViewById(R.id.textView39);
        TextView notaayeni = findViewById(R.id.textView9);
        TextView notffyeni = findViewById(R.id.textView25);
        TextView notfdyeni = findViewById(R.id.textView27);
        TextView notddyeni = findViewById(R.id.textView30);
        TextView notdcyeni = findViewById(R.id.textView31);
        TextView notccyeni = findViewById(R.id.textView33);
        TextView notcbyeni = findViewById(R.id.textView35);
        TextView notbbyeni = findViewById(R.id.textView37);
        TextView notbayeni = findViewById(R.id.textView38);
        TextView aatroll = findViewById(R.id.textView15);
        TextView batroll = findViewById(R.id.textView16);
        TextView bbtroll = findViewById(R.id.textView17);
        TextView cbtroll = findViewById(R.id.textView18);
        TextView cctroll = findViewById(R.id.textView19);
        TextView dctroll = findViewById(R.id.textView20);
        TextView ddtroll = findViewById(R.id.textView23);
        TextView fdtroll = findViewById(R.id.textView40);
        TextView fftroll = findViewById(R.id.textView41);
        txtaa.setText("");
        txtba.setText("");
        txtbb.setText("");
        txtcb.setText("");
        txtcc.setText("");
        txtdc.setText("");
        txtdd.setText("");
        txtfd.setText("");
        txtff.setText("");
        notaaicin.setText("");
        notbaicin.setText("");
        notbbicin.setText("");
        notcbicin.setText("");
        notccicin.setText("");
        notdcicin.setText("");
        notddicin.setText("");
        notfdicin.setText("");
        notfficin.setText("");
        notaayeni.setText("");
        notbayeni.setText("");
        notbbyeni.setText("");
        notcbyeni.setText("");
        notccyeni.setText("");
        notdcyeni.setText("");
        notddyeni.setText("");
        notfdyeni.setText("");
        notffyeni.setText("");
        aatroll.setText("");
        batroll.setText("");
        bbtroll.setText("");
        cbtroll.setText("");
        cctroll.setText("");
        dctroll.setText("");
        ddtroll.setText("");
        fdtroll.setText("");
        fftroll.setText("");
        if(editText3.getText().toString().isEmpty() || editText4.getText().toString().isEmpty() || editText5.getText().toString().isEmpty() || editText6.getText().toString().isEmpty()  )
        {
            text42.setText("   HATALI GİRİŞ YAPTIN️");
            text43.setText(" ☹️");

            return;
        }



        checkBox = findViewById(R.id.checkBox);

        double ss = Double.parseDouble(editText3.getText().toString());
        double ortalama = Double.parseDouble(editText4.getText().toString());
        double vize = Double.parseDouble(editText5.getText().toString());

        String harf = "";



        if(!checkBox.isChecked()){
            double but = Double.parseDouble(editText6.getText().toString());
            double t = (((vize + but) / 2.0 - ortalama) / ss) * 10 + 50;
            if(editText3.getText().toString().isEmpty() || editText4.getText().toString().isEmpty() || editText5.getText().toString().isEmpty()  )
            {
                text42.setText("   HATALI GİRİŞ YAPTIN️");
                text43.setText(" ☹️");

                return;
            }


            if (ortalama < 15) {
                text42.setText("HİÇ GİRMESEYDİNİZ SINAVA");
                return;
            } else if (ortalama > 99) {
                text42.setText("KARDEŞ SİZ DİREK MIT'DE İŞE BAŞLAYIN BIRAKIN OKUMAYI");
            } else if (but < 45) {
                harf = "FF";

            } else if (ss < 0 && ss > 50) {
                text42.setText("HATALI GİRİŞ YAPTIN");
                return;
            } else if (vize < 0 && vize > 100) {
                text42.setText("HATALI GİRİŞ YAPTIN");
                return;
            } else if (but < 0 && but > 50) {
                text42.setText("HATALI GİRİŞ YAPTIN");
                return;
            } else if (ortalama <= 42.5) {
                if (t < 36)
                    harf = "FF";
                else if (t >= 36 && t <= 40.99)
                    harf = "FD";
                else if (t > 40.99 && t <= 45.99)
                    harf = "DD";
                else if (t > 45.99 && t <= 50.99)
                    harf = "DC";
                else if (t > 50.99 && t <= 55.99)
                    harf = "CC";
                else if (t > 55.99 && t <= 60.99)
                    harf = "CB";
                else if (t > 60.99 && t <= 65.99)
                    harf = "BB";
                else if (t > 65.99 && t <= 70.99)
                    harf = "BA";
                else if (t > 70.99)
                    harf = "AA";
            } else if (ortalama > 42.5 && ortalama <= 47.5) {
                if (t < 34)
                    harf = "FF";
                else if (t >= 36 && t <= 39.99)
                    harf = "FD";
                else if (t > 38.99 && t <= 43.99)
                    harf = "DD";
                else if (t > 43.99 && t <= 48.99)
                    harf = "DC";
                else if (t > 48.99 && t <= 53.99)
                    harf = "CC";
                else if (t > 53.99 && t <= 58.99)
                    harf = "CB";
                else if (t > 58.99 && t <= 63.99)
                    harf = "BB";
                else if (t > 63.99 && t <= 68.99)
                    harf = "BA";
                else if (t > 68.99)
                    harf = "AA";
            } else if (ortalama > 47.5 && ortalama <= 52.5) {
                if (t < 32)
                    harf = "FF";
                else if (t >= 32 && t <= 36.99)
                    harf = "FD";
                else if (t > 36.99 && t <= 41.99)
                    harf = "DD";
                else if (t > 41.99 && t <= 46.99)
                    harf = "DC";
                else if (t > 46.99 && t <= 51.99)
                    harf = "CC";
                else if (t > 51.99 && t <= 56.99)
                    harf = "CB";
                else if (t > 56.99 && t <= 61.99)
                    harf = "BB";
                else if (t > 61.99 && t <= 66.99)
                    harf = "BA";
                else if (t > 66.99)
                    harf = "AA";
            } else if (ortalama > 52.5 && ortalama <= 57.5) {
                if (t < 30)
                    harf = "FF";
                else if (t >= 30 && t <= 34.99)
                    harf = "FD";
                else if (t > 34.99 && t <= 39.99)
                    harf = "DD";
                else if (t > 39.99 && t <= 44.99)
                    harf = "DC";
                else if (t > 44.99 && t <= 49.99)
                    harf = "CC";
                else if (t > 49.99 && t <= 54.99)
                    harf = "CB";
                else if (t > 54.99 && t <= 59.99)
                    harf = "BB";
                else if (t > 59.99 && t <= 64.99)
                    harf = "BA";
                else if (t > 64.99)
                    harf = "AA";
            } else if (ortalama > 57.5 && ortalama <= 62.5) {
                if (t < 28)
                    harf = "FF";
                else if (t >= 28 && t <= 32.99)
                    harf = "FD";
                else if (t > 32.99 && t <= 37.99)
                    harf = "DD";
                else if (t > 37.99 && t <= 42.99)
                    harf = "DC";
                else if (t > 42.99 && t <= 47.99)
                    harf = "CC";
                else if (t > 47.99 && t <= 52.99)
                    harf = "CB";
                else if (t > 52.99 && t <= 57.99)
                    harf = "BB";
                else if (t > 57.99 && t <= 62.99)
                    harf = "BA";
                else if (t > 62.99)
                    harf = "AA";
            } else if (ortalama > 62.5 && ortalama <= 70) {
                if (t < 26)
                    harf = "FF";
                else if (t >= 26 && t <= 30.99)
                    harf = "FD";
                else if (t > 30.99 && t <= 35.99)
                    harf = "DD";
                else if (t > 35.99 && t <= 40.99)
                    harf = "DC";
                else if (t > 40.99 && t <= 45.99)
                    harf = "CC";
                else if (t > 45.99 && t <= 50.99)
                    harf = "CB";
                else if (t > 50.99 && t <= 55.99)
                    harf = "BB";
                else if (t > 55.99 && t <= 60.99)
                    harf = "BA";
                else if (t > 60.99)
                    harf = "AA";
            } else if (ortalama > 70 && ortalama <= 80) {
                if (t < 24)
                    harf = "FF";
                else if (t >= 24 && t <= 28.99)
                    harf = "FD";
                else if (t > 28.99 && t <= 33.99)
                    harf = "DD";
                else if (t > 33.99 && t <= 38.99)
                    harf = "DC";
                else if (t > 38.99 && t <= 43.99)
                    harf = "CC";
                else if (t > 43.99 && t <= 48.99)
                    harf = "CB";
                else if (t > 48.99 && t <= 53.99)
                    harf = "BB";
                else if (t > 53.99 && t <= 58.99)
                    harf = "BA";
                else if (t > 58.99)
                    harf = "AA";
            } else if (ortalama > 80 && ortalama <= 100) {
                if (t < 22)
                    harf = "FF";
                else if (t >= 22 && t <= 26.99)
                    harf = "FD";
                else if (t > 26.99 && t <= 31.99)
                    harf = "DD";
                else if (t > 31.99 && t <= 36.99)
                    harf = "DC";
                else if (t > 36.99 && t <= 41.99)
                    harf = "CC";
                else if (t > 41.99 && t <= 46.99)
                    harf = "CB";
                else if (t > 46.99 && t <= 51.99)
                    harf = "BB";
                else if (t > 51.99 && t <= 56.99)
                    harf = "BA";
                else if (t > 56.99)
                    harf = "AA";
            }
            txt1.setText("Harfli Notun");
            if (harf == "AA" || harf == "BA" || harf == "BB" || harf == "CC" || harf == "CB") {
                txt5.setText(harf);
                txt5.setTextColor(Color.GREEN);
            } else if (harf == "DD" || harf == "FD" || harf == "FF") {
                txt5.setText(harf);
                txt5.setTextColor(Color.RED);
            } else if (harf == "DC") {
                txt5.setText(harf);
                txt5.setTextColor(Color.MAGENTA);
            }
        }


        else  {
            double but = Double.parseDouble(editText6.getText().toString());

            but=45;
            txt1 = findViewById(R.id.txt1);
            txt5 = findViewById(R.id.textView5);

            editText3 = findViewById(R.id.editText3);
            editText4 = findViewById(R.id.editText4);
            editText5 = findViewById(R.id.editText5);
            editText6 = findViewById(R.id.editText6);


            editText6.setText("45");
            txt1.setText("");
            txt5.setText("");
            txtaa.setText(" Finalden            Alırsan");
            txtba.setText(" Finalden            Alırsan");
            txtbb.setText(" Finalden            Alırsan");
            txtcb.setText(" Finalden            Alırsan");
            txtcc.setText(" Finalden            Alırsan");
            txtdc.setText(" Finalden            Alırsan");
            txtdd.setText(" Finalden            Alırsan");
            txtfd.setText(" Finalden            Alırsan");
            txtff.setText(" Finalden            Alırsan");


            int almangerek = 0;
            double ti = (((vize + 45) / 2.0 - ortalama) / ss) * 10 + 50;


            if (ortalama < 15) {
                text42.setText("HİÇ GİRMESEYDİNİZ SINAVA");
                return;
            } else if (ortalama > 99) {
                text42.setText("KARDEŞ SİZ DİREK MIT'DE İŞE BAŞLAYIN BIRAKIN OKUMAYI");
            } else if (but < 45) {
                harf = "FF";

            } else if (ss < 0 && ss > 50) {
                text42.setText("HATALI GİRİŞ YAPTIN");
                return;
            } else if (vize < 0 && vize > 100) {
                text42.setText("HATALI GİRİŞ YAPTIN");
                return;
            } else if (but < 0 && but > 50) {
                text42.setText("HATALI GİRİŞ YAPTIN");
                return;
            } else if (ss < 0 && ss > 50) {
                text42.setText("HATALI GİRİŞ YAPTIN");
                return;
            } else if (vize < 0 && vize > 100) {
                text42.setText("HATALI GİRİŞ YAPTIN");
                return;
            } else if (but < 0 && but > 50) {
                text42.setText("HATALI GİRİŞ YAPTIN");
                return;
            } else if (ortalama <= 42.5) {


                if (ti < 36)
                    harf = "FF";
                else if (ti >= 36 && ti <= 40.99)
                    harf = "FD";
                else if (ti > 40.99 && ti <= 45.99)
                    harf = "DD";
                else if (ti > 45.99 && ti <= 50.99)
                    harf = "DC";
                else if (ti > 50.99 && ti <= 55.99)
                    harf = "CC";
                else if (ti > 55.99 && ti <= 60.99)
                    harf = "CB";
                else if (ti > 60.99 && ti <= 65.99)
                    harf = "BB";
                else if (ti > 65.99 && ti <= 70.99)
                    harf = "BA";
                else if (ti > 70.99)
                    harf = "AA";
                notaaicin.setText("45");
                notaayeni.setText(harf);

                if (harf == "AA" || harf == "BA" || harf == "BB" || harf == "CC" || harf == "CB") {
                    notaayeni.setTextColor(Color.GREEN);
                    notaaicin.setTextColor(Color.GREEN);
                } else if (harf == "DD" || harf == "FD" || harf == "FF") {
                    notaayeni.setTextColor(Color.RED);
                    notaaicin.setTextColor(Color.RED);
                } else if (harf == "DC") {
                    notaayeni.setTextColor(Color.MAGENTA);
                    notaaicin.setTextColor(Color.MAGENTA);
                }


                almangerek = (int) ((((((35 - 50) * ss) / 10.0) + ortalama) * 2) - vize+0.99);
                if (almangerek > 45 && harf != "FF") {
                    harf = "FF";

                    notaaicin.setText(String.valueOf(almangerek));
                    notaayeni.setText(harf);

                }
                almangerek = (int) ((((((36 - 50) * ss) / 10.0) + ortalama) * 2) - vize+0.99);
                if (almangerek > 45 && harf != "FD") {
                    harf = "FD";
                    notbaicin.setText(String.valueOf(almangerek));
                    notbayeni.setText(harf);
                }
                almangerek = (int) ((((((41 - 50) * ss) / 10.0) + ortalama) * 2) - vize+0.99);
                if (almangerek > 45 && harf != "DD") {
                    harf = "DD";
                    notbbicin.setText(String.valueOf(almangerek));
                    notbbyeni.setText(harf);
                }
                almangerek = (int) ((((((46 - 50) * ss) / 10.0) + ortalama) * 2) - vize+0.99);
                if (almangerek > 45 && harf != "DC") {
                    harf = "DC";
                    notcbicin.setText(String.valueOf(almangerek));
                    notcbyeni.setText(harf);

                }
                almangerek = (int) ((((((51 - 50) * ss) / 10.0) + ortalama) * 2) - vize+0.99);
                if (almangerek > 45 && harf != "CC") {
                    harf = "CC";
                    notccicin.setText(String.valueOf(almangerek));
                    notccyeni.setText(harf);

                }
                almangerek = (int) ((((((56 - 50) * ss) / 10.0) + ortalama) * 2) - vize+0.99);
                if (almangerek > 45 && harf != "CB") {
                    harf = "CB";
                    notdcicin.setText(String.valueOf(almangerek));
                    notdcyeni.setText(harf);

                }
                almangerek = (int) ((((((61 - 50) * ss) / 10.0) + ortalama) * 2) - vize+0.99);
                if (almangerek > 45 && harf != "BB") {
                    harf = "BB";
                    notddicin.setText(String.valueOf(almangerek));
                    notddyeni.setText(harf);

                }
                almangerek = (int) ((((((66 - 50) * ss) / 10.0) + ortalama) * 2) - vize+0.99);
                if (almangerek > 45 && harf != "BA") {
                    harf = "BA";
                    notfdicin.setText(String.valueOf(almangerek));
                    notfdyeni.setText(harf);

                }
                almangerek = (int) ((((((71 - 50) * ss) / 10.0) + ortalama) * 2) - vize+0.99);
                if (almangerek > 45 && harf != "AA") {
                    harf = "AA";
                    notfficin.setText(String.valueOf(almangerek));
                    notffyeni.setText(harf);

                }


            } else if (ortalama > 42.5 && ortalama <= 47.5) {
                if (ti < 34)
                    harf = "FF";
                else if (ti >= 36 && ti <= 39.99)
                    harf = "FD";
                else if (ti > 38.99 && ti <= 43.99)
                    harf = "DD";
                else if (ti > 43.99 && ti <= 48.99)
                    harf = "DC";
                else if (ti > 48.99 && ti <= 53.99)
                    harf = "CC";
                else if (ti > 53.99 && ti <= 58.99)
                    harf = "CB";
                else if (ti > 58.99 && ti <= 63.99)
                    harf = "BB";
                else if (ti > 63.99 && ti <= 68.99)
                    harf = "BA";
                else if (ti > 68.99)
                    harf = "AA";
                notaaicin.setText("45");
                notaayeni.setText(harf);
                if (harf == "AA" || harf == "BA" || harf == "BB" || harf == "CC" || harf == "CB") {
                    notaayeni.setTextColor(Color.GREEN);
                    notaaicin.setTextColor(Color.GREEN);
                } else if (harf == "DD" || harf == "FD" || harf == "FF") {
                    notaayeni.setTextColor(Color.RED);
                    notaaicin.setTextColor(Color.RED);
                } else if (harf == "DC") {
                    notaayeni.setTextColor(Color.MAGENTA);
                    notaaicin.setTextColor(Color.MAGENTA);
                }


                almangerek = (int) ((((((33.99 - 50) / 10.0) * ss) + ortalama) * 2) - vize+0.99);
                if (almangerek > 45 && harf != "FF") {
                    harf = "FF";
                    notaaicin.setText(String.valueOf(almangerek));
                    notaayeni.setText(harf);

                }
                almangerek = (int) ((((((36 - 50) * ss) / 10.0) + ortalama) * 2) - vize+0.99);
                if (almangerek > 45 && harf != "FD") {
                    harf = "FD";
                    notbaicin.setText(String.valueOf(almangerek));
                    notbayeni.setText(harf);

                }
                almangerek = (int) ((((((39 - 50) * ss) / 10.0) + ortalama) * 2) - vize+0.99);
                if (almangerek > 45 && harf != "DD") {
                    harf = "DD";
                    notbbicin.setText(String.valueOf(almangerek));
                    notbbyeni.setText(harf);

                }
                almangerek = (int) ((((((44 - 50) * ss) / 10.0) + ortalama) * 2) - vize+0.99);
                if (almangerek > 45 && harf != "DC") {
                    harf = "DC";
                    notcbicin.setText(String.valueOf(almangerek));
                    notcbyeni.setText(harf);

                }
                almangerek = (int) ((((((49 - 50) * ss) / 10.0) + ortalama) * 2) - vize+0.99);
                if (almangerek > 45 && harf != "CC") {
                    harf = "CC";
                    notccicin.setText(String.valueOf(almangerek));
                    notccyeni.setText(harf);

                }
                almangerek = (int) ((((((54 - 50) * ss) / 10.0) + ortalama) * 2) - vize+0.99);
                if (almangerek > 45 && harf != "CB") {
                    harf = "CB";
                    notdcicin.setText(String.valueOf(almangerek));
                    notdcyeni.setText(harf);

                }
                almangerek = (int) ((((((59 - 50) * ss) / 10.0) + ortalama) * 2) - vize+0.99);
                if (almangerek > 45 && harf != "BB") {
                    harf = "BB";
                    notddicin.setText(String.valueOf(almangerek));
                    notddyeni.setText(harf);

                }
                almangerek = (int) ((((((64 - 50) * ss) / 10.0) + ortalama) * 2) - vize+0.99);
                if (almangerek > 45 && harf != "BA") {
                    harf = "BA";
                    notfdicin.setText(String.valueOf(almangerek));
                    notfdyeni.setText(harf);

                }
                almangerek = (int) ((((((69 - 50) * ss) / 10.0) + ortalama) * 2) - vize+0.99);
                if (almangerek > 45 && harf != "AA") {
                    harf = "AA";
                    notfficin.setText(String.valueOf(almangerek));
                    notffyeni.setText(harf);

                }
            } else if (ortalama > 47.5 && ortalama <= 52.5) {
                if (ti < 32)
                    harf = "FF";
                else if (ti >= 32 && ti <= 36.99)
                    harf = "FD";
                else if (ti > 36.99 && ti <= 41.99)
                    harf = "DD";
                else if (ti > 41.99 && ti <= 46.99)
                    harf = "DC";
                else if (ti > 46.99 && ti <= 51.99)
                    harf = "CC";
                else if (ti > 51.99 && ti <= 56.99)
                    harf = "CB";
                else if (ti > 56.99 && ti <= 61.99)
                    harf = "BB";
                else if (ti > 61.99 && ti <= 66.99)
                    harf = "BA";
                else if (ti > 66.99)
                    harf = "AA";
                notaaicin.setText("45");
                notaayeni.setText(harf);
                if (harf == "AA" || harf == "BA" || harf == "BB" || harf == "CC" || harf == "CB") {
                    notaayeni.setTextColor(Color.GREEN);
                    notaaicin.setTextColor(Color.GREEN);
                } else if (harf == "DD" || harf == "FD" || harf == "FF") {
                    notaayeni.setTextColor(Color.RED);
                    notaaicin.setTextColor(Color.RED);
                } else if (harf == "DC") {
                    notaayeni.setTextColor(Color.MAGENTA);
                    notaaicin.setTextColor(Color.MAGENTA);
                }


                almangerek = (int) ((((((31.99 - 50) * ss) / 10.0) + ortalama) * 2) - vize+0.99);
                if (almangerek > 45 && harf != "FF") {
                    harf = "FF";
                    notaaicin.setText(String.valueOf(almangerek));
                    notaayeni.setText(harf);

                }
                almangerek = (int) ((((((37 - 50) * ss) / 10.0) + ortalama) * 2) - vize+0.99);
                if (almangerek > 45 && harf != "FD") {
                    harf = "FD";
                    notbaicin.setText(String.valueOf(almangerek));
                    notbayeni.setText(harf);

                }
                almangerek = (int) ((((((42 - 50) * ss) / 10.0) + ortalama) * 2) - vize+0.99);
                if (almangerek > 45 && harf != "DD") {
                    harf = "DD";
                    notbbicin.setText(String.valueOf(almangerek));
                    notbbyeni.setText(harf);

                }
                almangerek = (int) ((((((47 - 50) * ss) / 10.0) + ortalama) * 2) - vize+0.99);
                if (almangerek > 45 && harf != "DC") {
                    harf = "DC";
                    notcbicin.setText(String.valueOf(almangerek));
                    notcbyeni.setText(harf);

                }
                almangerek = (int) ((((((52 - 50) * ss) / 10.0) + ortalama) * 2) - vize+0.99);
                if (almangerek > 45 && harf != "CC") {
                    harf = "CC";
                    notccicin.setText(String.valueOf(almangerek));
                    notccyeni.setText(harf);

                }
                almangerek = (int) ((((((57 - 50) * ss) / 10.0) + ortalama) * 2) - vize+0.99);
                if (almangerek > 45 && harf != "CB") {
                    harf = "CB";
                    notdcicin.setText(String.valueOf(almangerek));
                    notdcyeni.setText(harf);

                }
                almangerek = (int) ((((((61 - 50) * ss) / 10.0) + ortalama) * 2) - vize+0.99);
                if (almangerek > 45 && harf != "BB") {
                    harf = "BB";
                    notddicin.setText(String.valueOf(almangerek));
                    notddyeni.setText(harf);

                }
                almangerek = (int) ((((((67 - 50) * ss) / 10.0) + ortalama) * 2) - vize+0.99);
                if (almangerek > 45 && harf != "BA") {
                    harf = "BA";
                    notfdicin.setText(String.valueOf(almangerek));
                    notfdyeni.setText(harf);

                }
                almangerek = (int) ((((((71 - 50) * ss) / 10.0) + ortalama) * 2) - vize+0.99);
                if (almangerek > 45 && harf != "AA") {
                    harf = "AA";
                    notfficin.setText(String.valueOf(almangerek));
                    notffyeni.setText(harf);

                }
            } else if (ortalama > 52.5 && ortalama <= 57.5) {
                if (ti < 30)
                    harf = "FF";
                else if (ti >= 30 && ti <= 34.99)
                    harf = "FD";
                else if (ti > 34.99 && ti <= 39.99)
                    harf = "DD";
                else if (ti > 39.99 && ti <= 44.99)
                    harf = "DC";
                else if (ti > 44.99 && ti <= 49.99)
                    harf = "CC";
                else if (ti > 49.99 && ti <= 54.99)
                    harf = "CB";
                else if (ti > 54.99 && ti <= 59.99)
                    harf = "BB";
                else if (ti > 59.99 && ti <= 64.99)
                    harf = "BA";
                else if (ti > 64.99)
                    harf = "AA";
                notaaicin.setText("45");
                notaayeni.setText(harf);
                if (harf == "AA" || harf == "BA" || harf == "BB" || harf == "CC" || harf == "CB") {
                    notaayeni.setTextColor(Color.GREEN);
                    notaaicin.setTextColor(Color.GREEN);
                } else if (harf == "DD" || harf == "FD" || harf == "FF") {
                    notaayeni.setTextColor(Color.RED);
                    notaaicin.setTextColor(Color.RED);
                } else if (harf == "DC") {
                    notaayeni.setTextColor(Color.MAGENTA);
                    notaaicin.setTextColor(Color.MAGENTA);
                }


                almangerek = (int) ((((((29.99 - 50) * ss) / 10.0) + ortalama) * 2) - vize+0.99);
                if (almangerek > 45 && harf != "FF") {
                    harf = "FF";
                    notaaicin.setText(String.valueOf(almangerek));
                    notaayeni.setText(harf);

                }
                almangerek = (int) ((((((30 - 50) * ss) / 10.0) + ortalama) * 2) - vize+0.99);
                if (almangerek > 45 && harf != "FD") {
                    harf = "FD";
                    notbaicin.setText(String.valueOf(almangerek));
                    notbayeni.setText(harf);

                }
                almangerek = (int) ((((((35 - 50) * ss) / 10.0) + ortalama) * 2) - vize+0.99);
                if (almangerek > 45 && harf != "DD") {
                    harf = "DD";
                    notbbicin.setText(String.valueOf(almangerek));
                    notbbyeni.setText(harf);

                }
                almangerek = (int) ((((((40 - 50) * ss) / 10.0) + ortalama) * 2) - vize+0.99);
                if (almangerek > 45 && harf != "DC") {
                    harf = "DC";
                    notcbicin.setText(String.valueOf(almangerek));
                    notcbyeni.setText(harf);

                }
                almangerek = (int) ((((((45 - 50) * ss) / 10.0) + ortalama) * 2) - vize+0.99);
                if (almangerek > 45 && harf != "CC") {
                    harf = "CC";
                    notccicin.setText(String.valueOf(almangerek));
                    notccyeni.setText(harf);

                }
                almangerek = (int) ((((((55 - 50) * ss) / 10.0) + ortalama) * 2) - vize+0.99);
                if (almangerek > 45 && harf != "CB") {
                    harf = "CB";
                    notdcicin.setText(String.valueOf(almangerek));
                    notdcyeni.setText(harf);

                }
                almangerek = (int) ((((((60 - 50) * ss) / 10.0) + ortalama) * 2) - vize+0.99);
                if (almangerek > 45 && harf != "BB") {
                    harf = "BB";
                    notddicin.setText(String.valueOf(almangerek));
                    notddyeni.setText(harf);

                }
                almangerek = (int) ((((((65 - 50) * ss) / 10.0) + ortalama) * 2) - vize+0.99);
                if (almangerek > 45 && harf != "BA") {
                    harf = "BA";
                    notfdicin.setText(String.valueOf(almangerek));
                    notfdyeni.setText(harf);

                }
                almangerek = (int) ((((((70 - 50) * ss) / 10.0) + ortalama) * 2) - vize+0.99);
                if (almangerek > 45 && harf != "AA") {
                    harf = "AA";
                    notfficin.setText(String.valueOf(almangerek));
                    notffyeni.setText(harf);

                }
            } else if (ortalama > 57.5 && ortalama <= 62.5) {
                if (ti < 28)
                    harf = "FF";
                else if (ti >= 28 && ti <= 32.99)
                    harf = "FD";
                else if (ti > 32.99 && ti <= 37.99)
                    harf = "DD";
                else if (ti > 37.99 && ti <= 42.99)
                    harf = "DC";
                else if (ti > 42.99 && ti <= 47.99)
                    harf = "CC";
                else if (ti > 47.99 && ti <= 52.99)
                    harf = "CB";
                else if (ti > 52.99 && ti <= 57.99)
                    harf = "BB";
                else if (ti > 57.99 && ti <= 62.99)
                    harf = "BA";
                else if (ti > 62.99)
                    harf = "AA";
                notaaicin.setText("45");
                notaayeni.setText(harf);
                if (harf == "AA" || harf == "BA" || harf == "BB" || harf == "CC" || harf == "CB") {
                    notaayeni.setTextColor(Color.GREEN);
                    notaaicin.setTextColor(Color.GREEN);
                } else if (harf == "DD" || harf == "FD" || harf == "FF") {
                    notaayeni.setTextColor(Color.RED);
                    notaaicin.setTextColor(Color.RED);
                } else if (harf == "DC") {
                    notaayeni.setTextColor(Color.MAGENTA);
                    notaaicin.setTextColor(Color.MAGENTA);
                }


                almangerek = (int) ((((((27.99 - 50) * ss) / 10.0) + ortalama) * 2) - vize+0.99);
                if (almangerek > 45 && harf != "FF") {
                    harf = "FF";
                    notaaicin.setText(String.valueOf(almangerek));
                    notaayeni.setText(harf);

                }
                almangerek = (int) ((((((28 - 50) * ss) / 10.0) + ortalama) * 2) - vize+0.99);
                if (almangerek > 45 && harf != "FD") {
                    harf = "FD";
                    notbaicin.setText(String.valueOf(almangerek));
                    notbayeni.setText(harf);

                }
                almangerek = (int) ((((((33 - 50) * ss) / 10.0) + ortalama) * 2) - vize+0.99);
                if (almangerek > 45 && harf != "DD") {
                    harf = "DD";
                    notbbicin.setText(String.valueOf(almangerek));
                    notbbyeni.setText(harf);

                }
                almangerek = (int) ((((((38 - 50) * ss) / 10.0) + ortalama) * 2) - vize+0.99);
                if (almangerek > 45 && harf != "DC") {
                    harf = "DC";
                    notcbicin.setText(String.valueOf(almangerek));
                    notcbyeni.setText(harf);

                }
                almangerek = (int) ((((((43 - 50) * ss) / 10.0) + ortalama) * 2) - vize+0.99);
                if (almangerek > 45 && harf != "CC") {
                    harf = "CC";
                    notccicin.setText(String.valueOf(almangerek));
                    notccyeni.setText(harf);

                }
                almangerek = (int) ((((((48 - 50) * ss) / 10.0) + ortalama) * 2) - vize+0.99);
                if (almangerek > 45 && harf != "CB") {
                    harf = "CB";
                    notdcicin.setText(String.valueOf(almangerek));
                    notdcyeni.setText(harf);

                }
                almangerek = (int) ((((((53 - 50) * ss) / 10.0) + ortalama) * 2) - vize+0.99);
                if (almangerek > 45 && harf != "BB") {
                    harf = "BB";
                    notddicin.setText(String.valueOf(almangerek));
                    notddyeni.setText(harf);

                }
                almangerek = (int) ((((((58 - 50) * ss) / 10.0) + ortalama) * 2) - vize+0.99);
                if (almangerek > 45 && harf != "BA") {
                    harf = "BA";
                    notfdicin.setText(String.valueOf(almangerek));
                    notfdyeni.setText(harf);

                }
                almangerek = (int) ((((((63 - 50) * ss) / 10.0) + ortalama) * 2) - vize+0.99);
                if (almangerek > 45 && harf != "AA") {
                    harf = "AA";
                    notfficin.setText(String.valueOf(almangerek));
                    notffyeni.setText(harf);

                }
            } else if (ortalama > 62.5 && ortalama <= 70) {
                if (ti < 26)
                    harf = "FF";
                else if (ti >= 26 && ti <= 30.99)
                    harf = "FD";
                else if (ti > 30.99 && ti <= 35.99)
                    harf = "DD";
                else if (ti > 35.99 && ti <= 40.99)
                    harf = "DC";
                else if (ti > 40.99 && ti <= 45.99)
                    harf = "CC";
                else if (ti > 45.99 && ti <= 50.99)
                    harf = "CB";
                else if (ti > 50.99 && ti <= 55.99)
                    harf = "BB";
                else if (ti > 55.99 && ti <= 60.99)
                    harf = "BA";
                else if (ti > 60.99)
                    harf = "AA";
                notaaicin.setText("45");
                notaayeni.setText(harf);
                if (harf == "AA" || harf == "BA" || harf == "BB" || harf == "CC" || harf == "CB") {
                    notaayeni.setTextColor(Color.GREEN);
                    notaaicin.setTextColor(Color.GREEN);
                } else if (harf == "DD" || harf == "FD" || harf == "FF") {
                    notaayeni.setTextColor(Color.RED);
                    notaaicin.setTextColor(Color.RED);
                } else if (harf == "DC") {
                    notaayeni.setTextColor(Color.MAGENTA);
                    notaaicin.setTextColor(Color.MAGENTA);
                }


                almangerek = (int) ((((((25.99 - 50) * ss) / 10.0) + ortalama) * 2) - vize+0.99);
                if (almangerek > 45 && harf != "FF") {
                    harf = "FF";
                    notaaicin.setText(String.valueOf(almangerek));
                    notaayeni.setText(harf);

                }
                almangerek = (int) ((((((26 - 50) * ss) / 10.0) + ortalama) * 2) - vize+0.99);
                if (almangerek > 45 && harf != "FD") {
                    harf = "FD";
                    notbaicin.setText(String.valueOf(almangerek));
                    notbayeni.setText(harf);

                }
                almangerek = (int) ((((((31 - 50) * ss) / 10.0) + ortalama) * 2) - vize+0.99);
                if (almangerek > 45 && harf != "DD") {
                    harf = "DD";
                    notbbicin.setText(String.valueOf(almangerek));
                    notbbyeni.setText(harf);

                }
                almangerek = (int) ((((((36 - 50) * ss) / 10.0) + ortalama) * 2) - vize+0.99);
                if (almangerek > 45 && harf != "DC") {
                    harf = "DC";
                    notcbicin.setText(String.valueOf(almangerek));
                    notcbyeni.setText(harf);

                }
                almangerek = (int) ((((((41 - 50) * ss) / 10.0) + ortalama) * 2) - vize+0.99);
                if (almangerek > 45 && harf != "CC") {
                    harf = "CC";
                    notccicin.setText(String.valueOf(almangerek));
                    notccyeni.setText(harf);

                }
                almangerek = (int) ((((((46 - 50) * ss) / 10.0) + ortalama) * 2) - vize+0.99);
                if (almangerek > 45 && harf != "CB") {
                    harf = "CB";
                    notdcicin.setText(String.valueOf(almangerek));
                    notdcyeni.setText(harf);

                }
                almangerek = (int) ((((((51 - 50) * ss) / 10.0) + ortalama) * 2) - vize+0.99);
                if (almangerek > 45 && harf != "BB") {
                    harf = "BB";
                    notddicin.setText(String.valueOf(almangerek));
                    notddyeni.setText(harf);

                }
                almangerek = (int) ((((((56 - 50) * ss) / 10.0) + ortalama) * 2) - vize+0.99);
                if (almangerek > 45 && harf != "BA") {
                    harf = "BA";
                    notfdicin.setText(String.valueOf(almangerek));
                    notfdyeni.setText(harf);

                }
                almangerek = (int) ((((((61 - 50) * ss) / 10.0) + ortalama) * 2) - vize+0.99);
                if (almangerek > 45 && harf != "AA") {
                    harf = "AA";
                    notfficin.setText(String.valueOf(almangerek));
                    notffyeni.setText(harf);

                }
            } else if (ortalama > 70 && ortalama <= 80) {
                if (ti < 24)
                    harf = "FF";
                else if (ti >= 24 && ti <= 28.99)
                    harf = "FD";
                else if (ti > 28.99 && ti <= 33.99)
                    harf = "DD";
                else if (ti > 33.99 && ti <= 38.99)
                    harf = "DC";
                else if (ti > 38.99 && ti <= 43.99)
                    harf = "CC";
                else if (ti > 43.99 && ti <= 48.99)
                    harf = "CB";
                else if (ti > 48.99 && ti <= 53.99)
                    harf = "BB";
                else if (ti > 53.99 && ti <= 58.99)
                    harf = "BA";
                else if (ti > 58.99)
                    harf = "AA";
                notaaicin.setText("45");
                notaayeni.setText(harf);
                if (harf == "AA" || harf == "BA" || harf == "BB" || harf == "CC" || harf == "CB") {
                    notaayeni.setTextColor(Color.GREEN);
                    notaaicin.setTextColor(Color.GREEN);
                } else if (harf == "DD" || harf == "FD" || harf == "FF") {
                    notaayeni.setTextColor(Color.RED);
                    notaaicin.setTextColor(Color.RED);
                } else if (harf == "DC") {
                    notaayeni.setTextColor(Color.MAGENTA);
                    notaaicin.setTextColor(Color.MAGENTA);
                }


                almangerek = (int) ((((((23.99 - 50) * ss) / 10.0) + ortalama) * 2) - vize+0.99);
                if (almangerek > 45 && harf != "FF") {
                    harf = "FF";
                    notaaicin.setText(String.valueOf(almangerek));
                    notaayeni.setText(harf);

                }
                almangerek = (int) ((((((24 - 50) * ss) / 10.0) + ortalama) * 2) - vize+0.99);
                if (almangerek > 45 && harf != "FD") {
                    harf = "FD";
                    notbaicin.setText(String.valueOf(almangerek));
                    notbayeni.setText(harf);

                }
                almangerek = (int) ((((((29 - 50) * ss) / 10.0) + ortalama) * 2) - vize+0.99);
                if (almangerek > 45 && harf != "DD") {
                    harf = "DD";
                    notbbicin.setText(String.valueOf(almangerek));
                    notbbyeni.setText(harf);

                }
                almangerek = (int) ((((((34 - 50) * ss) / 10.0) + ortalama) * 2) - vize+0.99);
                if (almangerek > 45 && harf != "DC") {
                    harf = "DC";
                    notcbicin.setText(String.valueOf(almangerek));
                    notcbyeni.setText(harf);

                }
                almangerek = (int) ((((((39 - 50) * ss) / 10.0) + ortalama) * 2) - vize+0.99);
                if (almangerek > 45 && harf != "CC") {
                    harf = "CC";
                    notccicin.setText(String.valueOf(almangerek));
                    notccyeni.setText(harf);

                }
                almangerek = (int) ((((((44 - 50) * ss) / 10.0) + ortalama) * 2) - vize+0.99);
                if (almangerek > 45 && harf != "CB") {
                    harf = "CB";
                    notdcicin.setText(String.valueOf(almangerek));
                    notdcyeni.setText(harf);

                }
                almangerek = (int) ((((((49 - 50) * ss) / 10.0) + ortalama) * 2) - vize+0.99);
                if (almangerek > 45 && harf != "BB") {
                    harf = "BB";
                    notddicin.setText(String.valueOf(almangerek));
                    notddyeni.setText(harf);

                }
                almangerek = (int) ((((((54 - 50) * ss) / 10.0) + ortalama) * 2) - vize+0.99);
                if (almangerek > 45 && harf != "BA") {
                    harf = "BA";
                    notfdicin.setText(String.valueOf(almangerek));
                    notfdyeni.setText(harf);

                }
                almangerek = (int) ((((((59 - 50) * ss) / 10.0) + ortalama) * 2) - vize+0.99);
                if (almangerek > 45 && harf != "AA") {
                    harf = "AA";
                    notfficin.setText(String.valueOf(almangerek));
                    notffyeni.setText(harf);

                }
            } else if (ortalama > 80 && ortalama <= 100) {
                if (ti < 22)
                    harf = "FF";
                else if (ti >= 22 && ti <= 26.99)
                    harf = "FD";
                else if (ti > 26.99 && ti <= 31.99)
                    harf = "DD";
                else if (ti > 31.99 && ti <= 36.99)
                    harf = "DC";
                else if (ti > 36.99 && ti <= 41.99)
                    harf = "CC";
                else if (ti > 41.99 && ti <= 46.99)
                    harf = "CB";
                else if (ti > 46.99 && ti <= 51.99)
                    harf = "BB";
                else if (ti > 51.99 && ti <= 56.99)
                    harf = "BA";
                else if (ti > 56.99)
                    harf = "AA";
                notaaicin.setText("45");
                notaayeni.setText(harf);
                if (harf == "AA" || harf == "BA" || harf == "BB" || harf == "CC" || harf == "CB") {
                    notaayeni.setTextColor(Color.GREEN);
                    notaaicin.setTextColor(Color.GREEN);
                } else if (harf == "DD" || harf == "FD" || harf == "FF") {
                    notaayeni.setTextColor(Color.RED);
                    notaaicin.setTextColor(Color.RED);
                } else if (harf == "DC") {
                    notaayeni.setTextColor(Color.MAGENTA);
                    notaaicin.setTextColor(Color.MAGENTA);
                }


                almangerek = (int) ((((((21.99 - 50) * ss) / 10.0) + ortalama) * 2) - vize+0.99);
                if (almangerek > 45 && harf != "FF") {
                    harf = "FF";
                    notaaicin.setText(String.valueOf(almangerek));
                    notaayeni.setText(harf);

                }
                almangerek = (int) ((((((22 - 50) * ss) / 10.0) + ortalama) * 2) - vize+0.99);
                if (almangerek > 45 && harf != "FD") {
                    harf = "FD";
                    notbaicin.setText(String.valueOf(almangerek));
                    notbayeni.setText(harf);

                }
                almangerek = (int) ((((((27 - 50) * ss) / 10.0) + ortalama) * 2) - vize+0.99);
                if (almangerek > 45 && harf != "DD") {
                    harf = "DD";
                    notbbicin.setText(String.valueOf(almangerek));
                    notbbyeni.setText(harf);

                }
                almangerek = (int) ((((((32 - 50) * ss) / 10.0) + ortalama) * 2) - vize+0.99);
                if (almangerek > 45 && harf != "DC") {
                    harf = "DC";
                    notcbicin.setText(String.valueOf(almangerek));
                    notcbyeni.setText(harf);

                }
                almangerek = (int) ((((((37 - 50) * ss) / 10.0) + ortalama) * 2) - vize+0.99);
                if (almangerek > 45 && harf != "CC") {
                    harf = "CC";
                    notccicin.setText(String.valueOf(almangerek));
                    notccyeni.setText(harf);

                }
                almangerek = (int) ((((((42 - 50) * ss) / 10.0) + ortalama) * 2) - vize+0.99);
                if (almangerek > 45 && harf != "CB") {
                    harf = "CB";
                    notdcicin.setText(String.valueOf(almangerek));
                    notdcyeni.setText(harf);

                }
                almangerek = (int) ((((((47 - 50) * ss) / 10.0) + ortalama) * 2) - vize+0.99);
                if (almangerek > 45 && harf != "BB") {
                    harf = "BB";
                    notddicin.setText(String.valueOf(almangerek));
                    notddyeni.setText(harf);

                }
                almangerek = (int) ((((((52 - 50) * ss) / 10.0) + ortalama) * 2) - vize+0.99);
                if (almangerek > 45 && harf != "BA") {
                    harf = "BA";
                    notfdicin.setText(String.valueOf(almangerek));
                    notfdyeni.setText(harf);

                }
                almangerek = (int) ((((((57 - 50) * ss) / 10.0) + ortalama) * 2) - vize+0.99);
                if (almangerek > 45 && harf != "AA") {
                    harf = "AA";
                    notfficin.setText(String.valueOf(almangerek));
                    notffyeni.setText(harf);

                }
            }


            if(notaaicin.getText()=="")
            {
                txtaa.setText("");
            }
            else if (Integer.parseInt(notaaicin.getText().toString()) > 100)
                aatroll.setText("☺️");
            if(notbaicin.getText()=="")
            {
                txtff.setText("");
            }
            else  if (Integer.parseInt(notbaicin.getText().toString()) > 100)
                fftroll.setText("☺️");
            if(notbbicin.getText()=="")
            {
                txtfd.setText("");
            }
            else  if (Integer.parseInt(notbbicin.getText().toString()) > 100)
                fdtroll.setText("☺️");
            if(notcbicin.getText()=="")
            {
                txtdd.setText("");
            }
            else  if (Integer.parseInt(notcbicin.getText().toString()) > 100)
                ddtroll.setText("☺️");
            if(notccicin.getText()=="")
            {
                txtdc.setText("");
            }
            else if (Integer.parseInt(notccicin.getText().toString()) > 100)
                dctroll.setText("☺️");
            if(notdcicin.getText()=="")
            {
                txtcc.setText("");
            }
            else  if (Integer.parseInt(notdcicin.getText().toString()) > 100)
                cctroll.setText("☺️");
            if(notddicin.getText()=="")
            {
                txtcb.setText("");
            }
            else  if (Integer.parseInt(notddicin.getText().toString()) > 100)
                cbtroll.setText("☺️");
            if(notfdicin.getText()=="")
            {
                txtbb.setText("");
            }
            else  if (Integer.parseInt(notfdicin.getText().toString()) > 100)
                bbtroll.setText("☺️");
            if(notfficin.getText()=="")
            {
                txtba.setText("");
            }
            else  if (Integer.parseInt(notfficin.getText().toString()) > 100)
                batroll.setText("☺️");


        }
        text42.setText("️");
        text43.setText("");

    }


}
