package com.tj.listviewexample.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

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

    //getView 자동완성 @ ~ 빨간색삭제
     @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View row = convertView;

        if (row == null) {
            row  = inf.inflate(R.layout.store_list_item, null);
        }
//        실제 Store 데이터를 이용해서 row의 적재적소에 뿌려주기.

         Store data = mList.get(position);

//         XML에 그려진 컴포넌트들을 찾아서 JAVA로 연결.

         TextView sotreNameTxt = row.findViewById(R.id.storeNameTxt);

//         data가 가진 값을 컴포넌트에 set.
         sotreNameTxt.setText(data.name);
        return row;
    }
}
