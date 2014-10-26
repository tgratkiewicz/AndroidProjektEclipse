package com.example.przelaczniki;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
 
public class TestActivity extends Activity {
 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.layout2);
 }
 
 public void backActivityOnCLick(View V) {
 	Intent intent = new Intent(getApplicationContext(),MainActivity.class);
 	startActivity(intent);
 }
 
}