package com.cjpnice.wechat;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.List;

public class MeFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.me,null);
        final List<Me> datas = initDatas();
        MeAdapter meAdapter = new MeAdapter(getActivity(),R.layout.me_item,datas);
        ListView listView = view.findViewById(R.id.me_list);
        listView.setAdapter(meAdapter);
        return view;
    }

    private List<Me> initDatas() {
        List<Me> datas = new ArrayList<>();
        datas.add(new Me(R.drawable.zhifu,"支付",R.drawable.right));
        datas.add(new Me(R.drawable.shouchang,"收藏",R.drawable.right));
        datas.add(new Me(R.drawable.xiangce,"相册",R.drawable.right));
        datas.add(new Me(R.drawable.kabao,"卡包",R.drawable.right));
        datas.add(new Me(R.drawable.biaoqing,"表情",R.drawable.right));
        datas.add(new Me(R.drawable.shezhi,"设置",R.drawable.right));
        return datas;
    }
}
