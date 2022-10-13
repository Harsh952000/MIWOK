package com.example.android.miwok;

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImage=NO_IMAGE;
    private static final int NO_IMAGE=-1;
    public Word(String defaultTranslation ,String miwokTranslation ,int image )
    {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImage=image;
    }
    public Word(String defaultTranslation ,String miwokTranslation )
    {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }
    public String getDefaultTranslation()
    {
        return mDefaultTranslation;
    }
    public String getMIwokTranslation()
    {
        return  mMiwokTranslation;
    }
    public int  getImage()
    {

            return  mImage;
    }


    public boolean hasImage(){
        if(mImage!=NO_IMAGE)
            return true;
        else
            return  false;
    }
}