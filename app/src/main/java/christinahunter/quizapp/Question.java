package christinahunter.quizapp;

public class Question {

    private int mTextResId;
    private boolean mAnswer;
    private int mHintResId;

    public Question(int mTextResId, boolean answer) {
        this.mTextResId = mTextResId;
        this.mAnswer = answer;
        mHintResId = -1;
    }

    public Question(int mTextResId, int mHintResId, boolean answer){
        this.mTextResId = mTextResId;
        this.mHintResId = mHintResId;
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

    public int getmHintResId() {
        return mHintResId;
    }

    public void setmHintResId(int mHintResId) {
        this.mHintResId = mHintResId;
    }
}


