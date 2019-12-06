package com.zws.design.builder.tradition;

/**
 * @author zhengws
 * @date 2019-08-13 22:06
 */
public class NutritionBuilder implements Builder {
    private NutritionFacts facts = new NutritionFacts();

    public void buildServingSize(int size) {
        facts.setServingSize(size);
    }

    public void buildServings(int servings) {
        facts.setServings(servings);
    }

    public void buildCalories(int calories) {
        facts.setCalories(calories);
    }

    public void buildFat(int fat) {
        facts.setFat(fat);
    }

    public void buildSodium(int sodium) {
        facts.setSodium(sodium);
    }

    public void buildCarbohydrate(int carbohydrate) {
        facts.setCarbohydrate(carbohydrate);
    }

    public NutritionFacts getFacts() {
        return facts;
    }
}
