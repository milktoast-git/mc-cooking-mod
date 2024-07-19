package net.milktoast.cookingmod.item;

import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties SOYBEAN = new FoodProperties.Builder()
            .nutrition(3)
            .saturationMod(1)
            .fast()
            .build();
}
