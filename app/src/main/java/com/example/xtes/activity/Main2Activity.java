package com.example.xtes.activity;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.xtes.R;
import com.example.xtes.Fragment.Fragment1;
import com.example.xtes.Fragment.Fragment2;
import com.example.xtes.Fragment.Fragment3;
import com.example.xtes.Fragment.Fragment4;

import java.sql.SQLException;

public class Main2Activity extends FragmentActivity implements View.OnClickListener {
    // 初始化顶部栏显示
    private ImageView titleLeftImv;
    private TextView titleTv;
    private  String tpyename1="";
    // 定义4个Fragment对象
    private Fragment1 fg1;
    private Fragment2 fg2;
    private Fragment3 fg3;
    private Fragment4 fg4;
    // 帧布局对象，用来存放Fragment对象
    private FrameLayout frameLayout;
    // 定义每个选项中的相关控件
    private RelativeLayout firstLayout;
    private RelativeLayout secondLayout;
    private RelativeLayout thirdLayout;
    private RelativeLayout fourthLayout;
    private ImageView firstImage;
    private ImageView secondImage;
    private ImageView thirdImage;
    private ImageView fourthImage;
    private TextView firstText;
    private TextView secondText;
    private TextView thirdText;
    private TextView fourthText;
    // 定义几个颜色
    private int whirt = 0xFFFFFFFF;
    private int gray = 0xFF7597B3;
    private int dark = 0xff000000;

    // 定义FragmentManager对象管理器
    private FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_under);
        fragmentManager = getSupportFragmentManager();

        initView(); // 初始化界面控件
        setChioceItem(0); // 初始化页面加载时显示第一个选项卡

    }
    /**
     * 初始化页面
     */
    private void initView() {
// 初始化页面标题栏
        titleLeftImv = (ImageView) findViewById(R.id.title_imv);
        titleLeftImv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main2Activity.this, MainActivity.class));
            }
        });
        titleTv = (TextView) findViewById(R.id.title_text_tv);
        titleTv.setText("校 淘 贰 货");
// 初始化底部导航栏的控件
        firstImage = (ImageView) findViewById(R.id.first_image);
        secondImage = (ImageView) findViewById(R.id.second_image);
        thirdImage = (ImageView) findViewById(R.id.third_image);
        fourthImage = (ImageView) findViewById(R.id.fourth_image);
        firstText = (TextView) findViewById(R.id.first_text);
        secondText = (TextView) findViewById(R.id.second_text);
        thirdText = (TextView) findViewById(R.id.third_text);
        fourthText = (TextView) findViewById(R.id.fourth_text);
        firstLayout = (RelativeLayout) findViewById(R.id.first_layout);
        secondLayout = (RelativeLayout) findViewById(R.id.second_layout);
        thirdLayout = (RelativeLayout) findViewById(R.id.third_layout);
        fourthLayout = (RelativeLayout) findViewById(R.id.fourth_layout);
        firstLayout.setOnClickListener(Main2Activity.this);
        secondLayout.setOnClickListener(Main2Activity.this);
        thirdLayout.setOnClickListener(Main2Activity.this);
        fourthLayout.setOnClickListener(Main2Activity.this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.first_layout:
                setChioceItem(0);
                break;
            case R.id.second_layout:
                setChioceItem(1);
                break;
            case R.id.third_layout:
                setChioceItem(2);
                break;
            case R.id.fourth_layout:
                setChioceItem(3);
                break;
            default:
                break;
        }
    }
    /**
     * 设置点击选项卡的事件处理
     *
     * @param index 选项卡的标号：0, 1, 2, 3
     */
    private void setChioceItem(int index) {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        clearChioce(); // 清空, 重置选项, 隐藏所有Fragment
        try {
            hideFragments(fragmentTransaction);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        switch (index) {
            case 0:
// firstImage.setImageResource(R.drawable.XXXX); 需要的话自行修改
                firstText.setTextColor(dark);
                firstLayout.setBackgroundColor(gray);
// 如果fg1为空，则创建一个并添加到界面上
                if (fg1 == null) {
                    fg1 = new Fragment1();
                    fragmentTransaction.add(R.id.content, fg1);
                } else {
// 如果不为空，则直接将它显示出来
                    fragmentTransaction.show(fg1);
                }
                break;
            case 1:
// secondImage.setImageResource(R.drawable.XXXX);
                secondText.setTextColor(dark);
                secondLayout.setBackgroundColor(gray);
                if (fg2 == null) {
                    fg2 = new Fragment2();
                    fragmentTransaction.add(R.id.content, fg2);
                } else {
                    fg2 = new Fragment2();
                    fragmentTransaction.add(R.id.content, fg2);
                }
                break;
            case 2:
// thirdImage.setImageResource(R.drawable.XXXX);
                thirdText.setTextColor(dark);
                thirdLayout.setBackgroundColor(gray);
                if (fg3 == null) {
                    fg3 = new Fragment3();
                    fragmentTransaction.add(R.id.content, fg3);
                } else {
                    fg3 = new Fragment3();
                    fragmentTransaction.add(R.id.content, fg3);
                }
                break;
            case 3:
// fourthImage.setImageResource(R.drawable.XXXX);
                fourthText.setTextColor(dark);
                fourthLayout.setBackgroundColor(gray);
                if (fg4 == null) {
                    fg4 = new Fragment4();
                    fragmentTransaction.add(R.id.content, fg4);
                } else {
                    fragmentTransaction.show(fg4);
                }
                break;
        }
        fragmentTransaction.commit(); // 提交
    }
    /**
     * 当选中其中一个选项卡时，其他选项卡重置为默认
     */
    private void clearChioce() {
// firstImage.setImageResource(R.drawable.XXX);
        firstText.setTextColor(gray);
        firstLayout.setBackgroundColor(whirt);
// secondImage.setImageResource(R.drawable.XXX);
        secondText.setTextColor(gray);
        secondLayout.setBackgroundColor(whirt);
// thirdImage.setImageResource(R.drawable.XXX);
        thirdText.setTextColor(gray);
        thirdLayout.setBackgroundColor(whirt);
// fourthImage.setImageResource(R.drawable.XXX);
        fourthText.setTextColor(gray);
        fourthLayout.setBackgroundColor(whirt);
    }
    /**
     * 隐藏Fragment
     *
     * @param fragmentTransaction
     */
    private void hideFragments(FragmentTransaction fragmentTransaction) throws SQLException {
        if (fg1 != null) {
            fragmentTransaction.hide(fg1);
        }
        if (fg2 != null) {
            fragmentTransaction.hide(fg2);
        }
        if (fg3 != null) {
            fragmentTransaction.hide(fg3);
        }
        if (fg4 != null) {
            fragmentTransaction.hide(fg4);
        }
    }
}
