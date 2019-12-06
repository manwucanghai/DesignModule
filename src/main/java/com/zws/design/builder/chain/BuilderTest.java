package com.zws.design.builder.chain;

/**
 * @author zhengws
 * @date 2019-07-23 10:32
 */
public class BuilderTest {
    public static void main(String[] args) {
        NutritionFacts nutritionFacts = new NutritionFacts.Builder(1,2)
                .calories(2)
                .fat(2)
                .sodium(2)
                .carbohydrate(4)
                .build();

        System.out.println(nutritionFacts);
    }
}
