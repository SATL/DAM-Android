package com.fpmislata.practicas.pmdm_t4a11_alzate_eslem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by eslem on 10/19/2016.
 */

public class FoodList {
    static List FOOD_LIST = new ArrayList<Food>();
    static{
        FOOD_LIST.add(new Food("Pizza1", "Medium Pizza", 12.3, R.drawable.pizza1));
        FOOD_LIST.add(new Food("Burger1", "Medium Burger", 8.3, R.drawable.burger1));
        FOOD_LIST.add(new Food("Burger2", "Medium Burger", 6.3, R.drawable.burger2));
        FOOD_LIST.add(new Food("Burger3", "Medium Burger", 4.3, R.drawable.burger3));
        FOOD_LIST.add(new Food("Lassagna", "Medium Lassagna", 7, R.drawable.lassagna));
        FOOD_LIST.add(new Food("Pizza1", "Medium Pizza", 12.3, R.drawable.pizza1));
        FOOD_LIST.add(new Food("Burger1", "Medium Burger", 8.3, R.drawable.burger1));
        FOOD_LIST.add(new Food("Burger2", "Medium Burger", 6.3, R.drawable.burger2));
        FOOD_LIST.add(new Food("Burger3", "Medium Burger", 4.3, R.drawable.burger3));
        FOOD_LIST.add(new Food("Lassagna", "Medium Lassagna", 7, R.drawable.lassagna));
    }
}
