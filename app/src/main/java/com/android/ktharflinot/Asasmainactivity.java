package com.android.ktharflinot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Asasmainactivity extends AppCompatActivity {
    private Button bagilbutonu;
    private Button donembutonu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asasmainactivity);
        bagilbutonu=(Button) findViewById(R.id.bagil);
        donembutonu=(Button) findViewById(R.id.donemsonu);
        donembutonu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opendonem();
            }
        });
        bagilbutonu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openbagil();
            }
        });
    }
    public void openbagil(){
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }

  public void opendonem(){
      Intent intent=new Intent(this,DonemActivity.class);
      startActivity(intent);

  }
}
