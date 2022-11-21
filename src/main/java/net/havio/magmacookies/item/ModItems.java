package net.havio.magmacookies.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.havio.magmacookies.MagmaCookies;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item MAGMA_COOKIE = registerItem("magma_cookie",
            new Item(new FabricItemSettings().fireproof().food(new FoodComponent.Builder().hunger(2)
                    .saturationModifier(0.6f).build()).group(ItemGroup.FOOD)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(MagmaCookies.MOD_ID, name), item);
    }

    public static void registerModItems(){
        MagmaCookies.LOGGER.debug("Registering Mod Items for" + MagmaCookies.MOD_ID);
    }
}
