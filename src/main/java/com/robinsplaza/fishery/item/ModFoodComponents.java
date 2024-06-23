package com.robinsplaza.fishery.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    public static FoodComponent RAW_FISH = new FoodComponent.Builder()
            .nutrition(2)
            .saturationModifier(0.3f)
            .build();
    public static FoodComponent COOKED_FISH = new FoodComponent.Builder()
            .nutrition(6)
            .saturationModifier(0.7f)
            .build();
    public static FoodComponent TOXIC_FISH = new FoodComponent.Builder()
            .nutrition(2)
            .saturationModifier(0.3f)
            .statusEffect(new StatusEffectInstance(StatusEffects.POISON, 200), 0.33f)
            .build();
}
