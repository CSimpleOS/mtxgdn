
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mtxgdn.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.mtxgdn.client.gui.JieziPlatformGUIScreen;
import net.mcreator.mtxgdn.client.gui.BigBoxGuiScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MtxgdnModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(MtxgdnModMenus.BIG_BOX_GUI.get(), BigBoxGuiScreen::new);
			MenuScreens.register(MtxgdnModMenus.JIEZI_PLATFORM_GUI.get(), JieziPlatformGUIScreen::new);
		});
	}
}
