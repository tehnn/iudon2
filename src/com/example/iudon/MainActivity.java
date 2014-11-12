package com.example.iudon;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {
	
	Button btnSave;
	EditText edtName,edtBw;	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_main);

		Toast.makeText(getApplicationContext(), "เกิด oncreate", 1).show();
		
		btnSave = (Button)findViewById(R.id.btnSave);
		edtName = (EditText)findViewById(R.id.edtName);
		edtBw = (EditText)findViewById(R.id.edtBw);
		
		btnSave.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				String name = edtName.getText().toString();
				String bw = edtBw.getText().toString();
				String result = name +" น้ำหนัก:" + bw  + "กก.";
				///Toast.makeText(getApplicationContext(),result,Toast.LENGTH_LONG).show();
				
				Log.d("tehnn", result);
				
				
			}
		});
		
		

	}// end onCreate	
	
		
	public void btnCancelClicked(View v){// กดปุ่ม cancel
		
		finish();
		
	}
	
	public void btnListClicked(View v){
		//  ไปที่ SeconActivity
		/*
		Intent intent = new Intent(getApplicationContext(),SecondActivity.class);
		startActivity(intent);
		*/
		Intent intent  = new Intent(getApplicationContext(), ThirdActivity.class);
		startActivity(intent);
		
		//return true;
		
	}
	

	@Override
	protected void onDestroy() {
		
		Toast.makeText(getApplicationContext(), "เกิด onDestroy", 1).show();
		super.onDestroy();
	}
	
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		
		Toast.makeText(getApplicationContext(), "resume", 1).show();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		
		int id = item.getItemId();
		
		if (id == R.id.action_settings) {
			
			Log.d("setting","click");
			
			return true;
		}
		
		if(id == R.id.action_list){
			Intent intent  = new Intent(getApplicationContext(), ThirdActivity.class);
			startActivity(intent);
			return true;
			
		}
		
		
		return super.onOptionsItemSelected(item);
	}
}
