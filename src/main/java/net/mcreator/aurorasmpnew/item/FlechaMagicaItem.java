
package net.mcreator.aurorasmpnew.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.aurorasmpnew.init.AurorasmpnewModTabs;

import java.util.List;

public class FlechaMagicaItem extends Item {
	public FlechaMagicaItem() {
		super(new Item.Properties().tab(AurorasmpnewModTabs.TAB_AURORA_ITENS).stacksTo(64).fireResistant().rarity(Rarity.EPIC));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("\u00A76\u00A7lUm item de caracter SUPERIOR"));
	}
}
