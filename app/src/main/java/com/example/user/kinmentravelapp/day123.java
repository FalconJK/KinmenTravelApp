package com.example.user.kinmentravelapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by user on 2019/3/28.
 */

@SuppressLint("ValidFragment")
public class day123 extends Fragment {

    private View view;
    private Context context;
    private JSONArray content;
    private RecyclerView recyclerView;
    private String tag;

    public day123(String tag) {
        this.tag = tag;
    }

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.daycontent, container, false);
        context = getContext();
        String day1 = DataApi.get(getContext());

        try {
            content = new JSONObject(day1).getJSONArray(tag);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        //連接元件
        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerview);
        //設定顯示版型(Linear)
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        //給定適配器
        recyclerView.setAdapter(new Adapter(context, content));


        return view;
    }

}
