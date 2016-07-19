package me.firmannizammudin.coco.models;

/**
 * Created by Firman on 20-Jul-16.
 */
public class RecipeListModel {
    private int photo;
    private String foodName;

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public RecipeListModel(int photo, String foodName) {
        this.photo = photo;
        this.foodName = foodName;
    }
}
