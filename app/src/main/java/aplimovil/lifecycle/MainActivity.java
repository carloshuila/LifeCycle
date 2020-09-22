package aplimovil.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.Toast;
import android.os.CountDownTimer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Toast tag = Toast.makeText( this,"onCreate", Toast.LENGTH_SHORT );
        tag.show();
        timeToast(tag,1000);
    }

    @Override
    protected void onStart() {
        super.onStart();
        final Toast tag = Toast.makeText( this,"onStart", Toast.LENGTH_SHORT );
        tag.show();
        timeToast(tag,3000);
    }

    @Override
    protected void onResume() {
        super.onResume();
        final Toast tag = Toast.makeText( this,"onResume", Toast.LENGTH_SHORT );
        tag.show();
        timeToast(tag,5000);
    }

    @Override
    protected void onPause() {
        super.onPause();
        final Toast tag = Toast.makeText( this,"onPause", Toast.LENGTH_SHORT );
        tag.show();
        timeToast(tag,2000);
    }

    @Override
    protected void onStop() {
        super.onStop();
        final Toast tag = Toast.makeText( this,"onStop", Toast.LENGTH_SHORT );
        tag.show();
        timeToast(tag,4000);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        final Toast tag = Toast.makeText( this,"onDestroy", Toast.LENGTH_SHORT );
        tag.show();
    }

    protected void timeToast(final Toast tag, int time){
        new CountDownTimer(time, time){
            public void onTick(long millisUntilFinished){
                tag.show();
            }
            public void onFinish() {
                tag.show();
            }
        }
        .start();
    }
}