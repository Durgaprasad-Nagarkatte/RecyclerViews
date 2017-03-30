package com.company.durgaprasad.recyclerviews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import static android.R.id.list;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bank_list);

        ArrayList<Bank> banks = new ArrayList<>();
        banks.add(new Bank("HDFC", "ABC Mutual Fund", "3500", "3000",R.drawable.hdfc));
        banks.add(new Bank("SBI", "XYZ Mutual Fund", "3100", "2000",R.drawable.sbi));

        BankAdapter bank = new BankAdapter(this, banks);
        listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(bank);

    }
}
