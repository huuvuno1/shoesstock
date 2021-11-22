package hou.student.shoesstock;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class spkhuyenmai extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sanphamkhuyenmai);

        findViewById(R.id.imageButton).setOnClickListener(v -> finish());
    }
}