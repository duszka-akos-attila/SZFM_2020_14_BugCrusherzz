package com.tracky2.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tracky2.R;
import com.tracky2.data.DateConverter;
import com.tracky2.data.Expense;
import com.tracky2.data.manager.Manager;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Objects;

import static android.graphics.Color.rgb;
import static com.tracky2.MainActivity.context;

public class mainExpenseListRecycleAdapter extends RecyclerView.Adapter<mainExpenseListRecycleAdapter.ViewHolder>{

    List<Expense> expenses;

    public mainExpenseListRecycleAdapter(List<Expense> expenses) {
        this.expenses = expenses;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.main_expense_list_row_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.date1.setText(DateConverter.formatDateGetMonth(expenses.get(position).getDate()));
        holder.date2.setText(DateConverter.formatDateGetYear(expenses.get(position).getDate()));

        String amount = new DecimalFormat("###,###,### "+context.getString(R.string.currency))
                .format(expenses.get(position).getAmount());

        holder.amount.setText(amount);

        holder.description.setText(expenses.get(position).getDescription());
        holder.groupBadge.setText(Objects.requireNonNull(Manager.findGroupById(expenses.get(position).getGroupId())).getName());
        holder.groupBadge.getBackground().setTint(255*Objects.requireNonNull(Manager.findGroupById(expenses.get(position).getGroupId())).getColor());
    }

    @Override
    public int getItemCount() {
        return expenses.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        TextView date1, date2, amount, description, groupBadge;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            date1 = itemView.findViewById(R.id.mainExpenseListDateMonthAndDayTextView);
            date2 = itemView.findViewById(R.id.mainExpenseListDateYearTextView);
            amount = itemView.findViewById(R.id.mainExpenseListAmountTextView);
            description = itemView.findViewById(R.id.mainExpenseListDescriptionTextView);
            groupBadge = itemView.findViewById(R.id.mainExpenseListGroupBadgeTextView);
        }
    }
}
