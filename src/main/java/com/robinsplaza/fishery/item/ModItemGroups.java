package com.robinsplaza.fishery.item;

import com.robinsplaza.fishery.Fishery;
import com.robinsplaza.fishery.block.ModBlocks;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModItemGroups {
    public static final CreativeModeTab FISH_GROUP = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, Identifier.fromNamespaceAndPath(Fishery.MOD_ID, "fish"),
            FabricCreativeModeTab.builder().title(Component.translatable("itemgroup.fish"))
                    .icon(() -> new ItemStack(ModItems.LARGEMOUTH_BASS)).displayItems((displayContext, entries) -> {

                        entries.accept(ModItems.DRAGONFISH);
                        entries.accept(ModItems.VOIDSKIPPER);

                        entries.accept(ModItems.SOUL_LEECH);
                        entries.accept(ModItems.GHAST_BROOD);
                        entries.accept(ModItems.MAGMA_JELLYFISH);

                        entries.accept(ModItems.CRAYFISH);
                        entries.accept(ModItems.CRAB_CLAW);
                        entries.accept(ModItems.CATFISH);

                        entries.accept(ModItems.LEAFSKIMMER);
                        entries.accept(ModItems.BRANCH_EEL);
                        entries.accept(ModItems.WALLEYE);

                        entries.accept(ModItems.SALAMANDER);
                        entries.accept(ModItems.GHOSTFISH);
                        entries.accept(ModItems.PALE_BASS);
                        entries.accept(ModItems.SCULKAMANDER);
                        entries.accept(ModItems.ECHOFIN);

                        entries.accept(ModItems.LARGEMOUTH_BASS);
                        entries.accept(ModItems.BLUEGILL);

                        entries.accept(ModItems.TUNA);
                        entries.accept(ModItems.SUNFISH);
                        entries.accept(ModItems.RED_SNAPPER);
                        entries.accept(ModItems.ANGLERFISH);
                        entries.accept(ModItems.JELLYFISH);

                        entries.accept(ModItems.COOKED_FISH);
                        entries.accept(ModItems.COOKED_EEL);
                        entries.accept(ModItems.SASHIMI);
                        entries.accept(ModItems.JELLYFISH_JELLY);
                        entries.accept(ModBlocks.SEA_JELLY_BLOCK);

                        //entries.add(ModItems.NETHERITE_FISHING_ROD);

                        entries.accept(ModItems.NULLFIN);
                        entries.accept(ModItems.AERBAIA);
                        entries.accept(ModItems.AERSUCKER);


                    }).build());

    public static void registerItemGroups(){
        Fishery.LOGGER.info("Registering Item Groups for " + Fishery.MOD_ID);
    }
}
