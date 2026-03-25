package com.robinsplaza.fishery.item;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect;

public class ModFoodComponents {

    //food components
    public static FoodProperties RAW_FISH = new FoodProperties.Builder()
            .nutrition(2)
            .saturationModifier(0.3f)
            .build();
    public static FoodProperties COOKED_FISH = new FoodProperties.Builder()
            .nutrition(6)
            .saturationModifier(0.7f)
            .build();
    public static FoodProperties TOXIC_FISH = new FoodProperties.Builder()
            .nutrition(2)
            .saturationModifier(0.3f)
            .build();
    public static FoodProperties JELLY = new FoodProperties.Builder()
            .nutrition(4)
            .saturationModifier(0.9f)
            .alwaysEdible()
            .build();
    public static FoodProperties SASHIMI = new FoodProperties.Builder()
            .nutrition(4)
            .saturationModifier(0.6f)
            .build();

    //Consumable Components
    public static Consumable JELLY_CONSUMABLE = Consumables.defaultDrink()
            .sound(SoundEvents.HONEY_DRINK)
            .build();
    public static Consumable SCULKFISH_CONSUMABLE = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.DARKNESS, 60, 0), 0.5f))
            .build();
}
