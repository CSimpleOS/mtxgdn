
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mtxgdn.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.mtxgdn.block.WhiteWoodBlock;
import net.mcreator.mtxgdn.block.WhiteStairsBlock;
import net.mcreator.mtxgdn.block.WhiteSlabBlock;
import net.mcreator.mtxgdn.block.WhitePressurePlateBlock;
import net.mcreator.mtxgdn.block.WhitePlanksBlock;
import net.mcreator.mtxgdn.block.WhiteOreBlock;
import net.mcreator.mtxgdn.block.WhiteLogBlock;
import net.mcreator.mtxgdn.block.WhiteLeavesBlock;
import net.mcreator.mtxgdn.block.WhiteFenceGateBlock;
import net.mcreator.mtxgdn.block.WhiteFenceBlock;
import net.mcreator.mtxgdn.block.WhiteButtonBlock;
import net.mcreator.mtxgdn.block.WhiteBlockBlock;
import net.mcreator.mtxgdn.block.RedOreBlock;
import net.mcreator.mtxgdn.block.RedBlockBlock;
import net.mcreator.mtxgdn.block.GreenOreBlock;
import net.mcreator.mtxgdn.block.GreenBlockBlock;
import net.mcreator.mtxgdn.block.DimensionDirtPortalBlock;
import net.mcreator.mtxgdn.MtxgdnMod;

public class MtxgdnModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MtxgdnMod.MODID);
	public static final RegistryObject<Block> GREEN_BLOCK = REGISTRY.register("green_block", () -> new GreenBlockBlock());
	public static final RegistryObject<Block> GREEN_ORE = REGISTRY.register("green_ore", () -> new GreenOreBlock());
	public static final RegistryObject<Block> RED_ORE = REGISTRY.register("red_ore", () -> new RedOreBlock());
	public static final RegistryObject<Block> RED_BLOCK = REGISTRY.register("red_block", () -> new RedBlockBlock());
	public static final RegistryObject<Block> WHITE_WOOD = REGISTRY.register("white_wood", () -> new WhiteWoodBlock());
	public static final RegistryObject<Block> WHITE_LOG = REGISTRY.register("white_log", () -> new WhiteLogBlock());
	public static final RegistryObject<Block> WHITE_PLANKS = REGISTRY.register("white_planks", () -> new WhitePlanksBlock());
	public static final RegistryObject<Block> WHITE_LEAVES = REGISTRY.register("white_leaves", () -> new WhiteLeavesBlock());
	public static final RegistryObject<Block> WHITE_STAIRS = REGISTRY.register("white_stairs", () -> new WhiteStairsBlock());
	public static final RegistryObject<Block> WHITE_SLAB = REGISTRY.register("white_slab", () -> new WhiteSlabBlock());
	public static final RegistryObject<Block> WHITE_FENCE = REGISTRY.register("white_fence", () -> new WhiteFenceBlock());
	public static final RegistryObject<Block> WHITE_FENCE_GATE = REGISTRY.register("white_fence_gate", () -> new WhiteFenceGateBlock());
	public static final RegistryObject<Block> WHITE_PRESSURE_PLATE = REGISTRY.register("white_pressure_plate", () -> new WhitePressurePlateBlock());
	public static final RegistryObject<Block> WHITE_BUTTON = REGISTRY.register("white_button", () -> new WhiteButtonBlock());
	public static final RegistryObject<Block> WHITE_ORE = REGISTRY.register("white_ore", () -> new WhiteOreBlock());
	public static final RegistryObject<Block> WHITE_BLOCK = REGISTRY.register("white_block", () -> new WhiteBlockBlock());
	public static final RegistryObject<Block> DIMENSION_DIRT_PORTAL = REGISTRY.register("dimension_dirt_portal", () -> new DimensionDirtPortalBlock());
}
