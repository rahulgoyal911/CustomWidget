package com.example.customcomponent;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

public class Battery1 extends View {
    public Battery1(Context context) {
        super(context);

        init(null);
    }

    public Battery1(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    public Battery1(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs);
    }

    public Battery1(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);

        init(attrs);
    }

    private void init(@Nullable AttributeSet set){

    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {

        MainActivity mainActivity = new MainActivity();
        int a = mainActivity.per();
//        while(a==0){
//            a = mainActivity.per();
//        }
        int b=100-a;



        Rect rect = new Rect();
        rect.bottom=0;
        rect.left=100;
        rect.right=rect.left+300;
        rect.top=rect.bottom+16*b;

        Paint paint = new Paint();
        paint.setColor(Color.RED);



        canvas.drawRect(rect,paint);
    }
}
