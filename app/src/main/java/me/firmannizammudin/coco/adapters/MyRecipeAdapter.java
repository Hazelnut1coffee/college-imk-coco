package me.firmannizammudin.coco.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import me.firmannizammudin.coco.DetailRecipeActivity;
import me.firmannizammudin.coco.R;

import java.util.ArrayList;

import me.firmannizammudin.coco.SignUpActivity;
import me.firmannizammudin.coco.models.RecipeListModel;

/**
 * Created by Firman on 20-Jul-16.
 */
public class MyRecipeAdapter extends RecyclerView.Adapter<MyRecipeAdapter.ViewHolder> {
    private ArrayList<RecipeListModel> mDataSet;
    private Context context;

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private ImageView ivPhoto;
        private TextView txtFoodName;

        public ViewHolder(View v) {
            super(v);
            ivPhoto = (ImageView) v.findViewById(R.id.myrecipe_iv_photo);
            txtFoodName = (TextView) v.findViewById(R.id.myrecipe_txt_foodname);

            v.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            Intent i = new Intent(context, DetailRecipeActivity.class);
            context.startActivity(i);
        }
    }

    public MyRecipeAdapter(Context context, ArrayList<RecipeListModel> dataSet) {
        this.context = context;
        mDataSet = dataSet;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View v = LayoutInflater.from(context)
                .inflate(R.layout.fragment_my_recipe_row_item, viewGroup, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {
        RecipeListModel recipe = mDataSet.get(position);
        viewHolder.ivPhoto.setImageResource(recipe.getPhoto());
        viewHolder.txtFoodName.setText(recipe.getFoodName());
    }

    @Override
    public int getItemCount() {
        return mDataSet.size();
    }
}