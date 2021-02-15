package com.h5180054.selim_asik.Activities;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.h5180054.selim_asik.R;
import com.h5180054.selim_asik.Utils.PrefUtil;

public class CategoryActivity extends AppCompatActivity  implements View.OnClickListener {

    Button btnExit,btnHistory,btnEconomic,btnTechnology;
    TextView userNameText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);


        init();
    }

    private void init(){

        btnExit=findViewById(R.id.btnExitTrue);
        btnEconomic=findViewById(R.id.btnEconomic);
        btnHistory=findViewById(R.id.btnTarih);
        btnTechnology=findViewById(R.id.btnTechnology);

        userNameText = findViewById(R.id.userNameText);
        userNameText.setText("Hoşgeldin," + PrefUtil.getOyuncuAdi(getApplicationContext()));
        btnExit.setOnClickListener(this);
        btnHistory.setOnClickListener(this);
        btnEconomic.setOnClickListener(this);
        btnTechnology.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnExitTrue:
                exitPopup();
                break;
            case R.id.btnEconomic:
                Intent economicActivityIntent = new Intent(getApplicationContext(), QuestionActivity.class);
                economicActivityIntent.putExtra("categoryName",btnEconomic.getText().toString());
                startActivity(economicActivityIntent);
                finish();
                break;
            case R.id.btnTarih:
                Intent historyActivityIntent = new Intent(getApplicationContext(), QuestionActivity.class);
                historyActivityIntent.putExtra("categoryName",btnHistory.getText().toString());
                startActivity(historyActivityIntent);
                finish();
                break;
            case R.id.btnTechnology:
                Intent technologyActivityIntent = new Intent(getApplicationContext(), QuestionActivity.class);
                technologyActivityIntent.putExtra("categoryName",btnTechnology.getText().toString());
                startActivity(technologyActivityIntent);
                finish();
                break;
        }

    }

    public void exitPopup(){
        AlertDialog.Builder builder =new AlertDialog.Builder(this);
        builder.setTitle("Dikkat");
        builder.setMessage("Uygulanamadan çıkmak üzeresiniz. Çıkmak istediğinize emin misiniz?");
        builder.setPositiveButton("Evet", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface window, int i) {
                window.dismiss();
                finish();
            }
        });
        builder.setNegativeButton("Hayır", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface window, int i) {
                window.dismiss();
            }
        });
        builder.show();
    }
}