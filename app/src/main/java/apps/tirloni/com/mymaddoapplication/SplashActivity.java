package apps.tirloni.com.mymaddoapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;


public class SplashActivity extends AppCompatActivity {
    private final static int TIME_SPLASH = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //Código - onde estou , para onde vou. Start, Finish
                Intent dashboard = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(dashboard);
                finish();
            }
        },TIME_SPLASH);
    }
}
