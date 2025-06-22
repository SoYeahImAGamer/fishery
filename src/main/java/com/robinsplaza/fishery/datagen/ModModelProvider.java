package com.robinsplaza.fishery.datagen;

import com.ibm.icu.text.Normalizer2;
import com.robinsplaza.fishery.Fishery;
import com.robinsplaza.fishery.block.ModBlocks;
import com.robinsplaza.fishery.item.ModItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.*;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

import java.util.Optional;

public class ModModelProvider extends FabricModelProvider {

    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        blockStateModelGenerator.registerSimpleState(ModBlocks.SEA_JELLY_BLOCK);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.register(ModItems.FILLET_KNIFE, Models.GENERATED);

        //fish
        itemModelGenerator.register(ModItems.NULLFIN, FISH);

        itemModelGenerator.register(ModItems.DRAGONFISH, FISH);
        itemModelGenerator.register(ModItems.VOIDSKIPPER, FISH);

        itemModelGenerator.register(ModItems.GHAST_BROOD, FISH);
        itemModelGenerator.register(ModItems.SOUL_LEECH, FISH);

        itemModelGenerator.register(ModItems.WALLEYE, FISH);
        itemModelGenerator.register(ModItems.LEAFSKIMMER, FISH);
        itemModelGenerator.register(ModItems.BRANCH_EEL, FISH);

        itemModelGenerator.register(ModItems.CRAYFISH, FISH);
        itemModelGenerator.register(ModItems.CATFISH, FISH);
        itemModelGenerator.register(ModItems.CRAB_CLAW, FISH);

        itemModelGenerator.register(ModItems.SALAMANDER, FISH);
        itemModelGenerator.register(ModItems.GHOSTFISH, FISH);
        itemModelGenerator.register(ModItems.PALE_BASS, FISH);
        itemModelGenerator.register(ModItems.ECHOFIN, FISH);
        itemModelGenerator.register(ModItems.SCULKAMANDER, FISH);

        itemModelGenerator.register(ModItems.LARGEMOUTH_BASS, FISH);
        itemModelGenerator.register(ModItems.BLUEGILL, FISH);

        itemModelGenerator.register(ModItems.TUNA, FISH);
        itemModelGenerator.register(ModItems.SUNFISH, FISH);
        itemModelGenerator.register(ModItems.RED_SNAPPER, FISH);
        itemModelGenerator.register(ModItems.ANGLERFISH, FISH);
        itemModelGenerator.register(ModItems.JELLYFISH, FISH);

        //food
        itemModelGenerator.register(ModItems.COOKED_FISH, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_EEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.JELLYFISH_JELLY, Models.GENERATED);
        itemModelGenerator.register(ModItems.SASHIMI, Models.GENERATED);

        //mod compat items
        //aether
        itemModelGenerator.register(ModItems.AERBAIA, FISH);
        itemModelGenerator.register(ModItems.AERSUCKER, FISH);

    }

    private static Model item(String parent, TextureKey... requiredTextureKeys) {
        return new Model(Optional.of(Identifier.of(Fishery.MOD_ID, "item/" + parent)), Optional.empty(), requiredTextureKeys);
    }

    public static final Model FISH = item("fish", TextureKey.LAYER0);
}