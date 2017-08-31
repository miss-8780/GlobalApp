package com.www.globalapp.activity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.LayoutRes;
import android.support.v7.app.AppCompatActivity;


/**
 * Created by yaotengfei on 2016/9/19.
 */
public abstract class BaseActivity extends AppCompatActivity {
    @Override
    public void setContentView(@LayoutRes int layoutResID) {
        super.setContentView(layoutResID);
        setTitleBar();
        judgeNetState();
        initView();
        initData();
        setData();
        setListener();
    }

    //设置标题栏
    protected abstract void setTitleBar();

    protected abstract void judgeNetState();

    //设置监听事件
    protected abstract void setListener();

    //设置数据
    protected abstract void setData();

    //初始化数据
    protected abstract void initData();

    //初始化控件
    protected abstract void initView();

}
