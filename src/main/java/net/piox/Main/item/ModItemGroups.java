package net.piox.Main.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.piox.Main.musicdisc;

public class ModItemGroups {
    public static final ItemGroup ROBLOX_DOORS_MUSIC_DISCS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(musicdisc.MOD_ID, "aria_math"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.ARIA_MATH_MUSIC_DISC))
                    .displayName(Text.translatable("itemgroup.musicdisc.aria_math"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.ARIA_MATH_MUSIC_DISC);
                    })
                    .build());

    public static void registerItemGroups() {
        musicdisc.LOGGER.info("Registering Item Groups for " +musicdisc.MOD_ID);
    }
}
