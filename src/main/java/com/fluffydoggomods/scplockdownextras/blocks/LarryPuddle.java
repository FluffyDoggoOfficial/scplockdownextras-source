package com.fluffydoggomods.scplockdownextras.blocks;

import com.fluffydoggomods.scplockdownextras.Main;
import com.fluffydoggomods.scplockdownextras.init.ModBlocks;
import com.fluffydoggomods.scplockdownextras.init.ModItems;
import com.fluffydoggomods.scplockdownextras.sounds.SoundList;
import com.fluffydoggomods.scplockdownextras.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class LarryPuddle extends Block implements IHasModel {
	public LarryPuddle(String name, Material material)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setHardness(3F);
		setCreativeTab(Main.scpletab);
		setSoundType(SoundList.PUDDLE_106);
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}
