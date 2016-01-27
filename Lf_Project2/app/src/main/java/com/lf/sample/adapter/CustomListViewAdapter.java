package com.lf.sample.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.lf.sample.R;
import com.lf.sample.model.UserInfo;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by krishna on 1/18/16.
 */
public class CustomListViewAdapter extends ArrayAdapter<UserInfo> {

    Context mContext;
    ArrayList<UserInfo> list;
    LayoutInflater mLayoutInflater;
    int resource;

    public CustomListViewAdapter(Context context, int resource, ArrayList<UserInfo> list) {
        super(context, resource, list);
        this.list = list;
        this.resource = resource;
        this.mContext = context;
        mLayoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        UserInfo mUserInfo = getItem(position);
        ViewHolder mViewHolder;

        if (convertView == null) {
           convertView= mLayoutInflater.inflate(resource, parent, false);
            mViewHolder = new ViewHolder(convertView);
            convertView.setTag(mViewHolder);

        } else {
            mViewHolder = (ViewHolder) convertView.getTag();
        }

        //mViewHolder.imageView.setImageResource(mUserInfo.getProfileUrl());
        Picasso.with(mContext).load(mUserInfo.getProfileUrl()).into(mViewHolder.imageView);
        mViewHolder.txtTitle.setText(mUserInfo.getJobTtile());
        mViewHolder.txtName.setText(mUserInfo.getName());

        return convertView;
    }


    private static class ViewHolder {
        public TextView txtName;
        public TextView txtTitle;
        public ImageView imageView;

        public ViewHolder(View view) {
            txtName = (TextView) view.findViewById(R.id.txtName);
            txtTitle = (TextView) view.findViewById(R.id.txtTitle);
            imageView = (ImageView) view.findViewById(R.id.profileImage);
        }
    }
}
