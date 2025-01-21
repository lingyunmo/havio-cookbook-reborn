package net.lingyunmo.hcookbookreborn;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.lingyunmo.hcookbookreborn.item.ModItemGroup;
import net.lingyunmo.hcookbookreborn.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HavioCookbookReborn implements ModInitializer {
    public static final String MOD_ID = "hcookbookreborn";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItemGroup.registerModItemGroup();
        ModItems.registerModItems();

        CompostingChanceRegistry.INSTANCE.add(ModItems.BOILED_EGG, 0.7f);
        CompostingChanceRegistry.INSTANCE.add(ModItems.BOILED_TURTLE_EGG, 0.7f);
        CompostingChanceRegistry.INSTANCE.add(ModItems.CACTUS_LEAF, 0.2f);
        CompostingChanceRegistry.INSTANCE.add(ModItems.COOKED_CACTUS_LEAF, 0.3f);
        CompostingChanceRegistry.INSTANCE.add(ModItems.MAGMA_COOKIE, 0.5f);
        CompostingChanceRegistry.INSTANCE.add(ModItems.SEED_MIX, 0.4f);
        CompostingChanceRegistry.INSTANCE.add(ModItems.SUGAR_COOKIE, 0.2f);
    }
}
