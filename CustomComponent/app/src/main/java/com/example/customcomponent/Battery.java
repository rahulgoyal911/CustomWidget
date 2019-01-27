package com.example.customcomponent;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

public class Battery extends View {
    public Battery(Context context) {
        super(context);

        init(null);
    }

    public Battery(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    public Battery(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs);
    }

    public Battery(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);

        init(attrs);
    }

    private void init(@Nullable AttributeSet set){

    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {

        MainActivity mainActivity = new MainActivity();
        int a;
        a= mainActivity.per();
        while(a==0){
            a = mainActivity.per();
        }
        a=100-a;
    //    Toast.makeText(getContext(), Integer.valueOf(a).toString(),Toast.LENGTH_SHORT).show();
        Rect rect = new Rect();
        rect.bottom=0;
        rect.left=100;
        rect.top=rect.bottom+10*a;
        rect.right=rect.left+300;

        Paint paint = new Paint();
        paint.setColor(Color.RED);

        canvas.drawRect(rect,paint);

        Rect rect1 = new Rect();
        rect1.bottom=rect.top;
        rect1.left=100;
        rect1.top=rect1.bottom+10*(100-a);
        rect1.right=rect.left+300;

        Paint paint1 = new Paint();
        paint1.setColor(Color.GREEN);

        canvas.drawRect(rect1,paint1);
    }
}
