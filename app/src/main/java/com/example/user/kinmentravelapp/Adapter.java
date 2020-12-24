package com.example.user.kinmentravelapp;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by user on 2019/3/29.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private Context context;
    private JSONArray jsonArray;

    //適配器建構子
    public Adapter(Context context, JSONArray jsonArray) {
        this.context = context;
        this.jsonArray = jsonArray;
    }

    //設定"
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        try {
            final JSONObject object = jsonArray.getJSONObject(position);
            final String search = object.getString("search");
            holder.time.setText(object.getString("time"));
            holder.content.setText(object.getString("content"));
            holder.note.setText(object.getString("note"));

            if (!search.isEmpty()) {
                holder.itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent MapIntent = new Intent(Intent.ACTION_VIEW);
                        MapIntent.setPackage("com.google.android.apps.maps");
                        MapIntent.setData(Uri.parse("geo:24.437307,118.327764?q=" + search));
                        context.startActivity(MapIntent);
                    }
                });
            }
            else
                holder.itemView.setClickable(false);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override
    public int getItemCount() {
        return jsonArray.length();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private final TextView time;
        private final TextView content;
        private final TextView note;

        public ViewHolder(View view) {
            super(view);
            time = (TextView) view.findViewById(R.id.time);
            content = (TextView) view.findViewById(R.id.content);
            note = (TextView) view.findViewById(R.id.note);

        }
    }
}
