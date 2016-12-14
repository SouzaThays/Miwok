package com.example.android.miwok;

/**
 * Created by thays on 31/07/2016.
 */
public class Word {


    private String mDefauldTranslation;
    private String mMiwokTranslation;

    public Word(String mMiwokTranslation, String mDefauldTranslation) {
        this.mMiwokTranslation = mMiwokTranslation;
        this.mDefauldTranslation = mDefauldTranslation;
    }


    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    public void setmMiwokTranslation(String mMiwokTranslation) {
        this.mMiwokTranslation = mMiwokTranslation;
    }

    public String getmDefauldTranslation() {
        return mDefauldTranslation;
    }

    public void setmDefauldTranslation(String mDefauldTranslation) {
        this.mDefauldTranslation = mDefauldTranslation;
    }
}


