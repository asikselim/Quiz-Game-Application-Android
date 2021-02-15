package com.h5180054.selim_asik.Utils;

import android.content.Context;

import com.h5180054.selim_asik.R;
import com.h5180054.selim_asik.Utils.Questions;

import java.util.ArrayList;

public class QuestionUtil {
    static ArrayList<Questions> questions = new ArrayList<>();


    static int QUESTION_INDEX = 0;

    public static void createHistoryQuestion(Context context){
        Questions question1 = new Questions(
                context.getResources().getString(R.string.history_question1),
                context.getResources().getString(R.string.history_question_1_a),
                context.getResources().getString(R.string.history_question_1_b),
                context.getResources().getString(R.string.history_question_1_c),
                2
        );
        Questions question2 = new Questions(
                context.getResources().getString(R.string.history_question2),
                context.getResources().getString(R.string.history_question_2_a),
                context.getResources().getString(R.string.history_question_2_b),
                context.getResources().getString(R.string.history_question_2_c),
                1
        );
        Questions question3 = new Questions(
                context.getResources().getString(R.string.history_question3),
                context.getResources().getString(R.string.history_question_3_a),
                context.getResources().getString(R.string.history_question_3_b),
                context.getResources().getString(R.string.history_question_3_c),
                1
        );
        Questions question4 = new Questions(
                context.getResources().getString(R.string.history_question4),
                context.getResources().getString(R.string.history_question_4_a),
                context.getResources().getString(R.string.history_question_4_b),
                context.getResources().getString(R.string.history_question_4_c),
                1
        );
        Questions question5 = new Questions(
                context.getResources().getString(R.string.history_question5),
                context.getResources().getString(R.string.history_question_5_a),
                context.getResources().getString(R.string.history_question_5_b),
                context.getResources().getString(R.string.history_question_5_c),
                1
        );
        Questions question6 = new Questions(
                context.getResources().getString(R.string.history_question6),
                context.getResources().getString(R.string.history_question_6_a),
                context.getResources().getString(R.string.history_question_6_b),
                context.getResources().getString(R.string.history_question_6_c),
                2
        );
        Questions question7 = new Questions(

                context.getResources().getString(R.string.history_question7),
                context.getResources().getString(R.string.history_question_7_a),
                context.getResources().getString(R.string.history_question_7_b),
                context.getResources().getString(R.string.history_question_7_c),
                3
        );
        Questions question8 = new Questions(
                context.getResources().getString(R.string.history_question8),
                context.getResources().getString(R.string.history_question_8_a),
                context.getResources().getString(R.string.history_question_8_b),
                context.getResources().getString(R.string.history_question_8_c),
                1
        );
        Questions question9 = new Questions(
                context.getResources().getString(R.string.history_question9),
                context.getResources().getString(R.string.history_question_9_a),
                context.getResources().getString(R.string.history_question_9_b),
                context.getResources().getString(R.string.history_question_9_c),
                1
        );
        Questions question10 = new Questions(
                context.getResources().getString(R.string.history_question10),
                context.getResources().getString(R.string.history_question_10_a),
                context.getResources().getString(R.string.history_question_10_b),
                context.getResources().getString(R.string.history_question_10_c),
                1
        );
        questions.add(question1);
        questions.add(question2);
        questions.add(question3);
        questions.add(question4);
        questions.add(question5);
        questions.add(question6);
        questions.add(question7);
        questions.add(question8);
        questions.add(question9);
        questions.add(question10);

    }

    public static void createEconomiQuestion(Context context) {
        Questions question1 = new Questions(
                context.getResources().getString(R.string.economi_question_1),
                context.getResources().getString(R.string.economi_question_1_a),
                context.getResources().getString(R.string.economi_question_1_b),
                context.getResources().getString(R.string.economi_question_1_c),
                3
        );
        Questions question2 = new Questions(
                context.getResources().getString(R.string.economi_question_2),
                context.getResources().getString(R.string.economi_question_2_a),
                context.getResources().getString(R.string.economi_question_2_b),
                context.getResources().getString(R.string.economi_question_2_c),
                2
        );
        Questions question3 = new Questions(
                context.getResources().getString(R.string.economi_question_3),
                context.getResources().getString(R.string.economi_question_3_a),
                context.getResources().getString(R.string.economi_question_3_b),
                context.getResources().getString(R.string.economi_question_3_c),
                2
        );
        Questions question4 = new Questions(
                context.getResources().getString(R.string.economi_question_4),
                context.getResources().getString(R.string.economi_question_4_a),
                context.getResources().getString(R.string.economi_question_4_b),
                context.getResources().getString(R.string.economi_question_4_c),
                3
        );
        Questions question5 = new Questions(
                context.getResources().getString(R.string.economi_question_5),
                context.getResources().getString(R.string.economi_question_5_a),
                context.getResources().getString(R.string.economi_question_5_b),
                context.getResources().getString(R.string.economi_question_5_c),
                3
        );
        Questions question6 = new Questions(
                context.getResources().getString(R.string.economi_question_6),
                context.getResources().getString(R.string.economi_question_6_a),
                context.getResources().getString(R.string.economi_question_6_b),
                context.getResources().getString(R.string.economi_question_6_c),
                1
        );
        Questions question7 = new Questions(
                context.getResources().getString(R.string.economi_question_7),
                context.getResources().getString(R.string.economi_question_7_a),
                context.getResources().getString(R.string.economi_question_7_b),
                context.getResources().getString(R.string.economi_question_7_c),
                3
        );
        Questions question8 = new Questions(
                context.getResources().getString(R.string.economi_question_8),
                context.getResources().getString(R.string.economi_question_8_a),
                context.getResources().getString(R.string.economi_question_8_b),
                context.getResources().getString(R.string.economi_question_8_c),
                1
        );
        Questions question9 = new Questions(
                context.getResources().getString(R.string.economi_question_9),
                context.getResources().getString(R.string.economi_question_9_a),
                context.getResources().getString(R.string.economi_question_9_b),
                context.getResources().getString(R.string.economi_question_9_c),
                3
        );
        Questions question10 = new Questions(
                context.getResources().getString(R.string.economi_question_10),
                context.getResources().getString(R.string.economi_question_10_a),
                context.getResources().getString(R.string.economi_question_10_b),
                context.getResources().getString(R.string.economi_question_10_c),
                3
        );


        questions.add(question1);
        questions.add(question2);
        questions.add(question3);
        questions.add(question4);
        questions.add(question5);
        questions.add(question6);
        questions.add(question7);
        questions.add(question8);
        questions.add(question9);
        questions.add(question10);
    }

