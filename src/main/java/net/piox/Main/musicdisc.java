package net.piox.Main;

import net.fabricmc.api.ModInitializer;

import net.piox.Main.item.ModItemGroups;
import net.piox.Main.item.ModItems;
import net.piox.Main.sound.ModSounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class musicdisc implements ModInitializer {
	public static final String MOD_ID = "musicdisc";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModSounds.registerSounds();
		ModItemGroups.registerItemGroups();
	}
}