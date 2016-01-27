package com.lf.sample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.lf.sample.adapter.CustomListViewAdapter;
import com.lf.sample.model.UserInfo;

import java.util.ArrayList;
import java.util.List;

public class CustomListviewActivity extends AppCompatActivity {

    ListView mListView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_listview);
        initViews();
    }

    private void initViews() {
        mListView = (ListView) findViewById(R.id.list);
        CustomListViewAdapter mCustomListViewAdapter = new CustomListViewAdapter(this, R.layout.list_item, getUserInfos());
        mListView.setAdapter(mCustomListViewAdapter);

    }


    private ArrayList<UserInfo> getUserInfos() {
        ArrayList<UserInfo> mUserInfos = new ArrayList<>();
        mUserInfos.add(new UserInfo("Krishna", "Android Developer","http://www.pablopicasso.org/boy-leading-a-horse.jsp#prettyPhoto[image1]/0/"));
        mUserInfos.add(new UserInfo("Krishna", "Android Developer", "http://www.pablopicasso.org/boy-leading-a-horse.jsp#prettyPhoto[image1]/0/"));
        mUserInfos.add(new UserInfo("Krishna", "Android Developer","http://www.pablopicasso.org/boy-leading-a-horse.jsp#prettyPhoto[image1]/0/"));
        mUserInfos.add(new UserInfo("Krishna", "Android Developer", "http://www.pablopicasso.org/boy-leading-a-horse.jsp#prettyPhoto[image1]/0/"));
        return mUserInfos;

    }
}
