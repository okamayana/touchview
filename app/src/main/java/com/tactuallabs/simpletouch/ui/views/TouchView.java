package com.tactuallabs.simpletouch.ui.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.support.annotation.NonNull;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

public class TouchView extends View {

    private Paint mPaint;

    public TouchView(Context context, AttributeSet attrs) {
        super(context, attrs);

        setFocusable(true);
        setFocusableInTouchMode(true);

        mPaint = new Paint(Paint.DITHER_FLAG);
        mPaint.setColor(Color.BLACK);
        mPaint.setStyle(Style.FILL);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawPaint(mPaint);
    }

    @Override
    public boolean onTouchEvent(@NonNull MotionEvent event) {
        int action = event.getActionMasked();

        switch (action) {
            case MotionEvent.ACTION_DOWN:
                mPaint.setColor(Color.WHITE);
                invalidate();
                return true;

            case MotionEvent.ACTION_UP:
                mPaint.setColor(Color.BLACK);
                invalidate();
                return true;

            default:
                return false;
        }
    }
}
