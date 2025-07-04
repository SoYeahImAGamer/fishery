package com.robinsplaza.fishery.datagen;

import com.robinsplaza.fishery.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    private static final TagKey<Item> FISH = TagKey.of(RegistryKeys.ITEM, Identifier.of("fishery:fish"));
    private static final TagKey<Item> SHELLFISH = TagKey.of(RegistryKeys.ITEM, Identifier.of("fishery:shellfish"));
    private static final TagKey<Item> SASHIMIFISH = TagKey.of(RegistryKeys.ITEM, Identifier.of("fishery:sashimifish"));
    private static final TagKey<Item> EELS = TagKey.of(RegistryKeys.ITEM, Identifier.of("fishery:eels"));
    private static final TagKey<Item> JELLYFISH = TagKey.of(RegistryKeys.ITEM, Identifier.of("fishery:jellyfish"));


    private static final TagKey<Item> CFISH = TagKey.of(RegistryKeys.ITEM, Identifier.of("c:fish"));
    private static final TagKey<Item> RAW_FISH = TagKey.of(RegistryKeys.ITEM, Identifier.of("c:foods/raw_fish"));
    private static final TagKey<Item> KNIVES = TagKey.of(RegistryKeys.ITEM, Identifier.of("c:tools/knives"));
    private static final TagKey<Item> TOOLS = TagKey.of(RegistryKeys.ITEM, Identifier.of("c:tools"));

    private static final TagKey<Item> CAT_FOOD = TagKey.of(RegistryKeys.ITEM, Identifier.of("minecraft:cat_food"));

    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        valueLookupBuilder(KNIVES)
                .add(ModItems.FILLET_KNIFE);

        valueLookupBuilder(ItemTags.FISHES)
                .add(ModItems.NULLFIN)
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
                .add(ModItems.VOIDSKIPPER)
                .add(ModItems.WALLEYE)
                .add(ModItems.LEAFSKIMMER)
                .add(ModItems.BRANCH_EEL)
                .add(ModItems.AERBAIA)
                .add(ModItems.AERSUCKER);

        valueLookupBuilder(CFISH)
                .addTag(ItemTags.FISHES);

        valueLookupBuilder(RAW_FISH)
                .add(ModItems.SASHIMI)
                .addTag(ItemTags.FISHES);

        valueLookupBuilder(FISH)
                .add(ModItems.NULLFIN)
                .add(ModItems.ANGLERFISH)
                .add(ModItems.BLUEGILL)
                .add(ModItems.CATFISH)
                .add(ModItems.ECHOFIN)
                .add(ModItems.GHOSTFISH)
                .add(ModItems.LARGEMOUTH_BASS)
                .add(ModItems.PALE_BASS)
                .add(ModItems.RED_SNAPPER)
                .add(ModItems.SUNFISH)
                .add(ModItems.TUNA)
                .add(ModItems.VOIDSKIPPER)
                .add(Items.SALMON)
                .add(Items.COD)
                .add(Items.TROPICAL_FISH)
                .add(ModItems.WALLEYE)
                .add(ModItems.LEAFSKIMMER)
                .add(ModItems.AERSUCKER);

        valueLookupBuilder(EELS)
                .add(ModItems.BRANCH_EEL)
                .add(ModItems.DRAGONFISH)
                .add(ModItems.SALAMANDER)
                .add(ModItems.SCULKAMANDER)
                .add(ModItems.AERBAIA);

        valueLookupBuilder(SHELLFISH)
                .add(ModItems.CRAB_CLAW)
                .add(ModItems.CRAYFISH);

        valueLookupBuilder(SASHIMIFISH)
                .add(ModItems.NULLFIN)
                .add(ModItems.RED_SNAPPER)
                .add(ModItems.TUNA)
                .add(Items.SALMON)
                .add(ModItems.DRAGONFISH);

        valueLookupBuilder(CAT_FOOD)
                .addTag(SASHIMIFISH)
                .add(ModItems.CATFISH)
                .add(ModItems.BLUEGILL)
                .add(ModItems.WALLEYE)
                .add(ModItems.LEAFSKIMMER)
                .add(ModItems.LARGEMOUTH_BASS)
                .add(ModItems.PALE_BASS)
                .add(ModItems.AERSUCKER)
                .add(ModItems.GHOSTFISH);

        valueLookupBuilder(JELLYFISH)
                .add(ModItems.JELLYFISH)
                .add(ModItems.MAGMA_JELLYFISH);

    }
}
