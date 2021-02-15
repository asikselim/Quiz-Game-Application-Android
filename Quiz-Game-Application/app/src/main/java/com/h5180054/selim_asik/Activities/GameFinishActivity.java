package com.h5180054.selim_asik.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.h5180054.selim_asik.R;

public class GameFinishActivity extends AppCompatActivity  implements View.OnClickListener {

    Button btnAnaEkranDonus,btnCikis;
    TextView txtskor,txtSoruSayisi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_finish);



        init();

    }

    private void init(){
         txtskor =findViewById(R.id.txtscore);
         txtSoruSayisi=findViewById(R.id.txtquesiton);

         btnAnaEkranDonus=findViewById(R.id.backHomeButton);
         btnCikis=findViewById(R.id.btnexit);



        Intent getIntentL = getIntent();
        String questionNumber = getIntentL.getStringExtra("questionNumber");
        String score = getIntentL.getStringExtra("score");
        int number= Integer.parseInt(questionNumber);

        txtskor.setText("Skorunuz "+score);
        txtSoruSayisi.setText("Soru "+(number-1)+"/10");
        btnAnaEkranDonus.setOnClickListener(this);
        btnCikis.setOnClickListener(this);
    }



    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.btnexit:
                finish();
                break;
            case R.id.backHomeButton:
                Intent BackHomeActivityIntent = new Intent(getApplicationContext(), CategoryActivity.class);
                startActivity(BackHomeActivityIntent);
                finish();
                break;
        }
    }
}