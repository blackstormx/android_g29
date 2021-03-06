package com.example.todoapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import androidx.arch.core.util.Function;

import java.lang.reflect.Method;
import java.util.concurrent.Callable;

class ListElementAdapter extends BaseAdapter {

    Context context;
    String[] data;
    Method onDelete;
    Object object;
    private static LayoutInflater inflater = null;

    public ListElementAdapter(Context context, String[] data) {
        // TODO Auto-generated constructor stub
        this.context = context;
        this.data = data;
//        this.onDelete = onDelete;
//        this.object = object;
        inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return data.length;
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return data[position];
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        View vi = convertView;
        if (vi == null)
            vi = inflater.inflate(R.layout.list_element, null);

        TextView text = (TextView) vi.findViewById(R.id.listView);
        text.setText(data[position]);

//        Button del = (Button) vi.findViewById(R.id.button);

//        onDelete.invoke(object, 13);

        return vi;
    }
}