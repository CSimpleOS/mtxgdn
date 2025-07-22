
package net.mcreator.mtxgdn.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class WhiteItem extends Item {
	public WhiteItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
