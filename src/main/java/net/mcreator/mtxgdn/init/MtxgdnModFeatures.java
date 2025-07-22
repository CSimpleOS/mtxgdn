
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mtxgdn.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.mtxgdn.world.features.ores.WhiteOreFeature;
import net.mcreator.mtxgdn.world.features.ores.RedOreFeature;
import net.mcreator.mtxgdn.world.features.ores.GreenOreFeature;
import net.mcreator.mtxgdn.MtxgdnMod;

@Mod.EventBusSubscriber
public class MtxgdnModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, MtxgdnMod.MODID);
	public static final RegistryObject<Feature<?>> GREEN_ORE = REGISTRY.register("green_ore", GreenOreFeature::new);
	public static final RegistryObject<Feature<?>> RED_ORE = REGISTRY.register("red_ore", RedOreFeature::new);
	public static final RegistryObject<Feature<?>> WHITE_ORE = REGISTRY.register("white_ore", WhiteOreFeature::new);
}
