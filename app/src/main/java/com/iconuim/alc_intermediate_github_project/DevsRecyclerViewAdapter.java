package com.iconuim.alc_intermediate_github_project;

import android.graphics.Bitmap;
import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ogie on 6/22/2017.
 */
public class DevsRecyclerViewAdapter extends RecyclerView.Adapter<DevsRecyclerViewAdapter.ViewHolder> {

    private static ArrayList<String> userNames;
    //holds urls of the users
    private static ArrayList<String> images;

    public DevsRecyclerViewAdapter(ArrayList<String> _images, ArrayList<String> _userNames) {

                userNames = _userNames;
                images = _images;

    }

    @Override
    public DevsRecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        View devsView = (View) LayoutInflater.from(parent.getContext()).inflate(R.layout.devs_card,parent,false);
        ImageView devsAvatar = (ImageView) devsView.findViewById(R.id.devsAvater);
        TextView devsUserName = (TextView) devsView.findViewById(R.id.devsUserName);

        ViewHolder viewHolder = new ViewHolder(devsAvatar,devsUserName);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(DevsRecyclerViewAdapter.ViewHolder holder, int position) {

        //  using picasso library to display devs image
        //holder.imageView


        holder.textView.setText(userNames.get(position));

    }

    @Override
    public int getItemCount() {
        return userNames == null ? 0 : userNames.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView imageView ;
        private TextView textView;
        public ViewHolder(ImageView _imageView,TextView _textView) {
            super(_textView);
            imageView = _imageView;
            textView = _textView;

        }
    }
}
