
package net.mcreator.mtxgdn.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class OnerItem extends Item {
	public OnerItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.COMMON));
	}
}
