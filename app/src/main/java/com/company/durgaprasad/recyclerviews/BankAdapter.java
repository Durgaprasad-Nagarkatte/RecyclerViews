package com.company.durgaprasad.recyclerviews;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

import static android.R.attr.resource;

/**
 * Created by Durgaprasad on 3/29/2017.
 */

public class BankAdapter extends ArrayAdapter<Bank>{

    private static final String LOG_TAG = BankAdapter.class.getSimpleName();

    public BankAdapter(Context context, ArrayList<Bank> banks) {
        super(context,0,banks);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Bank currentBank = getItem(position);


        TextView bankName = (TextView)listItemView.findViewById(R.id.bankName);
        bankName.setText(currentBank.getBankName());

        TextView mutualFundName = (TextView)listItemView.findViewById(R.id.mutualFundName);
        mutualFundName.setText(currentBank.getMutualFundName());

        TextView currentBalance = (TextView)listItemView.findViewById(R.id.currentBalance);
        currentBalance.setText(currentBank.getCurrentBalance());

        ImageView image = (ImageView)listItemView.findViewById(R.id.image);
        image.setImageResource(currentBank.getImageResourceId());

        return listItemView;
    }
}
