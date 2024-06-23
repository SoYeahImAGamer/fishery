package com.robinsplaza.fishery.datagen;

import com.robinsplaza.fishery.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        getOrCreateTagBuilder(ItemTags.FISHES)
                .add(ModItems.ANGLERFISH)
                .add(ModItems.BLUEGILL)
                .add(ModItems.CATFISH)
                .add(ModItems.CRAB_CLAW)
                .add(ModItems.CRAYFISH)
                .add(ModItems.DRAGONFISH)
                .add(ModItems.ECHOFIN)
                .add(ModItems.GHAST_BROOD)
                .add(ModItems.GHOSTFISH)
                .add(ModItems.JELLYFISH)
                .add(ModItems.LARGEMOUTH_BASS)
                .add(ModItems.PALE_BASS)
                .add(ModItems.RED_SNAPPER)
                .add(ModItems.SALAMANDER)
                .add(ModItems.SCULKAMANDER)
                .add(ModItems.SOUL_LEECH)
                .add(ModItems.SUNFISH)
                .add(ModItems.TUNA)
                .add(ModItems.VOIDSKIPPER);

    }
}
