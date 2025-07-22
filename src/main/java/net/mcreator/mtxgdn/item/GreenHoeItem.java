
package net.mcreator.mtxgdn.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

import net.mcreator.mtxgdn.init.MtxgdnModItems;

public class GreenHoeItem extends HoeItem {
	public GreenHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 4595;
			}

			public float getSpeed() {
				return 21f;
			}

			public float getAttackDamageBonus() {
				return 14f;
			}

			public int getLevel() {
				return 16;
			}

			public int getEnchantmentValue() {
				return 112;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(MtxgdnModItems.GREEN.get()));
			}
		}, 0, -3f, new Item.Properties());
	}
}
