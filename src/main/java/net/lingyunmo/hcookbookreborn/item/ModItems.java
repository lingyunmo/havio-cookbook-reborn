package net.lingyunmo.hcookbookreborn.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.lingyunmo.hcookbookreborn.HavioCookbookReborn;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.Arrays;
import java.util.List;

public class ModItems {

    // 使用辅助方法简化物品注册 / Use helper methods to simplify item registration
    public static final Item BOILED_EGG = registerItem("boiled_egg", createFoodItem(4, 0.4f));
    public static final Item BOILED_TURTLE_EGG = registerItem("boiled_turtle_egg", createFoodItem(6, 0.7f));
    public static final Item CACTUS_LEAF = registerItem("cactus_leaf", createFoodItem(2, 0.6f));
    public static final Item COOKED_CACTUS_LEAF = registerItem("cooked_cactus_leaf", createFoodItem(4, 0.6f));
    public static final Item FUNGUS_STEW = registerItem("fungus_stew", createStewItem(4, 0.7f));
    public static final Item MAGMA_COOKIE = registerItem("magma_cookie", createFireproofFoodItem(1, 1f));
    public static final Item SEED_MIX = registerItem("seed_mix", createFoodItem(1, 2f, true));
    public static final Item SUGAR_COOKIE = registerItem("sugar_cookie", createFoodItem(3, 0.0f));

    // 辅助方法：创建食物物品 / Helper method: Create food item
    private static Item createFoodItem(int hunger, float saturationModifier) {
        return new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(hunger).
                saturationModifier(saturationModifier).build()));
    }

    // 辅助方法：创建带零食属性的食物物品 / Helper method: Create food item with snack attribute
    private static Item createFoodItem(int hunger, float saturationModifier, boolean snack) {
        return new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(hunger).
                saturationModifier(saturationModifier).snack().build()));
    }

    // 辅助方法：创建炽热食物物品（防火属性） / Helper method: Create fireproof food item
    private static Item createFireproofFoodItem(int hunger, float saturationModifier) {
        return new Item(new FabricItemSettings().fireproof().food(new FoodComponent.Builder().hunger(hunger).
                saturationModifier(saturationModifier).build()));
    }

    // 辅助方法：创建炖菜物品 / Helper method: Create stew item
    private static Item createStewItem(int hunger, float saturationModifier) {
        return new StewItem(new Item.Settings().maxCount(1).food(new FoodComponent.Builder().hunger(hunger).
                saturationModifier(saturationModifier).build()));
    }

    // 注册物品 / Register the item
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(HavioCookbookReborn.MOD_ID, name), item);
    }

    // 添加物品到物品组 / Add items to item groups
    private static void addItemstoItemGroups() {
        List<Item> items = Arrays.asList(
                BOILED_EGG, BOILED_TURTLE_EGG, CACTUS_LEAF, COOKED_CACTUS_LEAF, FUNGUS_STEW,
                MAGMA_COOKIE, SEED_MIX, SUGAR_COOKIE
        );
        items.forEach(item -> addToItemGroup(ModItemGroup.HavioCookbookRebornGroup, item));
    }

    // 添加单个物品到物品组 / Add a single item to an item group
    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void registerModItems() {
        HavioCookbookReborn.LOGGER.debug("Registering Mod Items for " + HavioCookbookReborn.MOD_ID);
        addItemstoItemGroups();
    }
}