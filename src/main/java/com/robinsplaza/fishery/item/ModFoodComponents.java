package com.robinsplaza.fishery.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Items;

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
    public static FoodComponent JELLY = new FoodComponent.Builder()
            .nutrition(4)
            .saturationModifier(0.8f)
            .usingConvertsTo(Items.GLASS_BOTTLE)
            .build();
}
