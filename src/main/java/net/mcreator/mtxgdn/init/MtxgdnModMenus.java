
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mtxgdn.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.mtxgdn.world.inventory.BigBoxGuiMenu;
import net.mcreator.mtxgdn.MtxgdnMod;

public class MtxgdnModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, MtxgdnMod.MODID);
	public static final RegistryObject<MenuType<BigBoxGuiMenu>> BIG_BOX_GUI = REGISTRY.register("big_box_gui", () -> IForgeMenuType.create(BigBoxGuiMenu::new));
}
