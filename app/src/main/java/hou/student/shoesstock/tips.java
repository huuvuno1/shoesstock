package hou.student.shoesstock;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.SearchView;

public class tips extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);
        tips();
        SearchView search = findViewById(R.id.searchView2);
        search.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                Intent intent = new Intent(tips.this, ketquasearch.class);
                startActivity(intent);
                return false;
            }
            @Override
            public boolean onQueryTextChange(String s) {
                return true;
                //bắt buộc phải để vì onQuerytextListencer phải yêu cầu có xóa báo lỗi
            }

        });
    }
    private void tips() {
        View goiy1 = findViewById(R.id.textView21);
        goiy1.setOnClickListener(v -> {
            Intent ctgoiy = new Intent(tips.this,chitietgoiy1.class);
            startActivity(ctgoiy);
        });
        Button btnNike = findViewById(R.id.button6);
        btnNike.setOnClickListener(v -> {
            Intent nike = new Intent(tips.this,nike.class);
            startActivity(nike); //
        });
//        ImageButton home = findViewById(R.id.imageButton5);
//        home.setOnClickListener(v -> {
//            Intent imghome = new Intent(tips.this, HomeActivity.class);
//            startActivity(imghome);
//        });
    }
}