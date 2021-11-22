package hou.student.shoesstock;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;

public class chitietgoiy1 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chitietgoiy1);
        ImageButton back = findViewById(R.id.imageButton);
        back.setOnClickListener(v -> {
            Intent intent = new Intent(chitietgoiy1.this, tips.class);
            startActivity(intent);
        });
    }
}
