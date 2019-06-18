package christinahunter.quizapp;

public class Question {

    private int mTextResId;
    private boolean mAnswer;

    public Question(int mTextResId, boolean answer) {
        this.mTextResId = mTextResId;
        this.mAnswer = answer;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public void setmTextResId(int mTextResId) {
        this.mTextResId = mTextResId;
    }

    public boolean getAnswer() {
        return mAnswer;
    }

    public void setmAnswer(boolean mAnswer) {
        this.mAnswer = mAnswer;
    }
}


