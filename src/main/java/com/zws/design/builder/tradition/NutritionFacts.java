package com.zws.design.builder.tradition;

import lombok.Data;

/**
 * @author zhengws
 * @date 2019-08-13 21:56
 */
@Data
public class NutritionFacts {
    private int servingSize;
    private int servings;
    private int calories;
    private int fat;
    private int sodium;
    private int carbohydrate;
}
