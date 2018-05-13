package com.example.software02.cryptocurrency.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.software02.cryptocurrency.R;

/**
 * Created by SOFTWARE02 on 3/18/2018.
 */

public class CryptoDetailsFragment extends Fragment
{

    TextView usdPriceView, btcPriceView;
    TextView dailyChangeView = null;
    TextView hourChangeView = null;
    TextView weeklyChangeView = null;
    TextView musdPriceView = null;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.crypto_details_layout,container, false);
        usdPriceView =(TextView) view.findViewById(R.id.price_usd);
        btcPriceView = (TextView) view.findViewById(R.id.price_btc);
        dailyChangeView = (TextView) view.findViewById(R.id.daily_change);
        hourChangeView =(TextView) view.findViewById(R.id.hour_change);
        weeklyChangeView =(TextView) view.findViewById(R.id.weekly_change);
        musdPriceView =(TextView) view.findViewById(R.id.usdprice);
        return view;
    }


    public void setTetxUsdBtc(String price, String btc, String usd,
                              String dailyChangeRate, String hourChangeRate, String weeklyChangeRate)
    {
        usdPriceView.setText(price);
        btcPriceView.setText(btc);
        musdPriceView.setText(usd);
        dailyChangeView.setText(dailyChangeRate);
        hourChangeView.setText(hourChangeRate);
        weeklyChangeView.setText(weeklyChangeRate);
    }

}
