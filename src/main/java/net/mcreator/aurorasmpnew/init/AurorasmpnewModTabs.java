
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.aurorasmpnew.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class AurorasmpnewModTabs {
	public static CreativeModeTab TAB_AURORA_ITENS;

	public static void load() {
		TAB_AURORA_ITENS = new CreativeModeTab("tabaurora_itens") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(AurorasmpnewModItems.DELETED_MOD_ELEMENT.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
