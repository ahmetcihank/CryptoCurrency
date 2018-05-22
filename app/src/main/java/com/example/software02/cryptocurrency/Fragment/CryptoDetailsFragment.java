package com.example.software02.cryptocurrency.Fragment;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ImageView;

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
    ImageView hourArrow = null;
    ImageView dailyArrow = null;
    ImageView weeklyArrow = null;
    LinearLayout mainframe = null;


    @SuppressLint("ResourceAsColor")
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
        hourArrow = (ImageView) view.findViewById(R.id.hour_change_arrow);
        dailyArrow = (ImageView) view.findViewById(R.id.daily_change_arrow);
        weeklyArrow = (ImageView) view.findViewById(R.id.weekly_change_arrow);
        mainframe =(LinearLayout) view.findViewById(R.id.frame_linear_layout);

      //  mainframe.setBackgroundResource(R.drawable.btc);
        //mainframe.setBackgroundColor(R.color.cardview_shadow_end_color);

        mainframe.setBackgroundColor(R.color.niceBlack);

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

   // @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    public void setArrow(String hourChangeRate, String dailyChangeRate, String weeklyChangeRate)
    {
       Float hourValue = Float.valueOf(hourChangeRate);
       Float dayValue = Float.valueOf(dailyChangeRate);
       Float weekValue = Float.valueOf(weeklyChangeRate);

       if(hourValue>0){
           hourArrow.setImageResource(R.drawable.up_arrow);
          //hourArrow.setBackgroundResource(R.drawable.up_arrow);
       }
       else if(hourValue<0){
           hourArrow.setImageResource(R.drawable.download_arrow);
          // hourArrow.setBackgroundResource(R.drawable.download_arrow);
       }


        if(dayValue>0){
               dailyArrow.setImageResource(R.drawable.up_arrow);
           //  dailyArrow.setBackgroundResource(R.drawable.up_arrow);
        }
        else if(dayValue<0){
             dailyArrow.setImageResource(R.drawable.download_arrow);
            // dailyArrow.setBackgroundResource(R.drawable.download_arrow);
        }


        if(weekValue>0){
            weeklyArrow.setImageResource(R.drawable.up_arrow);
          // weeklyArrow.setBackgroundResource(R.drawable.up_arrow);
        }
        else if(weekValue<0){

            weeklyArrow.setImageResource(R.drawable.download_arrow);
            //weeklyArrow.setBackgroundResource(R.drawable.download_arrow);

        }

    }

}
