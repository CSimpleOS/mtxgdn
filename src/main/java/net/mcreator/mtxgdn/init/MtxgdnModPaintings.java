
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mtxgdn.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.entity.decoration.PaintingVariant;

import net.mcreator.mtxgdn.MtxgdnMod;

public class MtxgdnModPaintings {
	public static final DeferredRegister<PaintingVariant> REGISTRY = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, MtxgdnMod.MODID);
	public static final RegistryObject<PaintingVariant> FU = REGISTRY.register("fu", () -> new PaintingVariant(64, 64));
}
