package net.havio.magmacookies;

import net.fabricmc.api.ModInitializer;
import net.havio.magmacookies.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MagmaCookies implements ModInitializer {

	public static final String MOD_ID = "magmacookies";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}
