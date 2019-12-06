package com.zws.design.builder.tradition;

/**
 * @author zhengws
 * @date 2019-08-13 22:03
 */
public interface Builder {

    void buildServingSize(int size);

    void buildServings(int servings);

    void buildCalories(int calories);

    void buildFat(int fat);

    void buildSodium(int sodium);

    void buildCarbohydrate(int carbohydrate);

    NutritionFacts getFacts();
}
