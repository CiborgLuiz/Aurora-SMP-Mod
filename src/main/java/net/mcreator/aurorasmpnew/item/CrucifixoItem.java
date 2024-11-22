
package net.mcreator.aurorasmpnew.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.aurorasmpnew.procedures.CrucifixoRightclickedProcedure;
import net.mcreator.aurorasmpnew.init.AurorasmpnewModTabs;

import java.util.List;

public class CrucifixoItem extends Item {
	public CrucifixoItem() {
		super(new Item.Properties().tab(AurorasmpnewModTabs.TAB_AURORA_ITENS).stacksTo(1).fireResistant().rarity(Rarity.EPIC));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.BLOCK;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("\u00A76\u00A7lUm item de caracter inferior"));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		CrucifixoRightclickedProcedure.execute(world, x, y, z, entity);
		return ar;
	}
}
