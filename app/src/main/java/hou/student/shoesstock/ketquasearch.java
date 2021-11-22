package hou.student.shoesstock;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ketquasearch extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ketquasearch);
        kqsearch();


    }

    private void kqsearch() {
        ImageButton back = findViewById(R.id.back);

        back.setOnClickListener(v -> {
            Intent signup = new Intent(ketquasearch.this, HomeActivity.class);
            startActivity(signup);
        });
        TextView ketqua_layout = findViewById(R.id.textView21);
        ketqua_layout.setOnClickListener(v -> {
            Intent show = new Intent(ketquasearch.this, Chitietsanpham.class);
            startActivity(show);

        });

    }
}

