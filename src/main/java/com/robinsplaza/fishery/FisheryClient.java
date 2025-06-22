package com.robinsplaza.fishery;

import com.robinsplaza.fishery.block.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap;
import net.minecraft.client.render.BlockRenderLayer;

public class FisheryClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.putBlock(ModBlocks.SEA_JELLY_BLOCK, BlockRenderLayer.TRANSLUCENT);
    }
}
