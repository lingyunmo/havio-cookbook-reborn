package net.havio.hcookbook.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.havio.hcookbook.HavioCookbook;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item BOILED_EGG = registerItem("boiled_egg",
            new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4)
                    .saturationModifier(0.4f).build())));

    public static final Item BOILED_TURTLE_EGG = registerItem("boiled_turtle_egg",
            new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6)
                    .saturationModifier(0.7f).build())));

    //.statusEffect(new StatusEffectInstance(StatusEffects.,1,1),0.5f)
    public static final Item CACTUS_LEAF = registerItem("cactus_leaf",
            new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2)
                    .saturationModifier(0.6f).build())));

    public static final Item COOKED_CACTUS_LEAF = registerItem("cooked_cactus_leaf",
            new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4)
                    .saturationModifier(0.6f).build())));

    //MUSHROOM_STEW = register((String)"mushroom_stew", (Item)(new StewItem((new Item.Settings()).maxCount(1).group(ItemGroup.FOOD).food(FoodComponents.MUSHROOM_STEW))));
    public static final Item FUNGUS_STEW = registerItem("fungus_stew", (Item)(new StewItem(new Item.Settings()
            .maxCount(1).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.7F).build()))));

    public static final Item MAGMA_COOKIE = registerItem("magma_cookie",
            new Item(new FabricItemSettings().fireproof().food(new FoodComponent.Builder().hunger(1)
                    .saturationModifier(1f).build())));

    public static final Item SEED_MIX = registerItem("seed_mix",
            new Item(new FabricItemSettings().food(new FoodComponent.Builder().snack().hunger(1)
                    .saturationModifier(2f).build())));

    public static final Item SUGAR_COOKIE = registerItem("sugar_cookie",
            new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3)
                    .saturationModifier(0.0f).build())));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(HavioCookbook.MOD_ID, name), item);
    }

    public static void addItemstoItemGroups(){
        addToItemGroup(ItemGroups.FOOD_AND_DRINK, BOILED_EGG );
        addToItemGroup(ItemGroups.FOOD_AND_DRINK, BOILED_TURTLE_EGG );
        addToItemGroup(ItemGroups.FOOD_AND_DRINK, CACTUS_LEAF );
        addToItemGroup(ItemGroups.FOOD_AND_DRINK, COOKED_CACTUS_LEAF );
        addToItemGroup(ItemGroups.FOOD_AND_DRINK, FUNGUS_STEW );
        addToItemGroup(ItemGroups.FOOD_AND_DRINK, MAGMA_COOKIE );
        addToItemGroup(ItemGroups.FOOD_AND_DRINK, SEED_MIX );
        addToItemGroup(ItemGroups.FOOD_AND_DRINK, SUGAR_COOKIE );
    }

    public static void addToItemGroup (ItemGroup group, Item item){
        ItemGroupEvents.modifyEntriesEvent(group).register(entries ->
                entries.add(item));
    }

    public static void registerModItems(){
        HavioCookbook.LOGGER.debug("Registering Mod Items for" + HavioCookbook.MOD_ID);
        addItemstoItemGroups();
    }
}
