package net.piox.Main.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.piox.Main.musicdisc;



public class ModItems {
    public static final Item ARIA_MATH_MUSIC_DISC = registerItem(
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(net.piox.Main.sound.ModSounds.MUSIC_DISC_ARIA_MATH_KEY)));


    private static Item registerItem(Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(musicdisc.MOD_ID, "aria_math_music_disc"), item);
    }

    public static void registerModItems() {
        musicdisc.LOGGER.info("Registering Mod Items for " + musicdisc.MOD_ID);
    }
}
