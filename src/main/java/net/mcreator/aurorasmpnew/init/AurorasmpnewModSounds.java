
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.aurorasmpnew.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AurorasmpnewModSounds {
	public static Map<ResourceLocation, SoundEvent> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(new ResourceLocation("aurorasmpnew", "encyclopediaopen"), new SoundEvent(new ResourceLocation("aurorasmpnew", "encyclopediaopen")));
		REGISTRY.put(new ResourceLocation("aurorasmpnew", "encyclopediapage"), new SoundEvent(new ResourceLocation("aurorasmpnew", "encyclopediapage")));
		REGISTRY.put(new ResourceLocation("aurorasmpnew", "amoeba"), new SoundEvent(new ResourceLocation("aurorasmpnew", "amoeba")));
	}

	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
		for (Map.Entry<ResourceLocation, SoundEvent> sound : REGISTRY.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}
}
