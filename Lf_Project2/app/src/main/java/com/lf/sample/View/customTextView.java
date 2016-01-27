package com.lf.sample.View;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

import com.lf.sample.MyApplication.MyApplication;

/**
 * Created by Varat on 1/26/2016.
 */
public class customTextView extends TextView{

    public customTextView(Context context) {
        super(context);
        setFont();
    }

    public customTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setFont();
    }

    public customTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setFont();
    }

    public void setFont (){
        setTypeface(MyApplication.Fonts.FONTICON);
    }

}
