package christinahunter.quizapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class QuestionActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mTrueButton;
    private Button mFalseButton;

    private TextView mTextView;

    private Question firstQuestion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        mTrueButton = (Button) findViewById(R.id.true_button);
        mFalseButton = (Button) findViewById(R.id.false_button);

        mTrueButton.setOnClickListener(this);
        mFalseButton.setOnClickListener(this);

        mTextView = (TextView)findViewById(R.id.text_view);

        firstQuestion = new Question(R.string.question_2, false);
        mTextView.setText(firstQuestion.getTextResId());
    }


    @Override
    public void onClick(View v) {
        Toast myToast;

        if(v.getId() == R.id.true_button && firstQuestion.getAnswer() == true  ) {
            myToast = Toast.makeText(this, "You are incorrect", Toast.LENGTH_SHORT);
            myToast.setGravity(Gravity.TOP,0,0);
            myToast.show();
        }
        else if(v.getId() == R.id.false_button && firstQuestion.getAnswer() == false){
            myToast = Toast.makeText(this, "You are correct" ,Toast.LENGTH_SHORT);
            myToast.setGravity(Gravity.TOP,0,0);
            myToast.show();
        }
        else{
            myToast = Toast.makeText(this, "You are incorrect", Toast.LENGTH_SHORT);
            myToast.setGravity(Gravity.TOP,0,0);
            myToast.show();
        }

    }
}
