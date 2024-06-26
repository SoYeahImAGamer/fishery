package com.robinsplaza.fishery.item;

import com.robinsplaza.fishery.Fishery;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    //end fish
    public static final Item DRAGONFISH = (Item) registerItem("dragonfish",
            new Item(new Item.Settings().food(ModFoodComponents.RAW_FISH)));
    public static final Item VOIDSKIPPER = (Item) registerItem("voidskipper",
            new Item(new Item.Settings().food(ModFoodComponents.RAW_FISH)));

    //nether fish
    public static final Item GHAST_BROOD = (Item) registerItem("ghast_brood",
            new Item(new Item.Settings().food(ModFoodComponents.RAW_FISH)));
    public static final Item SOUL_LEECH = (Item) registerItem("soul_leech",
            new Item(new Item.Settings().food(ModFoodComponents.TOXIC_FISH)));

    //overworld fish
        //bog fish
    public static final Item CRAYFISH = (Item) registerItem("crayfish",
            new Item(new Item.Settings().food(ModFoodComponents.RAW_FISH)));
    public static final Item CATFISH = (Item) registerItem("catfish",
            new Item(new Item.Settings().food(ModFoodComponents.RAW_FISH)));
    public static final Item CRAB_CLAW = (Item) registerItem("crab_claw",
            new Item(new Item.Settings().food(ModFoodComponents.RAW_FISH)));

        //cave fish
    public static final Item SALAMANDER = (Item) registerItem("salamander",
            new Item(new Item.Settings().food(ModFoodComponents.RAW_FISH)));
    public static final Item GHOSTFISH = (Item) registerItem("ghostfish",
            new Item(new Item.Settings().food(ModFoodComponents.RAW_FISH)));
    public static final Item PALE_BASS = (Item) registerItem("pale_bass",
            new Item(new Item.Settings().food(ModFoodComponents.RAW_FISH)));
    public static final Item ECHOFIN = (Item) registerItem("echofin",
            new Item(new Item.Settings().food(ModFoodComponents.RAW_FISH)));
    public static final Item SCULKAMANDER = (Item) registerItem("sculkamander",
            new Item(new Item.Settings().food(ModFoodComponents.RAW_FISH)));

        //freshwater fish
    public static final Item LARGEMOUTH_BASS = (Item) registerItem("largemouth_bass",
            new Item(new Item.Settings().food(ModFoodComponents.RAW_FISH)));
    public static final Item BLUEGILL = (Item) registerItem("bluegill",
            new Item(new Item.Settings().food(ModFoodComponents.RAW_FISH)));

        //saltwater fish
    public static final Item TUNA = (Item) registerItem("tuna",
            new Item(new Item.Settings().food(ModFoodComponents.RAW_FISH)));
    public static final Item SUNFISH = (Item) registerItem("sunfish",
            new Item(new Item.Settings().food(ModFoodComponents.RAW_FISH)));
    public static final Item RED_SNAPPER = (Item) registerItem("red_snapper",
            new Item(new Item.Settings().food(ModFoodComponents.RAW_FISH)));
    public static final Item ANGLERFISH = (Item) registerItem("anglerfish",
            new Item(new Item.Settings().food(ModFoodComponents.RAW_FISH)));
    public static final Item JELLYFISH = (Item) registerItem("jellyfish",
            new Item(new Item.Settings().food(ModFoodComponents.TOXIC_FISH)));

    //food stuff
    public static final Item COOKED_FISH = (Item) registerItem("cooked_fish",
            new Item(new Item.Settings().food(ModFoodComponents.COOKED_FISH)));
    public static final Item JELLYFISH_JELLY = (Item) registerItem("jellyfish_jelly",
            new Item(new Item.Settings().food(ModFoodComponents.JELLY)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(Fishery.MOD_ID, name), item);
    }

    public static void registerModItems(){
        Fishery.LOGGER.info("Registering mod items for " + Fishery.MOD_ID);

        //ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
