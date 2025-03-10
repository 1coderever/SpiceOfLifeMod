package net.gray.spiceoflifemod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties KOHLRABI = new FoodProperties.Builder().nutrition(3).saturationModifier(1.2f)
            .effect(new MobEffectInstance(MobEffects.INVISIBILITY, 400), 0.20f).fast().build();
}
