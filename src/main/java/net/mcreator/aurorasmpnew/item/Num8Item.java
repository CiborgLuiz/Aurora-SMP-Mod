
package net.mcreator.aurorasmpnew.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Item;

import net.mcreator.aurorasmpnew.init.AurorasmpnewModTabs;

public class Num8Item extends SwordItem {
	public Num8Item() {
		super(new Tier() {
			public int getUses() {
				return 0;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 11f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 3, -2.2f, new Item.Properties().tab(AurorasmpnewModTabs.TAB_AURORA_ITENS).fireResistant());
	}
}
