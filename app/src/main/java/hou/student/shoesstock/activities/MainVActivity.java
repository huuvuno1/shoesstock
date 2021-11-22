package hou.student.shoesstock.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import hou.student.shoesstock.R;
import hou.student.shoesstock.adapters.ViewPagerAdapter;

public class MainVActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    ViewPager2 viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_v);
        getView();
        setListener();
        setUpFragment();
    }

    private void setUpFragment() {
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(), getLifecycle());
        viewPager.setAdapter(viewPagerAdapter);
        viewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                //selectFragment(position);
            }
        });
    }

    private void getView() {
        bottomNavigationView = findViewById(R.id.bottom_nav);
        viewPager = findViewById(R.id.viewPager);
    }

    private void setListener() {
        bottomNavigationView.setOnNavigationItemSelectedListener(item -> {
//            System.out.println("click" + item.getItemId());
//            switch (item.getItemId()) {
//                case R.id.action_home:
//                    break;
//                case R.id.action_favorite:
//                    selectFragment(1);
//                    break;
//                case R.id.action_tag:
//                    break;
//                case R.id.action_user:
//                    break;
//            }
            return true;
        });
    }

    private void selectFragment(int position) {
        switch (position) {
            case 0:
                bottomNavigationView.getMenu().findItem(R.id.action_home).setChecked(true);
                break;
            case 1:
                bottomNavigationView.getMenu().findItem(R.id.action_favorite).setChecked(true);
                break;
            case 2:
                bottomNavigationView.getMenu().findItem(R.id.action_tag).setChecked(true);
                break;
            case 3:
                bottomNavigationView.getMenu().findItem(R.id.action_user).setChecked(true);
                break;
        }
    }

}
