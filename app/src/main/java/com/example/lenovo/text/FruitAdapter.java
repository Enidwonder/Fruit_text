package com.example.lenovo.text;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by lenovo on 2017/5/5.
 */

public class FruitAdapter extends RecyclerView.Adapter<FruitAdapter.ViewHolder> {
    private List<Fruit> myList ;

    public FruitAdapter(List<Fruit> fruits) {
        myList = fruits;
    }


    class ViewHolder extends RecyclerView.ViewHolder{
        CardView cardView;
        ImageView fruitImage;
        TextView fruitName;

        public ViewHolder(View itemView) {
            super(itemView);
            cardView =(CardView) itemView;
            fruitImage = (ImageView)itemView.findViewById(R.id.fruit_image);
            fruitName = (TextView)itemView.findViewById(R.id.fruit_name);
        }
    }
    @Override
    public FruitAdapter.ViewHolder onCreateViewHolder(final ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fruit_item,parent,false);
        final ViewHolder holder = new ViewHolder(view);
        holder.fruitImage.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int position = holder.getAdapterPosition();
                Fruit fruit = myList.get(position);
                Toast.makeText(parent.getContext(),"image"+fruit.getFruit_name(),Toast.LENGTH_SHORT).show();
            }
        });
        holder.cardView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("android.intent.action.AfterClick"); //隐式intent
            }
        });
        return holder;
    }

    @Override
    public void onBindViewHolder(FruitAdapter.ViewHolder holder, int position) {
        Fruit fruit = myList.get(position);
        holder.fruitName.setText(fruit.getFruit_name());
        holder.fruitImage.setImageResource(fruit.getFruit_imageID());
    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
