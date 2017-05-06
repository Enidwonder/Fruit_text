package com.example.lenovo.text;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Fruit> fruitList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recyclerview);
        FruitAdapter fruitAdapter = new FruitAdapter(fruitList);
        recyclerView.setAdapter(fruitAdapter);
        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
    }
    void init(){
        int i;
        for(i=0;i<2;i++){
            Fruit apple = new Fruit("apple",R.drawable.apple);
            fruitList.add(apple);
            Fruit banana = new Fruit("banana",R.drawable.banana);
            fruitList.add(banana);
            Fruit mango = new Fruit("mango",R.drawable.mango);
            fruitList.add(mango);
            Fruit orange = new Fruit("orange",R.drawable.orange);
            fruitList.add(orange);
        }

    }
}
