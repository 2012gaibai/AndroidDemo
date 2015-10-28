package com.code.androiddemo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by gan on 2015/10/27.
 */
public class TrendGraphView extends View{
    /**
     * 画笔：线
     */
    private Paint mLinePaint;


    public TrendGraphView(Context context) {
        super(context);
        initView();
    }

    public TrendGraphView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView();
    }

    public TrendGraphView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView();
    }

    private void initView(){
        mLinePaint=new Paint();
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(widthMeasureSpec,heightMeasureSpec);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

}
