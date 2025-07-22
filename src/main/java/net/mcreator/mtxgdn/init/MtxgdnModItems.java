
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mtxgdn.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.mtxgdn.item.StongballItem;
import net.mcreator.mtxgdn.item.BigBoxItem;
import net.mcreator.mtxgdn.MtxgdnMod;

public class MtxgdnModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MtxgdnMod.MODID);
	public static final RegistryObject<Item> BIG_BOX = REGISTRY.register("big_box", () -> new BigBoxItem());
	public static final RegistryObject<Item> STONEBALL = REGISTRY.register("stoneball", () -> new StongballItem());
}
