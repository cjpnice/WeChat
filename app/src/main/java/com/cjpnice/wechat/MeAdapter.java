package com.cjpnice.wechat;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;


import java.util.List;

public class MeAdapter  extends ArrayAdapter<Me> {

    private int resourceId;
    public MeAdapter(@NonNull Context context, int resource, @NonNull List<Me> objects) {
        super(context, resource, objects);
        this.resourceId = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Me me = getItem(position);
        View view;
        ViewHolder viewHolder;
        if(convertView == null){
            view = LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
            viewHolder = new ViewHolder();
            viewHolder.me_image = view.findViewById(R.id.me_image);
            viewHolder.text = view.findViewById(R.id.text);
            viewHolder.more = view.findViewById(R.id.more);
            view.setTag(viewHolder);
        }else{
            view = convertView;
            viewHolder = (ViewHolder)view.getTag();
        }
        viewHolder.me_image.setImageResource(me.getImageId());
        viewHolder.text.setText(me.getName());
        viewHolder.more.setImageResource(me.getMore());
        return view;
    }

    class ViewHolder{
        ImageView me_image;
        TextView text;
        ImageView more;
    }
}
