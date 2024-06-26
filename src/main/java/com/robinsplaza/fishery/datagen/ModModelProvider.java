package com.robinsplaza.fishery.datagen;

import com.robinsplaza.fishery.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.Items;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        //fish
        itemModelGenerator.register(ModItems.DRAGONFISH, Models.GENERATED);
        itemModelGenerator.register(ModItems.VOIDSKIPPER, Models.GENERATED);

        itemModelGenerator.register(ModItems.GHAST_BROOD, Models.GENERATED);
        itemModelGenerator.register(ModItems.SOUL_LEECH, Models.GENERATED);

        itemModelGenerator.register(ModItems.CRAYFISH, Models.GENERATED);
        itemModelGenerator.register(ModItems.CATFISH, Models.GENERATED);
        itemModelGenerator.register(ModItems.CRAB_CLAW, Models.GENERATED);

        itemModelGenerator.register(ModItems.SALAMANDER, Models.GENERATED);
        itemModelGenerator.register(ModItems.GHOSTFISH, Models.GENERATED);
        itemModelGenerator.register(ModItems.PALE_BASS, Models.GENERATED);
        itemModelGenerator.register(ModItems.ECHOFIN, Models.GENERATED);
        itemModelGenerator.register(ModItems.SCULKAMANDER, Models.GENERATED);

        itemModelGenerator.register(ModItems.LARGEMOUTH_BASS, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLUEGILL, Models.GENERATED);

        itemModelGenerator.register(ModItems.TUNA, Models.GENERATED);
        itemModelGenerator.register(ModItems.SUNFISH, Models.GENERATED);
        itemModelGenerator.register(ModItems.RED_SNAPPER, Models.GENERATED);
        itemModelGenerator.register(ModItems.ANGLERFISH, Models.GENERATED);
        itemModelGenerator.register(ModItems.JELLYFISH, Models.GENERATED);

        //food
        itemModelGenerator.register(ModItems.COOKED_FISH, Items.COOKED_COD, Models.GENERATED);
        itemModelGenerator.register(ModItems.JELLYFISH_JELLY, Models.GENERATED);

    }
}
