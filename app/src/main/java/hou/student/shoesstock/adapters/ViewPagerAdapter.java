package hou.student.shoesstock.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import hou.student.shoesstock.fragments.FavoriteFragment;
import hou.student.shoesstock.fragments.HomeFragment;
import hou.student.shoesstock.fragments.SearchFragment;
import hou.student.shoesstock.fragments.UserFragment;

public class ViewPagerAdapter extends FragmentStateAdapter {

    public ViewPagerAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new HomeFragment();
            case 1:
                return new SearchFragment();
            case 3:
                return new UserFragment();
        }
        return new HomeFragment();
    }

    // fix 1
    @Override
    public int getItemCount() {
        return 1;
    }
}
