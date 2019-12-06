package com.zws.design.builder.tradition;

/**
 * @author zhengws
 * @date 2019-08-13 22:08
 */
public class TraditionBuiderTest {
    public static void main(String[] args) {
        Builder builder = new NutritionBuilder();
        builder.buildCalories(1);
        builder.buildCarbohydrate(2);
        builder.buildFat(3);
        builder.buildServings(4);
        builder.buildServingSize(5);
        builder.buildSodium(6);

        Director director = new Director(builder);
        NutritionFacts facts = director.getNutritionFacts();
    }
}
