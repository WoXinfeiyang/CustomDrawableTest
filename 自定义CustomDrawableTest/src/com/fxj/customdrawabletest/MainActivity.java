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
 * �ļ����ƣ��Զ���Drawable-�Զ���CustomDrawableTest
 * ʱ�䣺2016-9-29 20:10
 * ˵����1���Զ���Drawable��Ҫ�̳���дandroid.graphics.drawable.Drawable����draw��setAlpha��setColorFilter��getOpacity�⼸��������
 * �����⼸���������Ǳ�����д�ġ�
 * 2����Activity�ĵ�ǰWindow��û�ʧȥ����ʱ�ᱻ�ص�Activity.onWindowFocusChanged������
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
