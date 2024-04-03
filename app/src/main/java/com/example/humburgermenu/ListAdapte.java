package com.example.humburgermenu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ListAdapte extends RecyclerView.Adapter<ListAdapte.ViewHolder> {

    private List<TeamFootball> pemain;
    private Context context;

    public ListAdapte(Context context, List<TeamFootball> pemain) {
        this.context = context;
        this.pemain = pemain;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView textViewName;
        TextView textViewDescription;
        ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewName = itemView.findViewById(R.id.textViewName);
            textViewDescription = itemView.findViewById(R.id.textViewDescription);
            imageView = itemView.findViewById(R.id.imageView);
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.listpremierleguage, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        TeamFootball team = pemain.get(position);

        holder.textViewName.setText(team.getName());
        holder.textViewDescription.setText(team.getAttendanceDescription());
        holder.imageView.setImageResource(team.getImageResource());
    }

    @Override
    public int getItemCount() {
        return pemain.size();
    }
}
