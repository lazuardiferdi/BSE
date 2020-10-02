package personal.mine.bse;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import personal.mine.bse.onBoarding.IntroActivity;

public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(SplashActivity.this, IntroActivity.class);
                startActivity(i);
                finish();
            }
        }, 5000);
    }
}