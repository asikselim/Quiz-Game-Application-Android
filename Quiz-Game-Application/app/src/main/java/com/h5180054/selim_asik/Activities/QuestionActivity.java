package com.h5180054.selim_asik.Activities;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.h5180054.selim_asik.R;
import com.h5180054.selim_asik.Utils.QuestionUtil;
import com.h5180054.selim_asik.Utils.Questions;

public class QuestionActivity extends AppCompatActivity implements View.OnClickListener {

    TextView txtQuestion,txtCategoryName,txtNumberOfQuestion,txtScore;
    Button btn1,btn2,btn3,btnGetQuestion;
    Integer score=0;
    Integer questionCounter=1;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);
        init();
    }



    private void btnRestart(){
        btn1.setBackground(getResources().getDrawable(R.drawable.questionbuttonbg));
        btn2.setBackground(getResources().getDrawable(R.drawable.questionbuttonbg));
        btn3.setBackground(getResources().getDrawable(R.drawable.questionbuttonbg));

    }

    




    private void fillTheQuestion(){
        btnRestart();
        Questions question = QuestionUtil.getNextQuestion();
        txtQuestion.setText(question.getQuestion());
        btn1.setText(question.getAnswer1());
        btn2.setText(question.getAnswer2());
        btn3.setText(question.getAnswer3());

    }

    public void exitOrNextQuestionPopup (){
        AlertDialog.Builder builder =new AlertDialog.Builder(this);
        builder.setTitle("Tebrikler Cevabınız Doğru!");
        builder.setPositiveButton("Devam", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface miniscreen, int i) {



                miniscreen.dismiss();
                fillTheQuestion();

            }
        });
        builder.setNegativeButton("Çıkış", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface miniscreen, int i) {
                miniscreen.dismiss();
                Intent exitquestionIntent = new Intent(getApplicationContext(), GameFinishActivity.class);
                startActivity(exitquestionIntent);
                finish();
            }
        });
        builder.show();
    }
    public void oneSecondTimer(){
        CountDownTimer countDownTimer = new CountDownTimer(1000, 1000) {
            @Override
            public void onTick(long l) {
            }

            @Override
            public void onFinish() {
                Intent GameFinishActivityIntent=new Intent(getApplicationContext(),GameFinishActivity.class);
                GameFinishActivityIntent.putExtra("questionNumber",questionCounter.toString());
                GameFinishActivityIntent.putExtra("score",score.toString());
                startActivity(GameFinishActivityIntent);
                finish();
            }
        };
        countDownTimer.start();
    }


    private  void answerOfTheQuestion(int clickedAnswer,View btnClicked){
        if(QuestionUtil.isAnswerTrue(clickedAnswer)){
            btnClicked.setBackgroundColor(getResources().getColor(R.color.green));
            questionCounter++;
            score+=100;
            txtScore.setText("Skor "+score);
            txtNumberOfQuestion.setText("Soru "+questionCounter+"/10");
            if (questionCounter==11){
                Intent congratsActivityIntent=new Intent(getApplicationContext(),CongratsActivity.class);
                congratsActivityIntent.putExtra("questionNumber",questionCounter.toString());
                congratsActivityIntent.putExtra("score",score.toString());
                startActivity(congratsActivityIntent);
                finish();

            }
            else{
                exitOrNextQuestionPopup();
            }
        }

        else{
            btnClicked.setBackgroundColor(getResources().getColor(R.color.Red));
            oneSecondTimer();

        }


    }




    private void init(){

        txtCategoryName= findViewById(R.id.txtCategoryName);
        txtNumberOfQuestion=findViewById(R.id.txtNumberOfQuestion);
        txtScore=findViewById(R.id.textScore);

        txtScore.setText("Skor "+score);
        txtNumberOfQuestion.setText("Soru "+questionCounter+"/10");

        Intent getBackCategory=getIntent();
        String resultCategory=getBackCategory.getStringExtra("categoryName");
        txtCategoryName.setText(resultCategory);
        txtQuestion = findViewById(R.id.txtQuestion);
        btn1 = findViewById(R.id.btnanswer1);
        btn2 = findViewById(R.id.btnanswer2);
        btn3 = findViewById(R.id.btnanswer3);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);


        if(resultCategory.equals(getResources().getString(R.string.app_ekonomi))){
            QuestionUtil.createEconomiQuestion(getApplicationContext());
        }
        else if(resultCategory.equals(getResources().getString(R.string.app_tarih))){
            QuestionUtil.createHistoryQuestion(getApplicationContext());
        }
        else if(resultCategory.equals(getResources().getString(R.string.app_teknoloji))){
            QuestionUtil.createTechnologyQuestions(getApplicationContext());
        }


        btnRestart();
        fillTheQuestion();


    }




    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnanswer1:
                answerOfTheQuestion(1,v);
                break;
            case R.id.btnanswer2:
                answerOfTheQuestion(2,v);
                break;
            case R.id.btnanswer3:
                answerOfTheQuestion(3,v);
                break;

        }
    }
}