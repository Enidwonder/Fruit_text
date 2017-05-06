package com.example.lenovo.text;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Fruit> fruitList = new ArrayList<>();

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.more:
                Toast.makeText(this,"know more",Toast.LENGTH_SHORT);
                break;
            case R.id.add:
                Toast.makeText(this,"add a fruit",Toast.LENGTH_LONG);
                break;
        }
        return true;
    }

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
