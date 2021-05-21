package com.example.letrungthuc_ktra2_bai1;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class FragmentBottomAdapter extends FragmentPagerAdapter {
    public int numberPage=3;

    public FragmentBottomAdapter(@NonNull  FragmentManager fm,int behavior) {
        super(fm,behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return  new Fragment1();
            case 1:
                return  new Fragment2();
            case 2:
                return  new Fragment3();
        }
        return null;
    }

    @Override
    public int getCount() {
        return numberPage;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "Samsung";
            case 1:
                return "Iphone";
            case 2:
                return "Oppo";
        }
        return null;
    }
}
