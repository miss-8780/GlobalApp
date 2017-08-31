package com.www.globalapp.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.www.globalapp.R;
import com.www.globalapp.adapter.MainLvAdapter;
import com.www.globalapp.entry.MainLvEntry;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity {
    private ListView lv;
    private List<MainLvEntry> datas;
    private MainLvAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void setTitleBar() {

    }

    @Override
    protected void judgeNetState() {

    }

    @Override
    protected void setListener() {
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        startActivity(new Intent(MainActivity.this, LyricActivity.class));
                        break;
                    case 1:
                        startActivity(new Intent(MainActivity.this, LyricActivity.class));
                        break;
                    default:
                        break;
                }
            }
        });
    }

    @Override
    protected void setData() {

    }

    @Override
    protected void initData() {
        datas = new ArrayList<>();
        datas.add(new MainLvEntry("歌词展示"));
        datas.add(new MainLvEntry("自定义view简单"));
        adapter = new MainLvAdapter(this, datas);
        lv.setAdapter(adapter);
    }

    @Override
    protected void initView() {
        lv = (ListView) findViewById(R.id.lv_mainac);
    }
}
