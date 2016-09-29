package com.fxj.customdrawabletest.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PixelFormat;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

public class CustomDrawable extends Drawable {
	Paint mPaint;
	
	public CustomDrawable(int color) {
		/*创建一个画笔,画笔抗锯齿*/
		this.mPaint=new Paint(Paint.ANTI_ALIAS_FLAG);
		mPaint.setColor(color);
	}

	@Override
	public void draw(Canvas canvas) {
		// TODO Auto-generated method stub
		final Rect rect=getBounds();
		float cx=rect.exactCenterX();
		float cy=rect.exactCenterY();
		canvas.drawCircle(cx, cy,Math.min(cx, cy), mPaint);
	}
	
	/**设置透明度*/
	@Override
	public void setAlpha(int alpha) {
		// TODO Auto-generated method stub
		mPaint.setAlpha(alpha);
		invalidateSelf();
	}

	@Override
	public void setColorFilter(ColorFilter cf) {
		// TODO Auto-generated method stub
		mPaint.setColorFilter(cf);
		invalidateSelf();
	}

	@Override
	public int getOpacity() {
		// TODO Auto-generated method stub
		return PixelFormat.TRANSLUCENT;/*使窗口支持透明度*/
	}

}
