package hou.student.shoesstock;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        main();
    }

    private void main() {
        Button dangky = findViewById(R.id.dangky);
        Button dangnhap = findViewById(R.id.dangnhap);
        dangky.setOnClickListener(v -> {
            Intent signup = new Intent(MainActivity.this, SignupActivity.class);
            startActivity(signup);
        });
        dangnhap.setOnClickListener(v -> {
            Intent login = new Intent(MainActivity.this, LoginActivity.class);
            startActivity(login);
        });
    }
}