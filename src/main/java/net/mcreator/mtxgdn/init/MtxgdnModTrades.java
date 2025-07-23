
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.mtxgdn.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerProfession;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class MtxgdnModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == VillagerProfession.TOOLSMITH) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 5),

					new ItemStack(MtxgdnModItems.DIMENSION_DIRT.get()), 100, 100, 0f));
		}
		if (event.getType() == VillagerProfession.TOOLSMITH) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 10),

					new ItemStack(MtxgdnModItems.DIMENSION_COBBLESTONE.get()), 100, 100, 0f));
		}
		if (event.getType() == VillagerProfession.TOOLSMITH) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 10), new ItemStack(MtxgdnModItems.TO_TNT_LOCK.get()), new ItemStack(MtxgdnModItems.DIMENSION_TNT.get()), 100, 100, 0f));
		}
	}
}
