package net.piox.Main.sound;

import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.registry.*;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.piox.Main.musicdisc;

public class ModSounds {
    public static RegistryEntry.Reference<SoundEvent> ARIA_MATH_MUSIC_DISC = registerReference("music_disc.aria_math");
    public static RegistryKey<JukeboxSong> MUSIC_DISC_ARIA_MATH_KEY = registerJukeboxSong("music_disc.aria_math");

    public static RegistryKey<JukeboxSong> registerJukeboxSong(String name) {
        return RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(musicdisc.MOD_ID, name));
    }

    public static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.of(musicdisc.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static RegistryEntry.Reference<SoundEvent> registerReference(String name) {
        Identifier id = Identifier.of(musicdisc.MOD_ID, name);
        return Registry.registerReference(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        musicdisc.LOGGER.info("Registering Sounds for " + musicdisc.MOD_ID);
    }
}
