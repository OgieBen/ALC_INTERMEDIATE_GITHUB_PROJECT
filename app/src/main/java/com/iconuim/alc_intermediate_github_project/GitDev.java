package com.iconuim.alc_intermediate_github_project;

import android.graphics.Bitmap;

/**
 * Created by ogie on 6/11/2017.
 */
public class GitDev {

    private static String tempName;
    private static String tempUrl;
    private static Bitmap tempImage;

    public GitDev(String name,Bitmap image, String url ) {

        tempImage = image;
        tempName = name;
        tempUrl = url;
    }




    public static String getTempName() {
        return tempName;
    }

    public static String getTempUrl() {
        return tempUrl;
    }

    public static Bitmap getTempImage() {
        return tempImage;
    }

    public static void setTempName(String tempName) {
        GitDev.tempName = tempName;
    }

    public static void setTempUrl(String tempUrl) {
        GitDev.tempUrl = tempUrl;
    }

    public static void setTempImage(Bitmap tempImage) {
        GitDev.tempImage = tempImage;
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
