package com.bfcai.meals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class AddWasafaty extends AppCompatActivity {

    // عرفنا الحاجه لي هنحتاجها من صفحه الديزاين
    EditText title_input, author_input;
    Button add_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_wasafaty);

        // ربطنا الحاجه بصفحة الديزاين
        title_input = findViewById(R.id.title_input);
        author_input = findViewById(R.id.author_input);
        add_button = findViewById(R.id.add_button);

        // قولناله لما يدوس علي الزرار
        // يعمل انشاء وصفة جديده في الداتابيز
        add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyDatabaseHelper myDB = new MyDatabaseHelper(AddWasafaty.this);
                myDB.addWasfa(title_input.getText().toString().trim(),
                        author_input.getText().toString().trim()
                        );
                startActivity(new Intent(getBaseContext(),WasafatyActivity.class));
            }
        });
    }
}