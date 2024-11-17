package com.robinsplaza.fishery.item;

import com.robinsplaza.fishery.Fishery;
import com.robinsplaza.fishery.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup FISH_GROUP = Registry.register(Registries.ITEM_GROUP, Identifier.of(Fishery.MOD_ID, "fish"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.fish"))
                    .icon(() -> new ItemStack(ModItems.LARGEMOUTH_BASS)).entries((displayContext, entries) -> {

                        entries.add(ModItems.DRAGONFISH);
                        entries.add(ModItems.VOIDSKIPPER);

                        entries.add(ModItems.SOUL_LEECH);
                        entries.add(ModItems.GHAST_BROOD);

                        entries.add(ModItems.CRAYFISH);
                        entries.add(ModItems.CRAB_CLAW);
                        entries.add(ModItems.CATFISH);

                        entries.add(ModItems.LEAFSKIMMER);
                        entries.add(ModItems.BRANCH_EEL);
                        entries.add(ModItems.WALLEYE);

                        entries.add(ModItems.SALAMANDER);
                        entries.add(ModItems.GHOSTFISH);
                        entries.add(ModItems.PALE_BASS);
                        entries.add(ModItems.SCULKAMANDER);
                        entries.add(ModItems.ECHOFIN);

                        entries.add(ModItems.LARGEMOUTH_BASS);
                        entries.add(ModItems.BLUEGILL);

                        entries.add(ModItems.TUNA);
                        entries.add(ModItems.SUNFISH);
                        entries.add(ModItems.RED_SNAPPER);
                        entries.add(ModItems.ANGLERFISH);
                        entries.add(ModItems.JELLYFISH);

                        entries.add(ModItems.COOKED_FISH);
                        entries.add(ModItems.COOKED_EEL);
                        entries.add(ModItems.JELLYFISH_JELLY);
                        entries.add(ModItems.SASHIMI);
                        entries.add(ModBlocks.SEA_JELLY_BLOCK);

                    }).build());

    public static void registerItemGroups(){
        Fishery.LOGGER.info("Registering Item Groups for " + Fishery.MOD_ID);
    }
}
