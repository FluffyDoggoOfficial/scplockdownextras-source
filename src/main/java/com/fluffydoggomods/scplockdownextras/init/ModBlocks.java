package com.fluffydoggomods.scplockdownextras.init;

import java.util.ArrayList;
import java.util.List;

import com.fluffydoggomods.scplockdownextras.blocks.BlockBase;
import com.fluffydoggomods.scplockdownextras.blocks.BloodBlock;
import com.fluffydoggomods.scplockdownextras.blocks.ConcreteBlock;
import com.fluffydoggomods.scplockdownextras.blocks.LarryPuddle;
import com.fluffydoggomods.scplockdownextras.blocks.MetalBlock;
import com.fluffydoggomods.scplockdownextras.items.ItemBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//Blocks
	
	public static final Block METAL_FLOOR_A = new MetalBlock("metal_floor_a", Material.IRON);
	public static final Block HARD_METAL_WALL_A = new MetalBlock("hard_metal_wall", Material.IRON);
	public static final Block DARK_CONCRETE = new ConcreteBlock("dark_concrete", Material.IRON);
	public static final Block PUDDLE_106 = new LarryPuddle();
	public static final Block METAL_PANEL_1 = new MetalBlock("mp1", Material.IRON);
	public static final Block METAL_PANEL_2 = new MetalBlock("mp2", Material.IRON);
	public static final Block METAL_PANEL_3 = new MetalBlock("mp3", Material.IRON);
	public static final Block METAL_PANEL_4 = new MetalBlock("mp4", Material.IRON);
	public static final Block METAL_PANEL = new MetalBlock("metal_panel", Material.IRON);
	public static final Block METAL_FLOOR_B = new MetalBlock("metal_floor_b", Material.IRON);
	public static final Block HARD_METAL_WALL_B = new MetalBlock("hard_metal_wall_b", Material.IRON);
	
	//Blood blocks
	public static final Block BLOOD = new BloodBlock("scp173_chamber_blood", Material.CLAY);
	
}
