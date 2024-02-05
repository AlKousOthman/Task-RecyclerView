package com.joincoded.bankaccounts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.joincoded.bankaccounts.adapter.CurrencyAdapter;
import com.joincoded.bankaccounts.model.CurrencyInfo;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<CurrencyInfo> currencyList = new ArrayList<>();
    RecyclerView recyclerView;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        newCurrencies();
        recyclerView = findViewById(R.id.currencyRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        CurrencyAdapter adapter = new CurrencyAdapter(currencyList);
        recyclerView.setAdapter(adapter);
    }

    private void newCurrencies(){
        currencyList.add(new CurrencyInfo("KWD", "Kuwaiti Dinar", 1.0));
        currencyList.add(new CurrencyInfo("OMR", "Omani Riyal", 1.252));
        currencyList.add(new CurrencyInfo("BHD", "Bahraini Dinar", 1.225));
        currencyList.add(new CurrencyInfo("SAR", "Saudi Arabia Riyal", 12.18));
        currencyList.add(new CurrencyInfo("AED", "United Emirates Dirham", 11.94));
        currencyList.add(new CurrencyInfo("QR", "Qatari riyal", 11.83));
        currencyList.add(new CurrencyInfo("USD", "United States Dollar", 3.25));
    }
}