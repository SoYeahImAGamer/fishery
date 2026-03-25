package com.robinsplaza.fishery.block;

import com.robinsplaza.fishery.Fishery;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class ModBlocks {

    public static final Block SEA_JELLY_BLOCK = registerBlock("sea_jelly_block",
            new SeaJellyBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.HONEY_BLOCK).noOcclusion().isViewBlocking(Blocks::never)
                    .setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(Fishery.MOD_ID, "sea_jelly_block")))));

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Fishery.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(Fishery.MOD_ID, name),
                new BlockItem(block, new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Fishery.MOD_ID, name)))));
    }
    public static void registerModBlocks(){
        Fishery.LOGGER.info("Registering blocks for " + Fishery.MOD_ID);
    }
}
