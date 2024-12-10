
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.aurorasmpnew.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.aurorasmpnew.block.AuroraDimensionPortalBlock;
import net.mcreator.aurorasmpnew.AurorasmpnewMod;

public class AurorasmpnewModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, AurorasmpnewMod.MODID);
	public static final RegistryObject<Block> AURORA_DIMENSION_PORTAL = REGISTRY.register("aurora_dimension_portal", () -> new AuroraDimensionPortalBlock());
}
