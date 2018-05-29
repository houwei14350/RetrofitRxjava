package com.minihou.retrofitrxjava;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.minihou.retrofitrxjava.activity.DifferentiateDomainActivity;
import com.minihou.retrofitrxjava.activity.LoginActivity;
import com.minihou.retrofitrxjava.activity.StartFinishActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView list_view;

    private ArrayList<String> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        list.add("区分域名及返回结构");
        list.add("区分不同的requestCode");
        list.add("模拟首页登陆相关");

        list_view = findViewById(R.id.list_view);
        list_view.setAdapter(new BaseAdapter() {
            @Override
            public int getCount() {
                return list.size();
            }

            @Override
            public String getItem(int position) {
                return list.get(position);
            }

            @Override
            public long getItemId(int position) {
                return position;
            }

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                ViewHolder viewHolder;
                if (convertView == null) {
                    viewHolder = new ViewHolder();
                    convertView = LayoutInflater.from(MainActivity.this).inflate(R.layout.item_list, null);
                    viewHolder.button = convertView.findViewById(R.id.button);
                    convertView.setTag(viewHolder);
                } else {
                    viewHolder = (ViewHolder) convertView.getTag();
                }
                viewHolder.button.setText(getItem(position));
                return convertView;
            }
        });


        list_view.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        startActivity(new Intent(MainActivity.this, DifferentiateDomainActivity.class));
                        break;
                    case 1:
                        startActivity(new Intent(MainActivity.this, StartFinishActivity.class));
                        break;
                    case 2:
                        startActivity(new Intent(MainActivity.this, LoginActivity.class));
                        break;
                }
            }
        });


    }


    private static class ViewHolder {
        TextView button;
    }
}
