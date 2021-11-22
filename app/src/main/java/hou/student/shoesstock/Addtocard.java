package hou.student.shoesstock;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class Addtocard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addtocard);
        ImageButton imgback = findViewById(R.id.imageButton);
        imgback.setOnClickListener(v ->{
            Intent intent = new Intent(Addtocard.this,HomeActivity.class);
            startActivity(intent);
        } );
    }
}