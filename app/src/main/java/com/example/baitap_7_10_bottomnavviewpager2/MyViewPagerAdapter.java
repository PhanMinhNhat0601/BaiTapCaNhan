package com.example.baitap_7_10_bottomnavviewpager2;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.baitap_7_10_bottomnavviewpager2.fragment.HomeFragment;
import com.example.baitap_7_10_bottomnavviewpager2.fragment.ListFragment;
import com.example.baitap_7_10_bottomnavviewpager2.fragment.PersonFragment;
import com.example.baitap_7_10_bottomnavviewpager2.fragment.SettingsFragment;

public class MyViewPagerAdapter extends FragmentStateAdapter {

    public MyViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new HomeFragment();
            case 1:
                return new ListFragment();
            case 2:
                return new PersonFragment();
            case 3:
                return new SettingsFragment();
            default:
                return new HomeFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
