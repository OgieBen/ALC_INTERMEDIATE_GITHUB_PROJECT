package com.iconuim.alc_intermediate_github_project;

import android.app.ActionBar;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private static  RecyclerView devsRecyclerView;
    private static RecyclerView.Adapter devsRecyclerViewAdapter;
    private static RecyclerView.LayoutManager devsRecyclerViewLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActionBar bar = getActionBar();
        if(bar != null)
            bar.setBackgroundDrawable(
                    new ColorDrawable(Color.parseColor("#00ff00"))
            );
        setContentView(R.layout.activity_main);

        devsRecyclerView = (RecyclerView) findViewById(R.id.devs_recycler_view);
        devsRecyclerViewLayoutManager = new LinearLayoutManager(MainActivity.this);
        devsRecyclerView.setLayoutManager(devsRecyclerViewLayoutManager);


      //  devsRecyclerViewAdapter = new DevsRecyclerViewAdapter(data);
     //   devsRecyclerView.setAdapter(devsRecyclerViewAdapter);





    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
