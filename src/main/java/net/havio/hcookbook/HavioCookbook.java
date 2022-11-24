package net.havio.hcookbook;

import net.fabricmc.api.ModInitializer;
import net.havio.hcookbook.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HavioCookbook implements ModInitializer {

	public static final String MOD_ID = "hcookbook";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}
