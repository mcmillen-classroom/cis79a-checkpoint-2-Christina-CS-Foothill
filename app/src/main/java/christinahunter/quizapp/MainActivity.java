package christinahunter.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mTrueButton;
    private Button mFalseButton;
    private Button mNextButton;

    private TextView mTextView;

    private Question firstQuestion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTrueButton = (Button) findViewById(R.id.true_button);
        mFalseButton = (Button) findViewById(R.id.false_button);
        mNextButton = (Button) findViewById(R.id.next_button);

        mNextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, QuestionActivity.class);
                startActivity(intent);
            }
        });
        mTrueButton.setOnClickListener(this);
        mFalseButton.setOnClickListener(this);

        mTextView = (TextView)findViewById(R.id.text_view);

        firstQuestion = new Question(R.string.question_1, false);
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