    public static void createTechnologyQuestions(Context context) {
        Questions question1 = new Questions(
                context.getResources().getString(R.string.technology_question_1),
                context.getResources().getString(R.string.technology_question_1_a),
                context.getResources().getString(R.string.technology_question_1_b),
                context.getResources().getString(R.string.technology_question_1_c),
                1
        );
        Questions question2 = new Questions(
                context.getResources().getString(R.string.technology_question_2),
                context.getResources().getString(R.string.technology_question_2_a),
                context.getResources().getString(R.string.technology_question_2_b),
                context.getResources().getString(R.string.technology_question_2_c),
                2
        );
        Questions question3 = new Questions(
                context.getResources().getString(R.string.technology_question_3),
                context.getResources().getString(R.string.technology_question_3_a),
                context.getResources().getString(R.string.technology_question_3_b),
                context.getResources().getString(R.string.technology_question_3_c),
                2
        );
        Questions question4 = new Questions(
                context.getResources().getString(R.string.technology_question_4),
                context.getResources().getString(R.string.technology_question_4_a),
                context.getResources().getString(R.string.technology_question_4_b),
                context.getResources().getString(R.string.technology_question_4_c),
                2
        );
        Questions question5 = new Questions(
                context.getResources().getString(R.string.technology_question_5),
                context.getResources().getString(R.string.technology_question_5_a),
                context.getResources().getString(R.string.technology_question_5_b),
                context.getResources().getString(R.string.technology_question_5_c),
                2
        );
        Questions question6 = new Questions(
                context.getResources().getString(R.string.technology_question_6),
                context.getResources().getString(R.string.technology_question_6_a),
                context.getResources().getString(R.string.technology_question_6_b),
                context.getResources().getString(R.string.technology_question_6_c),
                1
        );
        Questions question7 = new Questions(
                context.getResources().getString(R.string.technology_question_7),
                context.getResources().getString(R.string.technology_question_7_a),
                context.getResources().getString(R.string.technology_question_7_b),
                context.getResources().getString(R.string.technology_question_7_c),
                2
        );
        Questions question8 = new Questions(
                context.getResources().getString(R.string.technology_question_8),
                context.getResources().getString(R.string.technology_question_8_a),
                context.getResources().getString(R.string.technology_question_8_b),
                context.getResources().getString(R.string.technology_question_8_c),
                2
        );
        Questions question9 = new Questions(
                context.getResources().getString(R.string.technology_question_9),
                context.getResources().getString(R.string.technology_question_9_a),
                context.getResources().getString(R.string.technology_question_9_b),
                context.getResources().getString(R.string.technology_question_9_c),
                2
        );
        Questions question10 = new Questions(
                context.getResources().getString(R.string.technology_question_10),
                context.getResources().getString(R.string.technology_question_10_a),
                context.getResources().getString(R.string.technology_question_10_b),
                context.getResources().getString(R.string.technology_question_10_c),
                2
        );
        questions.add(question1);
        questions.add(question2);
        questions.add(question3);
        questions.add(question4);
        questions.add(question5);
        questions.add(question6);
        questions.add(question7);
        questions.add(question8);
        questions.add(question9);
        questions.add(question10);
    }





    public static Questions getNextQuestion() {
        if (QUESTION_INDEX < questions.size() - 1) {
            QUESTION_INDEX++;
        } else {
            QUESTION_INDEX = 0;
        }
        return questions.get(QUESTION_INDEX);
    }

    public static Boolean isAnswerTrue(int answer) {
        if (questions.get(QUESTION_INDEX).getCorrectAnswer() == answer) {
            return true;
        } else {
            return false;
        }
    }
}