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

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        SearchView search = findViewById(R.id.Timkiem);
        home();
        search.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                Intent intent = new Intent(HomeActivity.this, ketquasearch.class);
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
    public void taskbar() {

    }
    private void home() {

        ImageButton btnBoloc = findViewById(R.id.btnBoloc);
        ImageButton btnGiohang = findViewById(R.id.btnGiohang);
        Button btnGoiy = findViewById(R.id.btnGoiy);
        Button btnNike = findViewById(R.id.btnNike);
        View chitiet_sp = findViewById(R.id.chitiet_sp);
        View txtXemNew = findViewById(R.id.txtXemNew);


        //Bộ lọc
        btnBoloc.setOnClickListener(v -> {
            Intent boloc = new Intent(HomeActivity.this, boloc.class);
            startActivity(boloc);
        });

        //Giỏ hàng
        btnGiohang.setOnClickListener(v -> {
            Intent giohang = new Intent(HomeActivity.this, Addtocard.class);
            startActivity(giohang);
        });

        //Các loại giày
        btnGoiy.setOnClickListener(v -> {
            Intent goiy = new Intent(HomeActivity.this, tips.class);
            startActivity(goiy);
        });
        btnNike.setOnClickListener(v -> {
            Intent nike = new Intent(HomeActivity.this, nike.class);
            startActivity(nike); //
        });

        //chi tiết sản phẩm
        chitiet_sp.setOnClickListener(v -> {
            Intent chitiet = new Intent(HomeActivity.this, Chitietsanpham.class);
            startActivity(chitiet);
        });

        //Xem thêm
        txtXemNew.setOnClickListener(v -> {
            Intent spmoi = new Intent(HomeActivity.this, spmoi.class);
            startActivity(spmoi);
        });
    }
}
