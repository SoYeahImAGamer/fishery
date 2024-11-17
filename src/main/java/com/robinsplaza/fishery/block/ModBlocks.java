package com.robinsplaza.fishery.block;

import com.robinsplaza.fishery.Fishery;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.HoneyBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block SEA_JELLY_BLOCK = registerBlock("sea_jelly_block",
            new SeaJellyBlock(AbstractBlock.Settings.copy(Blocks.HONEY_BLOCK).nonOpaque().blockVision(Blocks::never)));

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Fishery.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, Identifier.of(Fishery.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }
    public static void registerModBlocks(){
        Fishery.LOGGER.info("Registering blocks for " + Fishery.MOD_ID);
    }
}
