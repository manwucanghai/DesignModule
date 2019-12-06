package com.zws.design.builder.tradition;

/**
 * @author zhengws
 * @date 2019-08-13 22:09
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public NutritionFacts getNutritionFacts(){
        return builder.getFacts();
    }
}
