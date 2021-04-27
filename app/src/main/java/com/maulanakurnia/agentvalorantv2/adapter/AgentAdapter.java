package com.maulanakurnia.agentvalorantv2.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.maulanakurnia.agentvalorantv2.R;
import com.maulanakurnia.agentvalorantv2.activity.DetailAgentActivity;
import com.maulanakurnia.agentvalorantv2.model.AgentModel;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class AgentAdapter extends RecyclerView.Adapter<AgentAdapter.ViewHolder>{
    private ArrayList<AgentModel> listAgent;
    private Context context;

    public AgentAdapter(ArrayList<AgentModel> dataList, Context context) {
        this.listAgent = dataList;
        this.context = context;
    }

    @NonNull @Override
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_list_agent, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AgentAdapter.ViewHolder holder, int position) {
        String image    = listAgent.get(position).getImage();
        String name     = listAgent.get(position).getName();
        String role     = listAgent.get(position).getRole();
        String summary  = listAgent.get(position).getSummary();

        Glide.with(holder.itemView.getContext())
                .load(listAgent.get(position).getImage())
                .into(holder.image);

        holder.name.setText(name);
        holder.role.setText(role);
        holder.summary.setText(summary);

        holder.btnPreview.setOnClickListener(v -> {
            Intent i = new Intent(context, DetailAgentActivity.class);
            i.putExtra("IMAGE_KEY", image);
            i.putExtra("NAME_KEY", name);
            i.putExtra("ROLE_KEY", role);
            i.putExtra("SUMMARY_KEY", summary);
            context.startActivity(i);
        });
    }

    @Override
    public int getItemCount() {
        return (listAgent != null) ? listAgent.size() : 0;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final ImageView image;
        private final TextView name, role, summary;
        private final Button btnPreview;

        public ViewHolder(View itemView) {
            super(itemView);
            image      = itemView.findViewById(R.id.agent_image);
            name       = itemView.findViewById(R.id.agent_name);
            role       = itemView.findViewById(R.id.agent_role);
            summary    = itemView.findViewById(R.id.agent_summary);
            btnPreview = itemView.findViewById(R.id.btnPreview);
        }
    }
}
