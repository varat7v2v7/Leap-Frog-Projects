package com.lf.sample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {


    ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        bindData();
    }


    private void initViews() {
        mListView = (ListView) findViewById(R.id.list);
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            Intent mIntent = null;

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        break;
                    case 1:
                        break;
                    case 2:
                        mIntent = new Intent(MainActivity.this, CustomListviewActivity.class);
                        startActivity(mIntent);
                        break;
                    case 3:
                        mIntent = new Intent(MainActivity.this, StyleExample.class);
                        startActivity(mIntent);
                        break;
                    case 4:
                        mIntent = new Intent(MainActivity.this, LoginPage.class);
                        startActivity(mIntent);
                        break;
                    case 5:
                        mIntent = new Intent(MainActivity.this, CustomFontExample.class);
                        startActivity(mIntent);
                        break;
                }
            }
        });
    }
    private void bindData() {
        ArrayAdapter<String> mAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.tutorial_listing));
        mListView.setAdapter(mAdapter);
    }
}
