
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mtxgdn.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.mtxgdn.block.RedOreBlock;
import net.mcreator.mtxgdn.block.RedBlockBlock;
import net.mcreator.mtxgdn.block.GreenOreBlock;
import net.mcreator.mtxgdn.block.GreenBlockBlock;
import net.mcreator.mtxgdn.MtxgdnMod;

public class MtxgdnModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MtxgdnMod.MODID);
	public static final RegistryObject<Block> GREEN_BLOCK = REGISTRY.register("green_block", () -> new GreenBlockBlock());
	public static final RegistryObject<Block> GREEN_ORE = REGISTRY.register("green_ore", () -> new GreenOreBlock());
	public static final RegistryObject<Block> RED_ORE = REGISTRY.register("red_ore", () -> new RedOreBlock());
	public static final RegistryObject<Block> RED_BLOCK = REGISTRY.register("red_block", () -> new RedBlockBlock());
}
