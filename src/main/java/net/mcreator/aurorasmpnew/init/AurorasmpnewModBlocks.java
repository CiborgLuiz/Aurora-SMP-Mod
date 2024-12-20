
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.aurorasmpnew.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.aurorasmpnew.block.AuroraDimensionPortalBlock;
import net.mcreator.aurorasmpnew.block.AuroraBlockBlock;
import net.mcreator.aurorasmpnew.AurorasmpnewMod;

public class AurorasmpnewModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, AurorasmpnewMod.MODID);
	public static final RegistryObject<Block> AURORA_BLOCK = REGISTRY.register("aurora_block", () -> new AuroraBlockBlock());
	public static final RegistryObject<Block> AURORA_DIMENSION_PORTAL = REGISTRY.register("aurora_dimension_portal", () -> new AuroraDimensionPortalBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			AuroraBlockBlock.registerRenderLayer();
			AuroraDimensionPortalBlock.registerRenderLayer();
		}
	}
}
