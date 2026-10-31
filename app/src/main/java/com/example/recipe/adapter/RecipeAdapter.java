package com.example.recipe.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.recipe.R;
import com.example.recipe.model.Recipe;

import java.util.List;

public class RecipeAdapter extends RecyclerView.Adapter<RecipeAdapter.RecipeViewHolder> {

    private final List<Recipe> recipeList;
    private final OnRecipeClickListener onRecipeClickListener;

    public RecipeAdapter(
            List<Recipe> recipeList,
            OnRecipeClickListener onRecipeClickListener
    ) {
        this.recipeList = recipeList;
        this.onRecipeClickListener = onRecipeClickListener;
    }

    @NonNull
    @Override
    public RecipeViewHolder onCreateViewHolder(
            @NonNull ViewGroup parent,
            int viewType
    ) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_recipe, parent, false);

        return new RecipeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(
            @NonNull RecipeViewHolder holder,
            int position
    ) {
        Recipe recipe = recipeList.get(position);

        // Jangan gunakan setImageResource() untuk gambar besar.
        // Glide akan melakukan resizing/downsampling gambar.
        Glide.with(holder.itemView.getContext())
                .load(recipe.getImage())
                .override(800, 800)
                .centerCrop()
                .into(holder.imageRecipe);

        holder.textRecipeName.setText(recipe.getName());

        String cookingTime = "⏱ " + recipe.getCookingTime();
        holder.textCookingTime.setText(cookingTime);

        holder.textDifficulty.setText(recipe.getDifficulty());

        holder.itemView.setOnClickListener(view -> {
            if (onRecipeClickListener != null) {
                onRecipeClickListener.onRecipeClick(recipe);
            }
        });
    }

    @Override
    public int getItemCount() {
        return recipeList.size();
    }

    public static class RecipeViewHolder extends RecyclerView.ViewHolder {

        ImageView imageRecipe;
        TextView textRecipeName;
        TextView textCookingTime;
        TextView textDifficulty;

        public RecipeViewHolder(@NonNull View itemView) {
            super(itemView);

            imageRecipe = itemView.findViewById(R.id.imageRecipe);
            textRecipeName = itemView.findViewById(R.id.textRecipeName);
            textCookingTime = itemView.findViewById(R.id.textCookingTime);
            textDifficulty = itemView.findViewById(R.id.textDifficulty);
        }
    }

    public interface OnRecipeClickListener {
        void onRecipeClick(Recipe recipe);
    }
}