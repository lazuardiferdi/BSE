package personal.mine.bse;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class SplashActivity2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash2);
        Thread thread = new Thread() {
            public void run () {
                try {
                    sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();

                } finally {
                    startActivity(new Intent(SplashActivity2.this , MainActivity.class));
                    finish();
                }
            }
        };
        thread.start();
    }
}