package com.example.recipe.model;

import java.util.List;

public class Recipe {

    private int id;
    private String name;
    private int image;
    private String description;
    private String cookingTime;
    private String difficulty;
    private List<String> ingredients;
    private List<String> steps;

    public Recipe(
            int id,
            String name,
            int image,
            String description,
            String cookingTime,
            String difficulty,
            List<String> ingredients,
            List<String> steps
    ) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.description = description;
        this.cookingTime = cookingTime;
        this.difficulty = difficulty;
        this.ingredients = ingredients;
        this.steps = steps;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getImage() {
        return image;
    }

    public String getDescription() {
        return description;
    }

    public String getCookingTime() {
        return cookingTime;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public List<String> getSteps() {
        return steps;
    }
}