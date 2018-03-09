package com.tlfmj.mjjwone;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.tlfmj.mjjwone.navigator.FragmentNavigator;
import com.tlfmj.mjjwone.navigator.HomeNavigatorFragmentAdapter;
import com.tlfmj.mjjwone.navigator.HomeNavigatorView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements HomeNavigatorView.OnBottomNavigatorViewItemClickListener {

    public static final String TAG = MainActivity.class.getSimpleName();


    @BindView(R.id.bottomNavigatorView)
    HomeNavigatorView bottomNavigatorView;
    private FragmentNavigator mNavigator;
    @BindView(R.id.title)
     TextView title;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mNavigator = new FragmentNavigator(this.getSupportFragmentManager(), new HomeNavigatorFragmentAdapter(), R.id.container);
        mNavigator.setDefaultPosition(0);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        initActionBar();
        ButterKnife.bind(this);
        init();
//        actionBarView.setActionbarBackDimiss(true);
    }


    void init() {
        if (bottomNavigatorView != null) {
            bottomNavigatorView.setOnBottomNavigatorViewItemClickListener(this);
        }
        setCurrentTab(0);
        title.setText(R.string.navigator_title_one);
    }


    @Override
    public void onBottomNavigatorViewItemClick(int position, View view) {
        setCurrentTab(position);
    }


    public void setCurrentTab(int position) {
        if (position == 0) {
            title.setText(R.string.navigator_title_one);
        } else if (position == 1) {
            title.setText(R.string.navigator_two);
        } else if (position == 2) {
            title.setText(R.string.navigator_three);
        } else if (position == 3) {
            title.setText(R.string.navigator_four);
        }
        bottomNavigatorView.select(position);
        mNavigator.showFragment(position);
    }

}
