package com.example.cryptotracker.Adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cryptotracker.R;

public class CoinViewHolder extends RecyclerView.ViewHolder {
    public ImageView coin_icon;
    public TextView coin_symbol,coin_name,coin_price,one_hour_change,twemty_hours_change,seven_days_change;

    public CoinViewHolder(@NonNull View itemView) {
        super(itemView);

        coin_icon = itemView.findViewById(R.id.coin_icon);
        coin_name = itemView.findViewById(R.id.coin_name);
        //coin_symbol = itemView.findViewById(R.id.coin_symbol);
        coin_price = itemView.findViewById(R.id.priceUsdText);
        one_hour_change = itemView.findViewById(R.id.oneHourText);
        //twemty_hours_change = itemView.findViewById(R.id.twentyFourHourText);
        seven_days_change = itemView.findViewById(R.id.sevenDayText);
    }
}
