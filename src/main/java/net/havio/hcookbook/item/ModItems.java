package net.havio.hcookbook.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.havio.hcookbook.HavioCookbook;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item BOILED_EGG = registerItem("boiled_egg",
            new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4)
                    .saturationModifier(0.4f).build()).group(ItemGroup.FOOD)));

    public static final Item BOILED_TURTLE_EGG = registerItem("boiled_turtle_egg",
            new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6)
                    .saturationModifier(0.7f).build()).group(ItemGroup.FOOD)));

    //.statusEffect(new StatusEffectInstance(StatusEffects.,1,1),0.5f)
    public static final Item CACTUS_LEAF = registerItem("cactus_leaf",
            new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2)
                    .saturationModifier(0.6f).build()).group(ItemGroup.FOOD)));

    public static final Item COOKED_CACTUS_LEAF = registerItem("cooked_cactus_leaf",
            new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4)
                    .saturationModifier(0.6f).build()).group(ItemGroup.FOOD)));

    //MUSHROOM_STEW = register((String)"mushroom_stew", (Item)(new StewItem((new Item.Settings()).maxCount(1).group(ItemGroup.FOOD).food(FoodComponents.MUSHROOM_STEW))));
    public static final Item FUNGUS_STEW = registerItem("fungus_stew", (Item)(new StewItem(new Item.Settings()
            .maxCount(1).group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.7F).build()))));

    public static final Item MAGMA_COOKIE = registerItem("magma_cookie",
            new Item(new FabricItemSettings().fireproof().food(new FoodComponent.Builder().hunger(2)
                    .saturationModifier(0.6f).build()).group(ItemGroup.FOOD)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(HavioCookbook.MOD_ID, name), item);
    }

    public static void registerModItems(){
        HavioCookbook.LOGGER.debug("Registering Mod Items for" + HavioCookbook.MOD_ID);
    }
}
