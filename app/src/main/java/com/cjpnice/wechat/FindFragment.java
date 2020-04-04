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

public class FindFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.find,null);
        List<Find> findList = initData();
        FindAdapter findAdapter = new FindAdapter(findList);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        RecyclerView recyclerView = view.findViewById(R.id.find_recycler_view);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(findAdapter);
        return view;
    }

    private List<Find> initData() {
        List<Find> datas = new ArrayList<>();
        datas.add(new Find(R.drawable.pengyouquan,"朋友圈",R.drawable.right));
        datas.add(new Find(R.drawable.saoyisao,"扫一扫",R.drawable.right));
        datas.add(new Find(R.drawable.kanyikan,"看一看",R.drawable.right));
        datas.add(new Find(R.drawable.xiaocengxu,"小程序",R.drawable.right));
        return datas;
    }
}
