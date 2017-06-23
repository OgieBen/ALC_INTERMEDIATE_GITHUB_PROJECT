package com.iconuim.alc_intermediate_github_project;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ogie on 6/23/2017.
 */
public class DevsListViewAdapter extends ArrayAdapter<GitDev> {

    private static ArrayList<GitDev> devsData;
    private static int res;
    private static Context context;
    public DevsListViewAdapter(Context _context,int resource, ArrayList<GitDev> _data ) {
        super(_context, resource,_data);
        res = resource;
        devsData = _data;
        context = _context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view;
        final GitDev dev = getItem(position);

        //inflate new view if view is null
        if(convertView == null) {
             view = (View) LayoutInflater.from(parent.getContext())
                    .inflate(res, parent, false);
        }else{
            view = (LinearLayout) convertView;
        }

             //update textvoew with developer's user name
                ((TextView) view.findViewById(R.id.devsUserName))
                    .setText(devsData.get(position).getLogin());
        ImageView imageView = ((ImageView)view.findViewById(R.id.devsAvater));

        //update imageview with image from server
       Picasso.with(context)
                .load(devsData.get(position).getAvatar_url())
                .fit()
                .placeholder(R.drawable.placeholder)
                .error(R.drawable.placeholder)
                .into(imageView);


        //show details of developer if imageview is clicked
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context,DevDetails.class);
                intent.putExtra("dev",dev);
               context.startActivity(intent);



            }
        });



        return view;
    }
}
