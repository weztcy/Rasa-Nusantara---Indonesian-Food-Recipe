package com.example.recipe.activity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.recipe.R;
import com.example.recipe.data.RecipeData;
import com.example.recipe.model.Recipe;

import java.util.List;

public class DetailActivity extends AppCompatActivity {

    private ImageView imageRecipeDetail;
    private TextView textRecipeNameDetail;
    private TextView textCookingTimeDetail;
    private TextView textDifficultyDetail;
    private TextView textRecipeDescriptionDetail;
    private TextView textIngredients;
    private TextView textSteps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        initializeViews();

        int recipeId = getIntent().getIntExtra("recipe_id", -1);

        if (recipeId != -1) {
            Recipe recipe = findRecipeById(recipeId);

            if (recipe != null) {
                displayRecipe(recipe);
            } else {
                finish();
            }
        } else {
            finish();
        }
    }

    private void initializeViews() {
        imageRecipeDetail = findViewById(R.id.imageRecipeDetail);
        textRecipeNameDetail = findViewById(R.id.textRecipeNameDetail);
        textCookingTimeDetail = findViewById(R.id.textCookingTimeDetail);
        textDifficultyDetail = findViewById(R.id.textDifficultyDetail);
        textRecipeDescriptionDetail =
                findViewById(R.id.textRecipeDescriptionDetail);
        textIngredients = findViewById(R.id.textIngredients);
        textSteps = findViewById(R.id.textSteps);
    }

    private Recipe findRecipeById(int recipeId) {

        List<Recipe> recipeList = RecipeData.getRecipeList();

        for (Recipe recipe : recipeList) {
            if (recipe.getId() == recipeId) {
                return recipe;
            }
        }

        return null;
    }

    private void displayRecipe(Recipe recipe) {

        imageRecipeDetail.setImageResource(recipe.getImage());
        textRecipeNameDetail.setText(recipe.getName());
        textRecipeDescriptionDetail.setText(recipe.getDescription());

        String cookingTime = "⏱ " + recipe.getCookingTime();
        textCookingTimeDetail.setText(cookingTime);

        textDifficultyDetail.setText(recipe.getDifficulty());

        textIngredients.setText(formatIngredients(recipe.getIngredients()));
        textSteps.setText(formatSteps(recipe.getSteps()));
    }

    private String formatIngredients(List<String> ingredients) {

        StringBuilder ingredientsText = new StringBuilder();

        for (String ingredient : ingredients) {
            ingredientsText
                    .append("• ")
                    .append(ingredient)
                    .append("\n");
        }

        return ingredientsText.toString().trim();
    }

    private String formatSteps(List<String> steps) {

        StringBuilder stepsText = new StringBuilder();

        for (int i = 0; i < steps.size(); i++) {

            stepsText
                    .append(i + 1)
                    .append(". ")
                    .append(steps.get(i));

            if (i < steps.size() - 1) {
                stepsText.append("\n\n");
            }
        }

        return stepsText.toString();
    }
}