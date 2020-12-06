package com.tracky2.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tracky2.R;
import com.tracky2.data.Group;
import com.tracky2.data.manager.Manager;

import java.util.List;
import java.util.Objects;

public class groupTablaAdapter  extends RecyclerView.Adapter<groupTablaAdapter.ViewHolder> {


    List<Group> grouptablaList;

    public groupTablaAdapter(List<Group> grouptablaList) {
        this.grouptablaList = grouptablaList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.row_itemlist, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull com.tracky2.adapters.groupTablaAdapter.ViewHolder holder, int position) {


        holder.description.setText(grouptablaList.get(position).getName());
        holder.groupBadge.setText(Objects.requireNonNull(Manager.findGroupById(grouptablaList.get(position).getColor())).getName());
        holder.groupBadge.getBackground().setTint(255*Objects.requireNonNull(Manager.findGroupById(grouptablaList.get(position).getColor())).getColor());
    }

    @Override
    public int getItemCount() {
        //return 10;
         return grouptablaList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        TextView description, groupBadge;

        public  ViewHolder(@NonNull View itemView){
            super(itemView);

            description = itemView.findViewById(R.id.csoportnevtextview);
            groupBadge = itemView.findViewById(R.id.csoportszintextview);

        }
    }
}
