
package net.mcreator.mtxgdn.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class OnehundredrItem extends Item {
	public OnehundredrItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.COMMON));
	}
}
