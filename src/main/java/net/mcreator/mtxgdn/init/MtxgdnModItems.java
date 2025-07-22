
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
import net.mcreator.mtxgdn.item.BedrockSwordItem;
import net.mcreator.mtxgdn.item.BedrockShovelItem;
import net.mcreator.mtxgdn.item.BedrockPickaxeItem;
import net.mcreator.mtxgdn.item.BedrockHoeItem;
import net.mcreator.mtxgdn.item.BedrockAxeItem;
import net.mcreator.mtxgdn.item.BedrockArmorItem;
import net.mcreator.mtxgdn.MtxgdnMod;

public class MtxgdnModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MtxgdnMod.MODID);
	public static final RegistryObject<Item> BIG_BOX = REGISTRY.register("big_box", () -> new BigBoxItem());
	public static final RegistryObject<Item> STONEBALL = REGISTRY.register("stoneball", () -> new StongballItem());
	public static final RegistryObject<Item> BEDROCK_AXE = REGISTRY.register("bedrock_axe", () -> new BedrockAxeItem());
	public static final RegistryObject<Item> BEDROCK_PICKAXE = REGISTRY.register("bedrock_pickaxe", () -> new BedrockPickaxeItem());
	public static final RegistryObject<Item> BEDROCK_SWORD = REGISTRY.register("bedrock_sword", () -> new BedrockSwordItem());
	public static final RegistryObject<Item> BEDROCK_SHOVEL = REGISTRY.register("bedrock_shovel", () -> new BedrockShovelItem());
	public static final RegistryObject<Item> BEDROCK_HOE = REGISTRY.register("bedrock_hoe", () -> new BedrockHoeItem());
	public static final RegistryObject<Item> BEDROCK_ARMOR_HELMET = REGISTRY.register("bedrock_armor_helmet", () -> new BedrockArmorItem.Helmet());
	public static final RegistryObject<Item> BEDROCK_ARMOR_CHESTPLATE = REGISTRY.register("bedrock_armor_chestplate", () -> new BedrockArmorItem.Chestplate());
	public static final RegistryObject<Item> BEDROCK_ARMOR_LEGGINGS = REGISTRY.register("bedrock_armor_leggings", () -> new BedrockArmorItem.Leggings());
	public static final RegistryObject<Item> BEDROCK_ARMOR_BOOTS = REGISTRY.register("bedrock_armor_boots", () -> new BedrockArmorItem.Boots());
}
