package khoapham.ptp.phamtanphat.drawableresource02072019;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.util.Log;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

//    ImageView imgBattery;
//    int level = 0;
    CheckBox cbAndroid,cbios;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        imgBattery = findViewById(R.id.imageviewBattery);

//        final Drawable drawable = imgBattery.getDrawable();
//        imgBattery.setImageLevel(0);

//        final CountDownTimer countDownTimer = new CountDownTimer(5000, 1000) {
//            @Override
//            public void onTick(long l) {
//                if (level >= 10000) {
//                    level = 0;
//                }
//                level += 1000;
//                drawable.setLevel(level);
//                imgBattery.setImageLevel(drawable.getLevel());
//            }
//
//            @Override
//            public void onFinish() {
//                this.start();
//            }
//        };
//        countDownTimer.start();
//        final Handler handler = new Handler();
//        handler.postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                Toast.makeText(MainActivity.this, "Hello", Toast.LENGTH_SHORT).show();
//                handler.postDelayed(this,1000);
//            }
//        },1000);
        cbAndroid = findViewById(R.id.checkboxAndroid);
        cbios = findViewById(R.id.checkboxios);

        cbAndroid.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    Toast.makeText(MainActivity.this, "Da check", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "Bo check", Toast.LENGTH_SHORT).show();
                }
            }
        });
        //Gia tri trong checkbox
        cbAndroid.isChecked();
    }
}
