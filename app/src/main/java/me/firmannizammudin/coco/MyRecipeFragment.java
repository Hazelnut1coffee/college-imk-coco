package me.firmannizammudin.coco;


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import me.firmannizammudin.coco.adapters.MyRecipeAdapter;
import me.firmannizammudin.coco.models.RecipeListModel;


/**
 * A simple {@link Fragment} subclass.
 */
public class MyRecipeFragment extends Fragment {

    ArrayList<RecipeListModel> recipe = new ArrayList<>();

    public MyRecipeFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_my_recipe, container, false);

        populateDate();
        RecyclerView rv = (RecyclerView) rootView.findViewById(R.id.myrecipe_rv);
        rv.setLayoutManager(new LinearLayoutManager(getActivity()));
        MyRecipeAdapter rvAdapter = new MyRecipeAdapter(getActivity(), recipe);
        rv.setAdapter(rvAdapter);

        FloatingActionButton fab = (FloatingActionButton) rootView.findViewById(R.id.myrecipe_fab_add);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), AddRecipeActivity.class);
                startActivity(i);
            }
        });
        return rootView;
    }

    private void populateDate(){
        recipe.add(new RecipeListModel(R.drawable.im_rendang, "Rendang Padang"));
        recipe.add(new RecipeListModel(R.drawable.im_rendang, "Rendang Padang"));
        recipe.add(new RecipeListModel(R.drawable.im_rendang, "Rendang Padang"));
        recipe.add(new RecipeListModel(R.drawable.im_rendang, "Rendang Padang"));
        recipe.add(new RecipeListModel(R.drawable.im_rendang, "Rendang Padang"));
        recipe.add(new RecipeListModel(R.drawable.im_rendang, "Rendang Padang"));
    }

}
