package com.example.alarmlayout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Switch;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class ClockAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<clock> clockList;

    public ClockAdapter(Context context, int layout, List<clock> clockList) {
        this.context = context;
        this.layout = layout;
        this.clockList = clockList;
    }

    @Override
    public int getCount() {
        return clockList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }
    private class ViewHolder{
        TextView txview1;
        TextView txview2;
        Switch swit1;
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if (view==null){
            holder=new ViewHolder();
            LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view=inflater.inflate(layout,null);

            holder.txview1=(TextView) view.findViewById(R.id.tv_time);
            holder.txview2=(TextView) view.findViewById(R.id.tv_day);
            holder.swit1=(Switch) view.findViewById(R.id.sw1);
            view.setTag(holder);
        }
        else{
            holder=(ViewHolder) view.getTag();
        }

        clock clock_rows=clockList.get(i);
        holder.txview1.setText(clock_rows.getTime());
        holder.txview2.setText(clock_rows.getDay());

        return view;
    }
}
