package net.mcreator.aurorasmpnew.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.aurorasmpnew.item.LivroQuePrevePassadoItem;

public class LivroQuePrevePassadoRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, ItemStack itemstack) {
		if (itemstack.getItem() instanceof LivroQuePrevePassadoItem)
			itemstack.getOrCreateTag().putString("geckoAnim", "livro");
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("aurorasmpnew:encyclopediaopen")), SoundSource.MASTER, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("aurorasmpnew:encyclopediaopen")), SoundSource.MASTER, 1, 1, false);
			}
		}
	}
}
