package com.robinsplaza.fishery;

import com.robinsplaza.fishery.block.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.*;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;

public class FisheryClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        //ChunkSectionLayerMap.putBlock(ModBlocks.SEA_JELLY_BLOCK, ChunkSectionLayer.TRANSLUCENT); no longer needed since alpha values in textures are just supported by anything now, thank you mojang :)
    }
}
