package com.example.frag;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {
	int orientation;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		//Fragment1 fragment1;
		super.onCreate(savedInstanceState);
		// WindowManager wm = getWindowManager();
		// Display d = wm.getDefaultDisplay();
//		if (this.getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
//			Log.i("info", "landscape"); // ∫·∆¡
//		}
//		if (this.getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
//			//  ˙∆¡
//			FragmentManager fragmentManager = getFragmentManager();
//			FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//			fragment1 = new Fragment1();
//			fragmentTransaction.replace(android.R.id.content, fragment1);
//			fragmentTransaction.commit();
//		}
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

}
