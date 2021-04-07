package com.example.xtes.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.example.xtes.R;

public class ViewPagerAdapter extends PagerAdapter {
    //定义
    private Context context;
    private LayoutInflater layoutInflater;
    private int[] datas;
    //构造函数 在main函数中将数据传进来  datas是图片数组
    public ViewPagerAdapter(Context context, int[] datas) {
        this.context = context;
        this.datas = datas;
        layoutInflater =  LayoutInflater.from(context);
    }
    //知道有多少图片
    @Override
    public int getCount() { return datas.length; }
    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {return view == o;}
    //item_iv是在activity_main中的一个组件，iv记录这个组件，如果在iv上用setimageresource函数设置图片，然后将view添加到container才能在页面显示出来
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View layout = layoutInflater.inflate(R.layout.viewpager_item,null);
        ImageView iv = layout.findViewById(R.id.item_iv);
        //设置显示的图片
        iv.setImageResource(datas[position]);
        container.addView(layout);
        return layout;
    }
    //让container移除view
    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }
}
