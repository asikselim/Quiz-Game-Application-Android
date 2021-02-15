package com.h5180054.selim_asik.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.h5180054.selim_asik.R;
import com.h5180054.selim_asik.Utils.PrefUtil;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    Button buttonNext;
    TextView nameText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        init();

    }

    private  void  init(){

        nameText=findViewById(R.id.nameText);
        buttonNext=findViewById(R.id.buttonNext);
        buttonNext.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.buttonNext:
                if(nameText.getText().toString().trim().equals(""))
                {
                    Toast.makeText(LoginActivity.this, "Boş Geçilemez,İsim giriniz!", Toast.LENGTH_SHORT).show();
                }
                else{
                    PrefUtil.setOyuncuAdi(getApplicationContext(),nameText.getText().toString());
                    Intent OyuncuAdiIntent =new Intent(getApplicationContext(), CategoryActivity.class);
                    startActivity(OyuncuAdiIntent);
                    finish();
                }
        }
    }
}