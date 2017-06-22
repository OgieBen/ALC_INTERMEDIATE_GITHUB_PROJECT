package com.iconuim.alc_intermediate_github_project;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ogie on 6/22/2017.
 */
public class DevsRecyclerViewAdapter extends RecyclerView.Adapter<DevsRecyclerViewAdapter.DevViewHolder> {

    private static ArrayList<String> userNames;
    //holds urls of the users
    private static List<GitDev> devs;
    private static Context context;

    public DevsRecyclerViewAdapter(Context _context, List<GitDev> _devs) {

        devs = _devs;
        context = _context;

    }

    @Override
    public DevViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        View devsView = (View) LayoutInflater.from(parent.getContext()).inflate(R.layout.devs_card, parent, false);
        DevViewHolder devViewHolder = new DevViewHolder(devsView);

        return devViewHolder;
    }

    @Override
    public void onBindViewHolder(DevsRecyclerViewAdapter.DevViewHolder holder, int position) {


        holder.devsUserName.setText(devs.get(position).getLogin());

        Picasso.with(context)
                .load(devs.get(position).getAvatar_url())
                .fit()
                .placeholder(R.drawable.placeholder)
                .error(R.drawable.placeholder)
                .into(holder.devsAvatar);

        Log.e("+++++", "Url " + devs.get(position).getAvatar_url());
    }

    @Override
    public int getItemCount() {
        return userNames == null ? 0 : userNames.size();
    }

    public class DevViewHolder extends RecyclerView.ViewHolder {
        ImageView devsAvatar;
        TextView devsUserName;

        public DevViewHolder(View devsView) {
            super(devsView);
            devsAvatar = (ImageView) devsView.findViewById(R.id.devsAvater);
            devsUserName = (TextView) devsView.findViewById(R.id.devsUserName);


        }
    }


}
