package net.lingyunmo.hcookbookreborn.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.lingyunmo.hcookbookreborn.HavioCookbookReborn;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static ItemGroup HavioCookbookRebornGroup = FabricItemGroup.builder(new Identifier(HavioCookbookReborn.MOD_ID, "sugar_cookie"))
            .displayName(Text.translatable("hcookbookreborn"))
            .icon(() -> new ItemStack(ModItems.SUGAR_COOKIE))
            .build();

    public static void registerModItemGroup() {
        HavioCookbookReborn.LOGGER.debug("Registering mod item group for" + HavioCookbookReborn.MOD_ID);
    }

}
