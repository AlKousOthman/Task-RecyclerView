package com.joincoded.bankaccounts.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.joincoded.bankaccounts.R;
import com.joincoded.bankaccounts.model.CurrencyInfo;

import java.util.ArrayList;

public class CurrencyAdapter extends RecyclerView.Adapter<CurrencyAdapter.ViewHolder> {
    ArrayList<CurrencyInfo> currencyList2;

    public CurrencyAdapter(ArrayList<CurrencyInfo> currencyList2) {
        this.currencyList2 = currencyList2;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.item_currency,
                parent,
                false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.nameTextView.setText(currencyList2.get(position).getCurrencyName());
        holder.rateTextView.setText(String.valueOf(currencyList2.get(position).getCurrencyRate()));
        holder.currencyCodeTextView.setText(currencyList2.get(position).getCurrencyCode());
    }

    @Override
    public int getItemCount() {

        return currencyList2.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView rateTextView , nameTextView, currencyCodeTextView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nameTextView = itemView.findViewById(R.id.nameTextview);
            rateTextView = itemView.findViewById(R.id.rateTextView);
            currencyCodeTextView = itemView.findViewById(R.id.currencyCodeTextView);

        }
    }
}
