package com.example.junli.shiyaner;


import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ashokvarma.bottomnavigation.BottomNavigationBar;
import com.ashokvarma.bottomnavigation.BottomNavigationItem;
import com.example.junli.shiyaner.dummy.DummyContent;
import com.example.junli.shiyaner.fragment.SettingFragment;
import com.example.junli.shiyaner.fragment.ShiYanFragment;
import com.example.junli.shiyaner.fragment.TeachingClassFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements
        TeachingClassFragment.OnListFragmentInteractionListener,
        ShiYanFragment.OnListFragmentInteractionListener,
        SettingFragment.OnFragmentInteractionListener {

    private BottomNavigationBar bottomNavigationBar;
    private BottomNavigationBar navigationBar;
    private TeachingClassFragment teachingClassFragment;
    private ShiYanFragment shiYanFragment;
    private SettingFragment sttingFragment;
    private List<Fragment> fragmentList;
    private FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        navigationBar = findViewById(R.id.navigationBar);
        bottomNavigationBar = navigationBar
                .addItem(new BottomNavigationItem(R.drawable.ic_school_black_24dp,"教学班"))
                .addItem(new BottomNavigationItem(R.drawable.ic_wb_incandescent_black_24dp,"实验"))
                .addItem(new BottomNavigationItem(R.drawable.ic_settings_applications_black_24dp,"设置"));
        navigationBar.setFirstSelectedPosition(0);
        navigationBar.initialise();

        bottomNavigationBar.setTabSelectedListener(new BottomNavigationBar.OnTabSelectedListener() {
            @Override
            public void onTabSelected(int position) {
               FragmentManager fragmentManager = this.get

            }

            @Override
            public void onTabUnselected(int position) {

            }

            @Override
            public void onTabReselected(int position) {

            }
        });

        setDefaultFragment();
    }

    //设置默认的
    private void setDefaultFragment(Fragment fragment){
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout,fragment);
        fragmentTransaction.commit();

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    @Override
    public void onListFragmentInteraction(DummyContent.DummyItem item) {

    }
}
