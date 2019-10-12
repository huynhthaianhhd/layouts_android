package com.example.layoutcaculator;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;

import java.util.List;

public class AdapterButton extends BaseAdapter {
    private Context context;
    private int layout;
    private List<button_num> button_numList;

    public AdapterButton(Context context, int layout, List<button_num> button_numList) {
        this.context = context;
        this.layout = layout;
        this.button_numList = button_numList;
    }

    public AdapterButton() {
    }

    @Override
    public int getCount() {
        return button_numList.size();
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
        Button btnNum;
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if (view==null)
        {
            holder=new ViewHolder();
            LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view=inflater.inflate(layout,null);
            holder.btnNum=(Button) view.findViewById(R.id.btnNum1);
            view.setTag(holder);
        }
        else{
            holder=(ViewHolder) view.getTag();
        }
        button_num btn =button_numList.get(i);
        holder.btnNum.setText(btn.getName());
        holder.btnNum.setTextSize(23);
        if (i==0){
            holder.btnNum.setTextColor(Color.parseColor("#ff5621"));
        }
        if (i == 1 || i == 2 || i == 3 || i == 7 || i == 11 || i == 15 )
        {
            holder.btnNum.setTextColor(Color.parseColor("#328040"));
        }
        if (i == 19)
        {
            holder.btnNum.setTextColor(Color.parseColor("#ffffff"));
            holder.btnNum.setBackgroundResource(R.drawable.buttonresult);
        }
        return view;
    }
}
