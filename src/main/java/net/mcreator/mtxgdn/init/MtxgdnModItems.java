
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mtxgdn.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.mtxgdn.item.WhiteSwordItem;
import net.mcreator.mtxgdn.item.WhiteShovelItem;
import net.mcreator.mtxgdn.item.WhitePickaxeItem;
import net.mcreator.mtxgdn.item.WhiteItem;
import net.mcreator.mtxgdn.item.WhiteHoeItem;
import net.mcreator.mtxgdn.item.WhiteAxeItem;
import net.mcreator.mtxgdn.item.WhiteArmorItem;
import net.mcreator.mtxgdn.item.TwentyrItem;
import net.mcreator.mtxgdn.item.ToTntLockItem;
import net.mcreator.mtxgdn.item.TenrItem;
import net.mcreator.mtxgdn.item.StongballItem;
import net.mcreator.mtxgdn.item.RedSwordItem;
import net.mcreator.mtxgdn.item.RedShovelItem;
import net.mcreator.mtxgdn.item.RedPickaxeItem;
import net.mcreator.mtxgdn.item.RedItem;
import net.mcreator.mtxgdn.item.RedHoeItem;
import net.mcreator.mtxgdn.item.RedAxeItem;
import net.mcreator.mtxgdn.item.RedArmorItem;
import net.mcreator.mtxgdn.item.OnerItem;
import net.mcreator.mtxgdn.item.OnehundredrItem;
import net.mcreator.mtxgdn.item.GreenSwordItem;
import net.mcreator.mtxgdn.item.GreenShovelItem;
import net.mcreator.mtxgdn.item.GreenPickaxeItem;
import net.mcreator.mtxgdn.item.GreenItem;
import net.mcreator.mtxgdn.item.GreenHoeItem;
import net.mcreator.mtxgdn.item.GreenAxeItem;
import net.mcreator.mtxgdn.item.GreenArmorItem;
import net.mcreator.mtxgdn.item.FiverItem;
import net.mcreator.mtxgdn.item.FiftyrItem;
import net.mcreator.mtxgdn.item.DimensionTNTItem;
import net.mcreator.mtxgdn.item.DimensionDirtItem;
import net.mcreator.mtxgdn.item.DimensionCobblestoneItem;
import net.mcreator.mtxgdn.item.BigBoxItem;
import net.mcreator.mtxgdn.item.BedrockSwordItem;
import net.mcreator.mtxgdn.item.BedrockShovelItem;
import net.mcreator.mtxgdn.item.BedrockPickaxeItem;
import net.mcreator.mtxgdn.item.BedrockHoeItem;
import net.mcreator.mtxgdn.item.BedrockAxeItem;
import net.mcreator.mtxgdn.item.BedrockArmorItem;
import net.mcreator.mtxgdn.item.BarrippleItem;
import net.mcreator.mtxgdn.MtxgdnMod;

