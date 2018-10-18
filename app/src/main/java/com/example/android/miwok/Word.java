package com.example.android.miwok;

/**
 * Created by Faiq on 03-Jun-17.
 */

public class Word {

    private String dtrans;
    private String mtrans;
    private int img=NO;
    private static final int NO = -1;
    private int Audio;

    public Word(String Default, String Miwoke, int audio)
    {
        dtrans = Default;
        mtrans = Miwoke;
        Audio=audio;


    }

public Word(String Default, String Miwoke, int image,int audio)
{
    dtrans = Default;
    mtrans = Miwoke;
    img = image;
    Audio=audio;
}
    public int getimage(){
        return img;
    }
    public String getdtrans(){
      return dtrans;
    }
    public String getMtrans(){
        return mtrans;
    }

    public boolean getpic(){
        return img != NO;
    }
    public int getAudio(){
        return Audio;
    }
}
