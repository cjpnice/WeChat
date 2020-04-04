package com.cjpnice.wechat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView wechat;
    private ImageView list;
    private ImageView find;
    private ImageView me;
    private WeChatFragment weChatFragment;
    private ListFragment listFragment;
    private FindFragment findFragment;
    private MeFragment meFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        init();
    }

    private void init() {
        wechat = findViewById(R.id.wechat);
        list = findViewById(R.id.list);
        find = findViewById(R.id.find);
        me = findViewById(R.id.me);
        wechat.setOnClickListener(this);
        list.setOnClickListener(this);
        find.setOnClickListener(this);
        me.setOnClickListener(this);
        hideAllFrag();
        if(weChatFragment==null){
            weChatFragment = new WeChatFragment();
        }
        addFrag(weChatFragment);
        wechat.setImageResource(R.drawable.wechat_active);
    }

    private void addFrag(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        if(fragment!=null&&!fragment.isAdded()){
            transaction.add(R.id.content_layout,fragment);
        }
        transaction.commit();
        getSupportFragmentManager().beginTransaction().show(fragment).commit();
    }

    private void hideFrag(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        if(fragment!=null&&fragment.isAdded()){
            transaction.hide(fragment);

        }
        transaction.commit();
    }

    private void hideAllFrag() {
        hideFrag(weChatFragment);
        hideFrag(listFragment);
        hideFrag(meFragment);
        hideFrag(findFragment);
    }

    private void setImage(int flag){
        switch (flag){
            case 1:
                wechat.setImageResource(R.drawable.wechat_active);
                list.setImageResource(R.drawable.list);
                find.setImageResource(R.drawable.find);
                me.setImageResource(R.drawable.me);
                break;
            case 2:
                wechat.setImageResource(R.drawable.wechat);
                list.setImageResource(R.drawable.list_active);
                find.setImageResource(R.drawable.find);
                me.setImageResource(R.drawable.me);
                break;
            case 3:
                wechat.setImageResource(R.drawable.wechat);
                list.setImageResource(R.drawable.list);
                find.setImageResource(R.drawable.find_active);
                me.setImageResource(R.drawable.me);
                break;
            case 4:
                wechat.setImageResource(R.drawable.wechat);
                list.setImageResource(R.drawable.list);
                find.setImageResource(R.drawable.find);
                me.setImageResource(R.drawable.me_active);
                break;
        }
    }

    @Override
    public void onClick(View v) {
        hideAllFrag();
        switch (v.getId()){
            case R.id.wechat:showWeChat();break;
            case R.id.list:showList();break;
            case R.id.find:showFind();break;
            case R.id.me:showMe();break;
        }
    }

    private void showMe() {
        if(meFragment==null){
            meFragment = new MeFragment();
        }
        addFrag(meFragment);
        setImage(4);
    }

    private void showFind() {
        if(findFragment==null){
            findFragment = new FindFragment();
        }
        addFrag(findFragment);
        setImage(3);
    }

    private void showList() {
        if(listFragment==null){
            listFragment = new ListFragment();
        }
        addFrag(listFragment);
        setImage(2);
    }

    private void showWeChat() {
        if(weChatFragment==null){
            weChatFragment = new WeChatFragment();
        }
        addFrag(weChatFragment);
        setImage(1);
    }


}
