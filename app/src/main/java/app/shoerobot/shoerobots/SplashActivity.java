package app.shoerobot.shoerobots;

import java.util.Timer;
import java.util.TimerTask;

import app.shoerobot.shoerobots.constants.LustradorConstants;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;

/**
 * 
 * @author mash
 *
 */
public class SplashActivity extends Activity {
	
	private final static String tag = SplashActivity.class.getName();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		Log.i(tag,"INICIA SPLASH");
		setContentView(R.layout.splash);
		TimerTask task = new TimerTask(){
			@Override
			public void run() {
				Intent mainIntent = new Intent(SplashActivity.this, MainBluetooth.class);
				startActivity(mainIntent);
				finish();
			}
		};
		Timer timer = new Timer();
		timer.schedule(task, LustradorConstants.SPLASH_TIMER);
	}

}
