package com.cjpnice.wechat;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FindAdapter extends RecyclerView.Adapter<FindAdapter.ViewHolder> {
    List<Find> findList;

    public FindAdapter(List<Find> findList) {
        this.findList = findList;
    }

    @NonNull
    @Override
    public FindAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.find_item,parent,false);
        FindAdapter.ViewHolder viewHolder = new FindAdapter.ViewHolder(itemView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull FindAdapter.ViewHolder holder, int position) {
        Find find = findList.get(position);
        holder.imageId.setImageResource(find.getImageId());
        holder.more.setImageResource(find.getMore());
        holder.text.setText(find.getText());
    }

    @Override
    public int getItemCount() {
        return findList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageId;
        TextView text;
        ImageView more;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageId = itemView.findViewById(R.id.find_image);
            text = itemView.findViewById(R.id.find_text);
            more = itemView.findViewById(R.id.find_more);
        }
    }
}
