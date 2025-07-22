
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mtxgdn.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.mtxgdn.MtxgdnMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MtxgdnModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MtxgdnMod.MODID);
	public static final RegistryObject<CreativeModeTab> BEDROCKTOOL = REGISTRY.register("bedrocktool",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.mtxgdn.bedrocktool")).icon(() -> new ItemStack(Blocks.BEDROCK)).displayItems((parameters, tabData) -> {
				tabData.accept(MtxgdnModItems.BEDROCK_ARMOR_HELMET.get());
				tabData.accept(MtxgdnModItems.BEDROCK_ARMOR_CHESTPLATE.get());
				tabData.accept(MtxgdnModItems.BEDROCK_ARMOR_LEGGINGS.get());
				tabData.accept(MtxgdnModItems.BEDROCK_ARMOR_BOOTS.get());
				tabData.accept(MtxgdnModItems.BEDROCK_AXE.get());
				tabData.accept(MtxgdnModItems.BEDROCK_PICKAXE.get());
				tabData.accept(MtxgdnModItems.BEDROCK_SWORD.get());
				tabData.accept(MtxgdnModItems.BEDROCK_SHOVEL.get());
				tabData.accept(MtxgdnModItems.BEDROCK_HOE.get());
			}).withSearchBar().build());
	public static final RegistryObject<CreativeModeTab> R = REGISTRY.register("r",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.mtxgdn.r")).icon(() -> new ItemStack(MtxgdnModItems.ONER.get())).displayItems((parameters, tabData) -> {
				tabData.accept(MtxgdnModItems.ONER.get());
				tabData.accept(MtxgdnModItems.FIVER.get());
				tabData.accept(MtxgdnModItems.TENR.get());
				tabData.accept(MtxgdnModItems.TWENTYR.get());
				tabData.accept(MtxgdnModItems.FIFTYR.get());
				tabData.accept(MtxgdnModItems.ONEHUNDREDR.get());
			}).withSearchBar().build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(MtxgdnModItems.STONEBALL.get());
		}
	}
}
