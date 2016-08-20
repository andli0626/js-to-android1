package com.example.jstoandroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Button;

public class MainActivity extends Activity {

	WebView webview;
	Button button;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		webview = (WebView) findViewById(R.id.webview);
		button  = (Button)findViewById(R.id.button);
		
		webview.getSettings().setJavaScriptEnabled(true);
		
		webview.loadUrl("file:///android_asset/test.html");
		
		button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				String color = "#00ee00";
				webview.loadUrl("javascript:changeColor ('"+color+"');");
			}
		});
		
	}

}
