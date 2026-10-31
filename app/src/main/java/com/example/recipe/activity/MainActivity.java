package com.example.recipe.activity;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recipe.R;
import com.example.recipe.adapter.RecipeAdapter;
import com.example.recipe.data.RecipeData;
import com.example.recipe.model.Recipe;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerViewRecipes;
    private RecipeAdapter recipeAdapter;
    private List<Recipe> recipeList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeViews();
        setupRecipeList();
        setupRecyclerView();
    }

    private void initializeViews() {
        recyclerViewRecipes = findViewById(R.id.recyclerViewRecipes);
    }

    private void setupRecipeList() {
        recipeList = RecipeData.getRecipeList();
    }

    private void setupRecyclerView() {

        GridLayoutManager gridLayoutManager =
                new GridLayoutManager(this, 2);

        recyclerViewRecipes.setLayoutManager(gridLayoutManager);
        recyclerViewRecipes.setHasFixedSize(true);

        recipeAdapter = new RecipeAdapter(
                recipeList,
                this::openRecipeDetail
        );

        recyclerViewRecipes.setAdapter(recipeAdapter);
    }

    private void openRecipeDetail(Recipe recipe) {

        Intent intent = new Intent(
                MainActivity.this,
                DetailActivity.class
        );

        intent.putExtra("recipe_id", recipe.getId());

        startActivity(intent);
    }
}