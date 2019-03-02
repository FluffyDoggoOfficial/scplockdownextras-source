package com.fluffydoggomods.scplockdownextras.tabs;

import com.fluffydoggomods.scplockdownextras.init.ModBlocks;
import com.fluffydoggomods.scplockdownextras.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ScpLeTab extends CreativeTabs
{
	public ScpLeTab(String label)
	{
		super("scpletab");
	}
	
	public ItemStack getTabIconItem()
	{
		return new ItemStack(ModBlocks.METAL_PANEL_2);
	}
}
