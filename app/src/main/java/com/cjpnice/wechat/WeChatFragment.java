package com.cjpnice.wechat;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class WeChatFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.wechat,null);
        List<Message> messageList = initData();
        MessageAdapter messageAdapter = new MessageAdapter(messageList);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        RecyclerView recyclerView = view.findViewById(R.id.wechat_recycler_view);
        recyclerView.addItemDecoration(new DividerItemDecoration(getActivity(),DividerItemDecoration.VERTICAL));
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(messageAdapter);
        return view;
    }

    private List<Message> initData() {
        List<Message> datas = new ArrayList<>();
        datas.add(new Message(R.drawable.pict1,"鼬神","无论村子有多么黑暗，有多少矛盾，我都是木叶的宇智波鼬","下午6：23"));
        datas.add(new Message(R.drawable.pict2,"佐助","有太多的羁绊只会让自己迷惘，强烈的想法和珍惜的思念，只会让自己变弱。","下午4：03"));
        datas.add(new Message(R.drawable.pict3,"卡卡西","忍者不能按常理来思考。","下午3：52"));
        datas.add(new Message(R.drawable.pict4,"佩恩","感受痛处吧！体验痛楚吧！接受痛楚吧！不知道痛苦的人是不知道什么是真正的和平！","下午3：43"));
        datas.add(new Message(R.drawable.pict5,"鸣人","所谓火影就是忍着疼痛走在最前面的人。","下午1：36"));
        datas.add(new Message(R.drawable.pict1,"鼬神","无论村子有多么黑暗，有多少矛盾，我都是木叶的宇智波鼬","下午6：23"));
        datas.add(new Message(R.drawable.pict2,"佐助","有太多的羁绊只会让自己迷惘，强烈的想法和珍惜的思念，只会让自己变弱。","下午4：03"));
        datas.add(new Message(R.drawable.pict3,"卡卡西","忍者不能按常理来思考。","下午3：52"));
        datas.add(new Message(R.drawable.pict4,"佩恩","感受痛处吧！体验痛楚吧！接受痛楚吧！不知道痛苦的人是不知道什么是真正的和平！","下午3：43"));
        datas.add(new Message(R.drawable.pict5,"鸣人","所谓火影就是忍着疼痛走在最前面的人。","下午1：36"));
        return datas;
    }
}

