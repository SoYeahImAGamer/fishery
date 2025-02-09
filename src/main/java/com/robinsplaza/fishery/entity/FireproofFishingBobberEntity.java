package com.robinsplaza.fishery.entity;

import com.robinsplaza.fishery.item.ModItems;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.FishingBobberEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.World;

public class FireproofFishingBobberEntity extends FishingBobberEntity {
    public FireproofFishingBobberEntity(PlayerEntity type, World world, int luckBonus, int waitTimeReductionTicks) {
        super(type, world, luckBonus, waitTimeReductionTicks);
    }

    private boolean removeIfInvalid(PlayerEntity player) {
        ItemStack itemStack = player.getMainHandStack();
        ItemStack itemStack2 = player.getOffHandStack();
        boolean bl = itemStack.isOf(ModItems.NETHERITE_FISHING_ROD);
        boolean bl2 = itemStack2.isOf(ModItems.NETHERITE_FISHING_ROD);
        if (!player.isRemoved() && player.isAlive() && (bl || bl2) && !(this.squaredDistanceTo(player) > 1024.0)) {
            return false;
        } else {
            this.discard();
            return true;
        }
    }
}
