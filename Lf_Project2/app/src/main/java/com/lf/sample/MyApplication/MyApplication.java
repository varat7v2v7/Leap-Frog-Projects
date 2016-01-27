package com.lf.sample.MyApplication;

import android.app.Application;
import android.graphics.Typeface;
import android.widget.Button;

/**
 * Created by Varat on 1/26/2016.
 */
public class MyApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        initFont();
    }

    public static class Fonts{
        public static Typeface FONTICON;
    }

    private void initFont(){
        Fonts.FONTICON = Typeface.create(Typeface.createFromAsset(getAssets(), "newFont.ttf"),Typeface.NORMAL);

    }
}
