package com.iconuim.alc_intermediate_github_project;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ogie on 6/22/2017.
 */
public class Devs {


     String total_counts;
     String incomplete_results;

     @SerializedName("items")
     @Expose
     ArrayList<GitDev> items ;

    public String getTotal_counts() {
        return total_counts;
    }

    public void setTotal_counts(String total_counts) {
        this.total_counts = total_counts;
    }

    public String getIncomplete_results() {
        return incomplete_results;
    }

    public void setIncomplete_results(String incomplete_results) {
        this.incomplete_results = incomplete_results;
    }

    public  List<GitDev> getItems() {
        return items;
    }

    public void setItems(ArrayList<GitDev> items) {
        this.items = items;
    }
}
