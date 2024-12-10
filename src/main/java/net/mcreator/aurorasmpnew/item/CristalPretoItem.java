
package net.mcreator.aurorasmpnew.item;

import top.theillusivec4.curios.api.type.capability.ICurioItem;
import top.theillusivec4.curios.api.SlotContext;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.monster.EnderMan;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.aurorasmpnew.procedures.CristalPretoWhileBaubleIsEquippedTickProcedure;
import net.mcreator.aurorasmpnew.procedures.CristalPretoBaubleIsUnequippedProcedure;
import net.mcreator.aurorasmpnew.procedures.CristalPretoBaubleIsEquippedProcedure;
import net.mcreator.aurorasmpnew.init.AurorasmpnewModTabs;

import java.util.List;

public class CristalPretoItem extends Item implements ICurioItem {
	public CristalPretoItem() {
		super(new Item.Properties().tab(AurorasmpnewModTabs.TAB_AURORA_ITENS).stacksTo(1).fireResistant().rarity(Rarity.EPIC));
	}

	@Override
	public boolean makesPiglinsNeutral(SlotContext slotContext, ItemStack stack) {
		return true;
	}

	@Override
	public boolean isEnderMask(SlotContext slotContext, EnderMan enderMan, ItemStack stack) {
		return true;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("\u00A76\u00A7lUm item de caracter SUPERIOR"));
	}

	@Override
	public void curioTick(SlotContext slotContext, ItemStack stack) {
		CristalPretoWhileBaubleIsEquippedTickProcedure.execute(slotContext.entity());
	}

	@Override
	public void onEquip(SlotContext slotContext, ItemStack prevStack, ItemStack stack) {
		CristalPretoBaubleIsEquippedProcedure.execute(slotContext.entity());
	}

	@Override
	public void onUnequip(SlotContext slotContext, ItemStack newStack, ItemStack stack) {
		CristalPretoBaubleIsUnequippedProcedure.execute(slotContext.entity());
	}
}
