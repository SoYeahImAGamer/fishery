package com.robinsplaza.fishery.datagen;

import com.robinsplaza.fishery.block.ModBlocks;
import com.robinsplaza.fishery.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.GlassBottleItem;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagEntry;
import net.minecraft.registry.tag.TagFile;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {

    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.JELLYFISH_JELLY, 1)
                .input(ModItems.JELLYFISH)
                .input(Items.SUGAR)
                .input(Items.GLASS_BOTTLE)
                .criterion(hasItem(ModItems.JELLYFISH), conditionsFromItem(ModItems.JELLYFISH))
                .offerTo(exporter, Identifier.of("jellyfish_jelly"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.JELLYFISH_JELLY, 4)
                .input(ModBlocks.SEA_JELLY_BLOCK)
                .input(Items.GLASS_BOTTLE)
                .input(Items.GLASS_BOTTLE)
                .input(Items.GLASS_BOTTLE)
                .input(Items.GLASS_BOTTLE)
                .criterion(hasItem(ModBlocks.SEA_JELLY_BLOCK), conditionsFromItem(ModBlocks.SEA_JELLY_BLOCK))
                .offerTo(exporter, Identifier.of("jellyfish_jelly_from_block"));


        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.SEA_JELLY_BLOCK, 1)
                .input('#', ModItems.JELLYFISH_JELLY)
                .pattern("##")
                .pattern("##")
                .criterion(hasItem(ModItems.JELLYFISH_JELLY), conditionsFromItem(ModItems.JELLYFISH_JELLY))
                .offerTo(exporter, Identifier.of("sea_jelly_block"));

    }
}
