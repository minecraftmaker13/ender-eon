
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.endereon.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.endereon.block.LumineBlockBlock;
import net.mcreator.endereon.EnderEonMod;

public class EnderEonModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, EnderEonMod.MODID);
	public static final RegistryObject<Block> LUMINE_BLOCK = REGISTRY.register("lumine_block", () -> new LumineBlockBlock());
}
