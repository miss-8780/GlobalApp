package com.www.globalapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.www.globalapp.R;
import com.www.globalapp.entry.MainLvEntry;
import java.util.List;

/**
 * Created by ${yaotengfei} on 2017/8/23 14:12.
 * Describe：首页适配器
 */

public class MainLvAdapter extends BaseAdapter {
    private List<MainLvEntry> datas;
    private Context context;
    private LayoutInflater inflater;

    public MainLvAdapter(Context context, List<MainLvEntry> datas) {
        this.context = context;
        this.datas = datas;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return datas != null ? datas.size() : 0;
    }


    @Override
    public Object getItem(int position) {
        return datas.get(position);
    }


    @Override
    public long getItemId(int position) {
        return position;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        MainLvViewHolder holder = null;
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.layout_item_mainlv, parent, false);
            holder = new MainLvViewHolder(convertView);
            convertView.getTag();
        } else {
            holder = (MainLvViewHolder) convertView.getTag();
        }
        holder.tv.setText(datas.get(position).getName());
        return convertView;
    }

    public class MainLvViewHolder {
        private TextView tv;

        public MainLvViewHolder(View view) {
            tv = (TextView) view.findViewById(R.id.tv_item_mainlv);
        }
    }
}
