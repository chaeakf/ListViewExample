package com.tj.listviewexample.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;

import com.tj.listviewexample.R;
import com.tj.listviewexample.datas.Store;

import java.util.List;

public class StoreAdapter extends ArrayAdapter<Store> {

    Context mContext;
    List<Store> mList;
    LayoutInflater inf;

    public StoreAdapter(Context context, List<Store>list){
        super(context, R.layout.store_list_item, list);

        mContext = context;
        mList = list;
        inf = LayoutInflater.from(mContext);
    }


}