public class MtxgdnModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MtxgdnMod.MODID);
	public static final RegistryObject<Item> STONEBALL = REGISTRY.register("stoneball", () -> new StongballItem());
	public static final RegistryObject<Item> BEDROCK_ARMOR_HELMET = REGISTRY.register("bedrock_armor_helmet", () -> new BedrockArmorItem.Helmet());
	public static final RegistryObject<Item> BEDROCK_ARMOR_CHESTPLATE = REGISTRY.register("bedrock_armor_chestplate", () -> new BedrockArmorItem.Chestplate());
	public static final RegistryObject<Item> BEDROCK_ARMOR_LEGGINGS = REGISTRY.register("bedrock_armor_leggings", () -> new BedrockArmorItem.Leggings());
	public static final RegistryObject<Item> BEDROCK_ARMOR_BOOTS = REGISTRY.register("bedrock_armor_boots", () -> new BedrockArmorItem.Boots());
	public static final RegistryObject<Item> BEDROCK_AXE = REGISTRY.register("bedrock_axe", () -> new BedrockAxeItem());
	public static final RegistryObject<Item> BEDROCK_PICKAXE = REGISTRY.register("bedrock_pickaxe", () -> new BedrockPickaxeItem());
	public static final RegistryObject<Item> BEDROCK_SWORD = REGISTRY.register("bedrock_sword", () -> new BedrockSwordItem());
	public static final RegistryObject<Item> BEDROCK_SHOVEL = REGISTRY.register("bedrock_shovel", () -> new BedrockShovelItem());
	public static final RegistryObject<Item> BEDROCK_HOE = REGISTRY.register("bedrock_hoe", () -> new BedrockHoeItem());
	public static final RegistryObject<Item> BIG_BOX = REGISTRY.register("big_box", () -> new BigBoxItem());
	public static final RegistryObject<Item> ONER = REGISTRY.register("oner", () -> new OnerItem());
	public static final RegistryObject<Item> FIVER = REGISTRY.register("fiver", () -> new FiverItem());
	public static final RegistryObject<Item> TENR = REGISTRY.register("tenr", () -> new TenrItem());
	public static final RegistryObject<Item> TWENTYR = REGISTRY.register("twentyr", () -> new TwentyrItem());
	public static final RegistryObject<Item> FIFTYR = REGISTRY.register("fiftyr", () -> new FiftyrItem());
	public static final RegistryObject<Item> ONEHUNDREDR = REGISTRY.register("onehundredr", () -> new OnehundredrItem());
	public static final RegistryObject<Item> GREEN_ARMOR_HELMET = REGISTRY.register("green_armor_helmet", () -> new GreenArmorItem.Helmet());
	public static final RegistryObject<Item> GREEN_ARMOR_CHESTPLATE = REGISTRY.register("green_armor_chestplate", () -> new GreenArmorItem.Chestplate());
	public static final RegistryObject<Item> GREEN_ARMOR_LEGGINGS = REGISTRY.register("green_armor_leggings", () -> new GreenArmorItem.Leggings());
	public static final RegistryObject<Item> GREEN_ARMOR_BOOTS = REGISTRY.register("green_armor_boots", () -> new GreenArmorItem.Boots());
	public static final RegistryObject<Item> RED_ARMOR_HELMET = REGISTRY.register("red_armor_helmet", () -> new RedArmorItem.Helmet());
	public static final RegistryObject<Item> RED_ARMOR_CHESTPLATE = REGISTRY.register("red_armor_chestplate", () -> new RedArmorItem.Chestplate());
	public static final RegistryObject<Item> RED_ARMOR_LEGGINGS = REGISTRY.register("red_armor_leggings", () -> new RedArmorItem.Leggings());
	public static final RegistryObject<Item> RED_ARMOR_BOOTS = REGISTRY.register("red_armor_boots", () -> new RedArmorItem.Boots());
	public static final RegistryObject<Item> GREEN_BLOCK = block(MtxgdnModBlocks.GREEN_BLOCK);
	public static final RegistryObject<Item> GREEN_ORE = block(MtxgdnModBlocks.GREEN_ORE);
	public static final RegistryObject<Item> RED_ORE = block(MtxgdnModBlocks.RED_ORE);
	public static final RegistryObject<Item> RED_BLOCK = block(MtxgdnModBlocks.RED_BLOCK);
	public static final RegistryObject<Item> GREEN = REGISTRY.register("green", () -> new GreenItem());
	public static final RegistryObject<Item> RED = REGISTRY.register("red", () -> new RedItem());
	public static final RegistryObject<Item> GREEN_PICKAXE = REGISTRY.register("green_pickaxe", () -> new GreenPickaxeItem());
	public static final RegistryObject<Item> GREEN_AXE = REGISTRY.register("green_axe", () -> new GreenAxeItem());
	public static final RegistryObject<Item> GREEN_SWORD = REGISTRY.register("green_sword", () -> new GreenSwordItem());
	public static final RegistryObject<Item> GREEN_SHOVEL = REGISTRY.register("green_shovel", () -> new GreenShovelItem());
	public static final RegistryObject<Item> GREEN_HOE = REGISTRY.register("green_hoe", () -> new GreenHoeItem());
	public static final RegistryObject<Item> RED_PICKAXE = REGISTRY.register("red_pickaxe", () -> new RedPickaxeItem());
	public static final RegistryObject<Item> RED_AXE = REGISTRY.register("red_axe", () -> new RedAxeItem());
	public static final RegistryObject<Item> RED_SWORD = REGISTRY.register("red_sword", () -> new RedSwordItem());
	public static final RegistryObject<Item> RED_SHOVEL = REGISTRY.register("red_shovel", () -> new RedShovelItem());
	public static final RegistryObject<Item> RED_HOE = REGISTRY.register("red_hoe", () -> new RedHoeItem());
	public static final RegistryObject<Item> WHITE_ARMOR_HELMET = REGISTRY.register("white_armor_helmet", () -> new WhiteArmorItem.Helmet());
	public static final RegistryObject<Item> WHITE_ARMOR_CHESTPLATE = REGISTRY.register("white_armor_chestplate", () -> new WhiteArmorItem.Chestplate());
	public static final RegistryObject<Item> WHITE_ARMOR_LEGGINGS = REGISTRY.register("white_armor_leggings", () -> new WhiteArmorItem.Leggings());
	public static final RegistryObject<Item> WHITE_ARMOR_BOOTS = REGISTRY.register("white_armor_boots", () -> new WhiteArmorItem.Boots());
	public static final RegistryObject<Item> WHITE_WOOD = block(MtxgdnModBlocks.WHITE_WOOD);
	public static final RegistryObject<Item> WHITE_LOG = block(MtxgdnModBlocks.WHITE_LOG);
	public static final RegistryObject<Item> WHITE_PLANKS = block(MtxgdnModBlocks.WHITE_PLANKS);
	public static final RegistryObject<Item> WHITE_LEAVES = block(MtxgdnModBlocks.WHITE_LEAVES);
	public static final RegistryObject<Item> WHITE_STAIRS = block(MtxgdnModBlocks.WHITE_STAIRS);
	public static final RegistryObject<Item> WHITE_SLAB = block(MtxgdnModBlocks.WHITE_SLAB);
	public static final RegistryObject<Item> WHITE_FENCE = block(MtxgdnModBlocks.WHITE_FENCE);
	public static final RegistryObject<Item> WHITE_FENCE_GATE = block(MtxgdnModBlocks.WHITE_FENCE_GATE);
	public static final RegistryObject<Item> WHITE_PRESSURE_PLATE = block(MtxgdnModBlocks.WHITE_PRESSURE_PLATE);
	public static final RegistryObject<Item> WHITE_BUTTON = block(MtxgdnModBlocks.WHITE_BUTTON);
	public static final RegistryObject<Item> WHITE_ORE = block(MtxgdnModBlocks.WHITE_ORE);
	public static final RegistryObject<Item> WHITE_BLOCK = block(MtxgdnModBlocks.WHITE_BLOCK);
	public static final RegistryObject<Item> WHITE = REGISTRY.register("white", () -> new WhiteItem());
	public static final RegistryObject<Item> WHITE_PICKAXE = REGISTRY.register("white_pickaxe", () -> new WhitePickaxeItem());
	public static final RegistryObject<Item> WHITE_AXE = REGISTRY.register("white_axe", () -> new WhiteAxeItem());
	public static final RegistryObject<Item> WHITE_SWORD = REGISTRY.register("white_sword", () -> new WhiteSwordItem());
	public static final RegistryObject<Item> WHITE_SHOVEL = REGISTRY.register("white_shovel", () -> new WhiteShovelItem());
	public static final RegistryObject<Item> WHITE_HOE = REGISTRY.register("white_hoe", () -> new WhiteHoeItem());
	public static final RegistryObject<Item> DIMENSION_DIRT = REGISTRY.register("dimension_dirt", () -> new DimensionDirtItem());
	public static final RegistryObject<Item> DIMENSION_COBBLESTONE = REGISTRY.register("dimension_cobblestone", () -> new DimensionCobblestoneItem());
	public static final RegistryObject<Item> DIMENSION_TNT = REGISTRY.register("dimension_tnt", () -> new DimensionTNTItem());
	public static final RegistryObject<Item> TO_TNT_LOCK = REGISTRY.register("to_tnt_lock", () -> new ToTntLockItem());
	public static final RegistryObject<Item> BARRIPPLE = REGISTRY.register("barripple", () -> new BarrippleItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
