package hou.student.shoesstock;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class boloc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boloc);
        findViewById(R.id.textView).setOnClickListener(v -> finish());
        findViewById(R.id.imageButton).setOnClickListener(v -> finish());
    }
}