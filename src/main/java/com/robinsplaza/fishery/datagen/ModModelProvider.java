package com.robinsplaza.fishery.datagen;

import com.ibm.icu.text.Normalizer2;
import com.robinsplaza.fishery.Fishery;
import com.robinsplaza.fishery.block.ModBlocks;
import com.robinsplaza.fishery.item.ModItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.*;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplate;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.data.models.model.TextureSlot;
import net.minecraft.resources.Identifier;
import java.util.Optional;

public class ModModelProvider extends FabricModelProvider {

    public ModModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockStateModelGenerator) {

        blockStateModelGenerator.createNonTemplateModelBlock(ModBlocks.SEA_JELLY_BLOCK);

    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator) {

        itemModelGenerator.generateFlatItem(ModItems.FILLET_KNIFE, ModelTemplates.FLAT_ITEM);

        //fish
        itemModelGenerator.generateFlatItem(ModItems.NULLFIN, FISH);

        itemModelGenerator.generateFlatItem(ModItems.DRAGONFISH, FISH);
        itemModelGenerator.generateFlatItem(ModItems.VOIDSKIPPER, FISH);

        itemModelGenerator.generateFlatItem(ModItems.GHAST_BROOD, FISH);
        itemModelGenerator.generateFlatItem(ModItems.SOUL_LEECH, FISH);
        itemModelGenerator.generateFlatItem(ModItems.MAGMA_JELLYFISH, FISH);

        itemModelGenerator.generateFlatItem(ModItems.WALLEYE, FISH);
        itemModelGenerator.generateFlatItem(ModItems.LEAFSKIMMER, FISH);
        itemModelGenerator.generateFlatItem(ModItems.BRANCH_EEL, FISH);

        itemModelGenerator.generateFlatItem(ModItems.CRAYFISH, FISH);
        itemModelGenerator.generateFlatItem(ModItems.CATFISH, FISH);
        itemModelGenerator.generateFlatItem(ModItems.CRAB_CLAW, FISH);

        itemModelGenerator.generateFlatItem(ModItems.SALAMANDER, FISH);
        itemModelGenerator.generateFlatItem(ModItems.GHOSTFISH, FISH);
        itemModelGenerator.generateFlatItem(ModItems.PALE_BASS, FISH);
        itemModelGenerator.generateFlatItem(ModItems.ECHOFIN, FISH);
        itemModelGenerator.generateFlatItem(ModItems.SCULKAMANDER, FISH);

        itemModelGenerator.generateFlatItem(ModItems.LARGEMOUTH_BASS, FISH);
        itemModelGenerator.generateFlatItem(ModItems.BLUEGILL, FISH);

        itemModelGenerator.generateFlatItem(ModItems.TUNA, FISH);
        itemModelGenerator.generateFlatItem(ModItems.SUNFISH, FISH);
        itemModelGenerator.generateFlatItem(ModItems.RED_SNAPPER, FISH);
        itemModelGenerator.generateFlatItem(ModItems.ANGLERFISH, FISH);
        itemModelGenerator.generateFlatItem(ModItems.JELLYFISH, FISH);

        //food
        itemModelGenerator.generateFlatItem(ModItems.COOKED_FISH, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.COOKED_EEL, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.JELLYFISH_JELLY, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.SASHIMI, ModelTemplates.FLAT_ITEM);

        //mod compat items
        //aether
        itemModelGenerator.generateFlatItem(ModItems.AERBAIA, FISH);
        itemModelGenerator.generateFlatItem(ModItems.AERSUCKER, FISH);

    }

    private static ModelTemplate item(String parent, TextureSlot... requiredTextureKeys) {
        return new ModelTemplate(Optional.of(Identifier.fromNamespaceAndPath(Fishery.MOD_ID, "item/" + parent)), Optional.empty(), requiredTextureKeys);
    }

    public static final ModelTemplate FISH = item("fish", TextureSlot.LAYER0);
}