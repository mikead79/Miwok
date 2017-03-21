package com.example.android.miwok;

import android.graphics.Picture;

/**
 * Created by Mihai on 06/03/2017.
 */

public class Word {
    /** the variables have m in front because they are private
     *english translation of the word
     */
    private String mEnglishWord;
    /** miwok translation for the word */
    private String mMiwokWord;
    /** the image that represent the word */
    private int mPicture_id;
    /**
     * this is the constructor of the class Word without images
     * @param newEnglishWord is the english translation of the word
     * @param newMiwokWord is the miwok word */
    public Word(String newEnglishWord, String newMiwokWord){
        mEnglishWord = newEnglishWord;
        mMiwokWord = newMiwokWord;
    }
    /**
     * this is the constructor of the class Word with images
     * @param newEnglishWord is the english translation of the word
     * @param newMiwokWord is the miwok word
     * @param picture_id is the ID of the image resource   */
    public Word(String newEnglishWord, String newMiwokWord, int picture_id){
        mEnglishWord = newEnglishWord;
        mMiwokWord = newMiwokWord;
        mPicture_id = picture_id;
    }
    /**
     * @return the english translation of the word
     */
    public String getDefaultTranslation(){
        return mEnglishWord;
    }
    /**
     * @return the miwok translation of the word
     */
    public String getmiwokTranslation(){
        return mMiwokWord;
    }
    /**
     * @return the image ID of the word
     */
    public int getImageID(){
        return mPicture_id;
    }
}
