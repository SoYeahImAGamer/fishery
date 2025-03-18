package com.robinsplaza.fishery.mixin;

import com.robinsplaza.fishery.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.piston.PistonHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value = PistonHandler.class, priority=450)
public abstract class PistonHandlerMixin {

    @Inject(method = "isBlockSticky", at = @At("HEAD"), cancellable = true)
    private static void isBlockSticky(BlockState state, CallbackInfoReturnable<Boolean> cir) {
        if (state.getBlock() == ModBlocks.SEA_JELLY_BLOCK) {
            cir.setReturnValue(true);
        }
    }

    @Inject(method = "isAdjacentBlockStuck", at = @At("HEAD"), cancellable = true)
    private static void isAdjacentBlockStuck(BlockState blockState1, BlockState blockState2, CallbackInfoReturnable<Boolean> ci) {
        Block block1 = blockState1.getBlock();
        Block block2 = blockState2.getBlock();

        // Jelly Blocks do not stick to Slime or Honey
        if (block1 == ModBlocks.SEA_JELLY_BLOCK) {
            if (block2 == Blocks.SLIME_BLOCK || block2 == Blocks.HONEY_BLOCK) {
                ci.setReturnValue(false);
            }
        }

        if (block2 == ModBlocks.SEA_JELLY_BLOCK) {
            if (block1 == Blocks.SLIME_BLOCK || block1 == Blocks.HONEY_BLOCK) {
                ci.setReturnValue(false);
            }
        }
    }

}
