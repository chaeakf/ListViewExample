package com.tj.listviewexample;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.tj.listviewexample.adapters.StoreAdapter;
import com.tj.listviewexample.databinding.ActivityMainBinding;
import com.tj.listviewexample.datas.Store;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding act;
    List<Store> myStoreList = new ArrayList<>();
    private android.widget.ListView storeListView;

    StoreAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        act = DataBindingUtil.setContentView(this,R.layout.activity_main);
        bindVies();
        setupEvents();
        setValues();

    }

    void setValues(){

        act.appNametxt.setText("배달의민족");

        fillStores();

        myAdapter = new StoreAdapter(MainActivity.this, myStoreList);
        //storeListView.setAdapter(myAdapter);
        act.storeListView.setAdapter(myAdapter);
    }

//     ArrayLiset 안에 가게들을 채우는 메쏘드, 연습용으로 임시로 작성.
//     실무에서는 인런식으로 데이터를 채우지 않고,
//     서버에서 받아온 데이터를 ArrayList에 채워넣는다.
    void fillStores(){
        myStoreList.add(new Store("서향","월계동 411", "09:00","21:00"));
        myStoreList.add(new Store("삼호각","다들로", "09:00","21:00"));
        myStoreList.add(new Store("안동장","장위 1동", "09:00","21:00"));
    }

    void setupEvents(){


    }


    void bindVies(){
        this.storeListView = (ListView) findViewById(R.id.storeListView);
    }
}
