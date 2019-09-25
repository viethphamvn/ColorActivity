package edu.temple.coloractivity;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ColorAdapter extends BaseAdapter {
    Context context;
    int count;
    String[] colors;

    public ColorAdapter(Context context, int count, String[] colors){
        this.context = context;
        this.count = count;
        this.colors = colors;
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        TextView textView;

        if (convertView instanceof View){
            textView = (TextView) convertView;
        } else {
            textView = new TextView(context);
        }
        textView.setTextSize(50);
        textView.setTextColor(Color.BLACK);
        textView.setText(colors[i]);
        textView.setBackgroundColor(Color.WHITE);
        return textView;
    }
}
