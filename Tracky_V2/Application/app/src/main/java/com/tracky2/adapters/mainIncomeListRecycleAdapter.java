package com.tracky2.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tracky2.R;
import com.tracky2.data.DateConverter;
import com.tracky2.data.Income;
import com.tracky2.data.manager.Manager;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Objects;

import static com.tracky2.MainActivity.context;

public class mainIncomeListRecycleAdapter extends RecyclerView.Adapter<mainIncomeListRecycleAdapter.ViewHolder>{

    List<Income> incomes;

    public mainIncomeListRecycleAdapter(List<Income> incomes) {
        this.incomes = incomes;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.main_income_list_row_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.date1.setText(DateConverter.formatDateGetMonth(incomes.get(position).getDate()));
        holder.date2.setText(DateConverter.formatDateGetYear(incomes.get(position).getDate()));

        String amount = new DecimalFormat("###,###,### "+context.getString(R.string.currency))
                .format(incomes.get(position).getAmount());

        holder.amount.setText(amount);

        holder.description.setText(incomes.get(position).getDescription());

    }

    @Override
    public int getItemCount() {
        return incomes.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        TextView date1, date2, amount, description, groupBadge;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            date1 = itemView.findViewById(R.id.mainIncomeListDateMonthAndDayTextView);
            date2 = itemView.findViewById(R.id.mainIncomeListDateYearTextView);
            amount = itemView.findViewById(R.id.mainIncomeListAmountTextView);
            description = itemView.findViewById(R.id.mainIncomeListDescriptionTextView);
        }
    }
}
