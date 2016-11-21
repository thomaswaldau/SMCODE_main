package com.tstp.smcode;

import android.content.Context;
import android.content.res.Resources;

import java.util.Random;

/**
 * Created by thwa on 2016-11-15.
 */

public class GameModes {
    //Reads and sets diffrent values with setThings and then the diffrent gamemodes call the fields it wants
    //TO COME: UI and Background - 2 more game modes(color and custom)

    private Context c;

    public GameModes(Context c){
        this.c = c;
        Resources resources = this.c.getResources();
    }

    public String character;
    public String attribute;
    public String setting;
    public String bckgrnd;
    public String emotion;
    public String color;

    public void setCharacter(){
        this.character = setThings("characters");
    }
    public void setAttribute(){
        this.attribute = setThings("attribute");
    }
    public void setSetting(){this.setting = setThings("setting");}
    public void setBackground(){this.bckgrnd = setThings("background");}
    public void setEmotion(){this.emotion = setThings("emotion");}
    public void setColor(){this.color = getColor();}

    Random rnd = new Random();

    public void sketch(){

        setCharacter();
        setSetting();
        setAttribute();
        setBackground();
        setEmotion();


    }
    public void timeSketch(){
        setCharacter();
        setAttribute();
    }

    public void colorSketch(){
        setColor();
        setCharacter();
        setAttribute();
        setEmotion();

    }
    public void customSketch(){}

    private String setThings(String tagg){
        int tempInt = c.getResources().getIdentifier(tagg, "array",  this.c.getPackageName());
        String[] arrayList = c.getResources().getStringArray(tempInt);

        return arrayList[rnd.nextInt(arrayList.length)];

    }
    private String getColor(){
        int colorAmount = rnd.nextInt((4-2)+1) + 2;
        String resultString = null;
        String tempString1 = "";
        String tempString2 = "";

        int tempInt = c.getResources().getIdentifier("color", "array",  this.c.getPackageName());
        String[] arrayList = c.getResources().getStringArray(tempInt);

        while(colorAmount > 0)
        {
            tempString1 = arrayList[rnd.nextInt(arrayList.length)];

            if (tempString1 != tempString2){

                if(resultString == null){
                    resultString = tempString1;
                    colorAmount--;
                    tempString2 = tempString1;
                }else{
                resultString = resultString+" -- "+ tempString1 ;
                colorAmount--;
                tempString2 = tempString1;
                }

            }



        }
        return resultString;
    }
}

