
package net.mcreator.mtxgdn.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class RedItem extends Item {
	public RedItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
