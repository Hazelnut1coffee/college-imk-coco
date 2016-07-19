package me.firmannizammudin.coco;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import me.firmannizammudin.coco.adapters.MyRecipeAdapter;
import me.firmannizammudin.coco.models.RecipeListModel;

public class FavoriteFragment extends Fragment {

    ArrayList<RecipeListModel> recipe = new ArrayList<>();

    public FavoriteFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_favorite, container, false);

        populateDate();
        RecyclerView rv = (RecyclerView) rootView.findViewById(R.id.favorite_rv);
        rv.setLayoutManager(new LinearLayoutManager(getActivity()));
        MyRecipeAdapter rvAdapter = new MyRecipeAdapter(getActivity(), recipe);
        rv.setAdapter(rvAdapter);

        return rootView;
    }

    private void populateDate() {
        recipe.add(new RecipeListModel(R.drawable.im_rendang, "Rendang Padang"));
        recipe.add(new RecipeListModel(R.drawable.im_rendang, "Rendang Padang"));
        recipe.add(new RecipeListModel(R.drawable.im_rendang, "Rendang Padang"));
        recipe.add(new RecipeListModel(R.drawable.im_rendang, "Rendang Padang"));
        recipe.add(new RecipeListModel(R.drawable.im_rendang, "Rendang Padang"));
        recipe.add(new RecipeListModel(R.drawable.im_rendang, "Rendang Padang"));
    }
}
