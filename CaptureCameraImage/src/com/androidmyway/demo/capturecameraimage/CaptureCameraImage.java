package com.androidmyway.demo.capturecameraimage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;

public class CaptureCameraImage extends Activity {

	public static int cameraID = 0;
	public static boolean isBlack = true;
	public static ImageView image;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitycapturecameraimage);
        image = (ImageView) findViewById(R.id.imgView);
    }

    public void onFrontClick(View v){
    	RadioButton rdbBlack = (RadioButton) findViewById(R.id.rdb_black);
    	if(rdbBlack.isChecked()){
    		isBlack = true;
    	}else{
    		isBlack = false;
    	}
		cameraID = 1;
		Intent i = new Intent(CaptureCameraImage.this,CameraView.class);
        startActivityForResult(i, 999);
	}
    
	public void onBackClick(View v){
		RadioButton rdbBlack = (RadioButton) findViewById(R.id.rdb_black);
    	if(rdbBlack.isChecked()){
    		isBlack = true;
    	}else{
    		isBlack = false;
    	}
    	cameraID = 0;
		Intent i = new Intent(CaptureCameraImage.this,CameraView.class);
        startActivityForResult(i, 999);
	}
    
}
