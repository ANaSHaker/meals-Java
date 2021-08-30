package com.bfcai.meals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class splashActivity extends AppCompatActivity {

    // عرفت العناصر الموجوده في ملف xml عشان استدعيها و اخليها تعمل حاجه
    ImageView icon;
    TextView appName,gate;

    // عرفت اشكال الانيميشن لي انا عاملاها
    Animation side,bottom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // عرفت ان كل عنصر منهم بيساوي العنصر كذا في ملف xml
        icon=findViewById(R.id.imageView4);
        appName =findViewById(R.id.textView11);
        gate =findViewById(R.id.textView12);

        // عرفت اشكال الانيميشن وان كل فاريابل بيساوي الملف كذا
        side = AnimationUtils.loadAnimation(this,R.anim.side_anim);
        bottom = AnimationUtils.loadAnimation(this,R.anim.bottom_anim);

        // عرفت ان كل شكل هيحصلو الانيميشن كذا
        icon.setAnimation(side);
        appName.setAnimation(bottom);
        gate.setAnimation(bottom);


        // عرفت ميثود جاهزه ده عباره عن ميثود بتستني مده معينه وبعدين بتزود امر ما
        // وهنا طلبت منها انها تستني 4 ثواني وبعدين هتتنقل من صفحه سبلاش سكرين ل الصفحه الرئيسيةؤ
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {


                    Intent intent = new Intent(splashActivity.this, loginActivity.class);
                    startActivity(intent);
                    finish();


            }
        },4000);

    }

}