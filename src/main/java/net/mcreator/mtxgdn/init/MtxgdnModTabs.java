
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mtxgdn.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.mtxgdn.MtxgdnMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MtxgdnModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MtxgdnMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(MtxgdnModItems.STONEBALL.get());
			tabData.accept(MtxgdnModItems.BEDROCK_SWORD.get());
			tabData.accept(MtxgdnModItems.BEDROCK_ARMOR_HELMET.get());
			tabData.accept(MtxgdnModItems.BEDROCK_ARMOR_CHESTPLATE.get());
			tabData.accept(MtxgdnModItems.BEDROCK_ARMOR_LEGGINGS.get());
			tabData.accept(MtxgdnModItems.BEDROCK_ARMOR_BOOTS.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(MtxgdnModItems.BEDROCK_AXE.get());
			tabData.accept(MtxgdnModItems.BEDROCK_PICKAXE.get());
			tabData.accept(MtxgdnModItems.BEDROCK_SHOVEL.get());
			tabData.accept(MtxgdnModItems.BEDROCK_HOE.get());
		}
	}
}
