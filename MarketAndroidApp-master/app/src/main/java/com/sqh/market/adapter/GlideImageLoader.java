package com.sqh.market.adapter;


import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.sqh.market.R;
import com.sqh.market.constant.Constants;
import com.youth.banner.loader.ImageLoader;

import java.util.Random;

/**
 * GridView图片加载器
 *
 * 
 */
public class GlideImageLoader extends ImageLoader {
    @Override
    public void displayImage(Context context, Object path, ImageView imageView) {
        Glide.with(context).load(path).into(imageView);
    }
}
