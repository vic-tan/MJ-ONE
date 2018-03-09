package com.tlfmj.mjjwone.navigator;

import android.content.Context;
import android.util.AttributeSet;

import com.tlfmj.mjjwone.R;


/**
 * 首页底部tabs
 * Created by aspsine on 16/3/31.
 */
public class HomeNavigatorView extends BaseNavigatorView {

    private int[] respre = new int[]{R.mipmap.main_home_tab_task_pressed, R.mipmap.main_home_tab_diet_pressed,R.mipmap.main_home_tab_schedule_pressed,R.mipmap.main_home_tab_trainees_pressed,R.mipmap.main_home_tab_nav_own_pressed};
    private int[] resnormal = new int[]{R.mipmap.main_home_tab_task_normal, R.mipmap.main_home_tab_diet_normal, R.mipmap.main_home_tab_schedule_normal, R.mipmap.main_home_tab_trainees_normal, R.mipmap.main_home_tab_nav_own_normal};

    public HomeNavigatorView(Context context) {
        this(context, null);
    }

    public HomeNavigatorView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public HomeNavigatorView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public int navigatorViewLayoutResId() {
        return R.layout.main_activity_home_bottom_navigator;
    }

    @Override
    public int[] respreImageArray() {
        return respre;
    }

    @Override
    public int[] resnormalImageArray() {
        return resnormal;
    }
}
