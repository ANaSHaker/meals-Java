package com.bfcai.meals;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.android.volley.AuthFailureError;
import com.squareup.picasso.Picasso;

import java.util.List;

public class MealAdapter extends RecyclerView.Adapter<MealAdapter.ViewHolder> {
    LayoutInflater inflater;
    List<MealClass> meals;

    public MealAdapter(Context ctx, List<MealClass> meals, Context baseContext){
        this.inflater = LayoutInflater.from(ctx);
        this.meals = meals;
    }




    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.custom_api_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        // bind the data
        holder.mealTitle.setText(meals.get(position).getTitle());
        holder.mealPrice.setText(meals.get(position).getprice()+ "$");
        Picasso.get().load(meals.get(position).getCoverImage()).into(holder.mealCoverImage);

    }

    @Override
    public int getItemCount() {
        return meals.size();
    }

    public  class ViewHolder extends  RecyclerView.ViewHolder{
        TextView mealTitle,mealPrice;
        ImageView mealCoverImage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            mealTitle = itemView.findViewById(R.id.songTitle);
            mealPrice = itemView.findViewById(R.id.songArtist);
            mealCoverImage = itemView.findViewById(R.id.coverImage);

            // handle onClick

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
             //       Toast.makeText(v.getContext(), "Do Something With this Click", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}
