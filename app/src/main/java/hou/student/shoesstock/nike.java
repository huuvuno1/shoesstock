package hou.student.shoesstock;
import android.content.Intent;
import android.view.View;
import android.view.KeyEvent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class nike extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nike);
        showsp();

        SearchView search = findViewById(R.id.searchView2);
        search.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                Intent intent = new Intent(nike.this, ketquasearch.class);
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
    private void showsp() {
        TextView nike_sp = (TextView) findViewById(R.id.textView5);
        nike_sp.setOnClickListener(v -> {
            Intent show = new Intent(nike.this, Chitietsanpham.class);
            startActivity(show);
        });
        Button nike_button = findViewById(R.id.nike_button);
        nike_button.setOnClickListener(v -> {
            Intent show = new Intent(nike.this, tips.class);
            startActivity(show);
        });
//        ImageButton home = findViewById(R.id.imageButton5);
//        home.setOnClickListener(v -> {
//            Intent imghome = new Intent(nike.this, HomeActivity.class);
//            startActivity(imghome);
//        });
    }



}
