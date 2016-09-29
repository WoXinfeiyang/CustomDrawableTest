package com.fxj.customdrawabletest;

import com.fxj.customdrawabletest.ui.CustomDrawable;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Color;
import android.util.Log;
import android.view.Menu;
import android.view.View;

/**
 * 文件名称：自定义Drawable-自定义CustomDrawableTest
 * 时间：2016-9-29 20:10
 * 说明：1、自定义Drawable需要继承重写android.graphics.drawable.Drawable类中draw、setAlpha、setColorFilter、getOpacity这几个方法，
 * 并且这几个方法都是必须重写的。
 * 2、当Activity的当前Window获得或失去焦点时会被回调Activity.onWindowFocusChanged方法。
 * */

public class MainActivity extends Activity {
	private String tag="MainActivity";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	
	@Override
	public void onWindowFocusChanged(boolean hasFocus) {
		// TODO Auto-generated method stub
		super.onWindowFocusChanged(hasFocus);
		if(hasFocus){
			View tv2=findViewById(R.id.tv02);
			int colorValue=Color.parseColor("#00ff00");
			Log.i(tag,"colorValue="+colorValue);
			CustomDrawable customDrawable=new CustomDrawable(colorValue);
			tv2.setBackgroundDrawable(customDrawable);
		}
	}

	
}
