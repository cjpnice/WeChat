package com.cjpnice.wechat;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {
    List<ContactList> contactLists;

    public ListAdapter(List<ContactList> contactLists) {
        this.contactLists = contactLists;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
        ListAdapter.ViewHolder viewHolder = new ListAdapter.ViewHolder(itemView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ContactList contactList = contactLists.get(position);
        holder.list_image.setImageResource(contactList.getImageId());
        holder.list_text.setText(contactList.getText());
    }

    @Override
    public int getItemCount() {
        return contactLists.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView  list_image;
        TextView list_text;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            list_image = itemView.findViewById(R.id.list_image);
            list_text = itemView.findViewById(R.id.list_text);
        }
    }
}
