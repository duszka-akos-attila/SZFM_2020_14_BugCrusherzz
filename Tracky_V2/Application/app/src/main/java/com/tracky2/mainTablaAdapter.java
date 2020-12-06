package com.tracky2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tracky2.R;

import java.util.List;

public class mainTablaAdapter extends RecyclerView.Adapter<com.tracky2.mainTablaAdapter.ViewHolder> {

    private static final String TAG = "mainTablaAdapter";

    List<String> balanceList;

    public mainTablaAdapter(List<String> balanceList) {
        this.balanceList = balanceList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        // Log.i(TAG, "onCreateViewHolder: " + count++);
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.row_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        //holder.datum_textView.setText(balanceList.get(position)[2]);
      //  holder.data_textView.setText(balanceList.get(position)[4]);
//         holder.osztaly_textView.setText(Manager.getGroupNameByID(Integer.parseInt(balanceList.get(position)[3])));
      //  holder.osztaly_textView.setText(balanceList.get(position)[3]);
      //  holder.nev_textView.setText(balanceList.get(position)[1]);

        holder.datum_textView.setText("10.10");
        holder.data_textView.setText("-36,021");
        //holder.osztaly_textView.setText("Elektronika");
        holder.nev_textView.setText("Szappanxd");
    }

    @Override
    public int getItemCount() {
        return 10;
        // return balanceList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        TextView data_textView, nev_textView, datum_textView;

        public  ViewHolder(@NonNull View itemView){
            super(itemView);

            data_textView = itemView.findViewById(R.id.data_textView);
            //osztaly_textView = itemView.findViewById(R.id.osztaly_textView);
            datum_textView = itemView.findViewById(R.id.datum_textView);
            nev_textView = itemView.findViewById(R.id.nev_textView);

        }
    }
}
