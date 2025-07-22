
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mtxgdn.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.mtxgdn.MtxgdnMod;

public class MtxgdnModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, MtxgdnMod.MODID);
	public static final RegistryObject<Potion> WISH = REGISTRY.register("wish",
			() -> new Potion(new MobEffectInstance(MobEffects.DIG_SPEED, 72000, 255, false, false), new MobEffectInstance(MobEffects.DAMAGE_BOOST, 72000, 255, false, false), new MobEffectInstance(MobEffects.REGENERATION, 72000, 255, false, false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 72000, 255, false, false), new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 72000, 255, false, false),
					new MobEffectInstance(MobEffects.WATER_BREATHING, 72000, 255, false, false), new MobEffectInstance(MobEffects.NIGHT_VISION, 72000, 255, false, false), new MobEffectInstance(MobEffects.HEALTH_BOOST, 72000, 255, false, false),
					new MobEffectInstance(MobEffects.ABSORPTION, 72000, 255, false, false), new MobEffectInstance(MobEffects.SATURATION, 72000, 255, false, false), new MobEffectInstance(MobEffects.LUCK, 72000, 255, false, false),
					new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 72000, 255, false, false), new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 72000, 255, false, false)));
}
