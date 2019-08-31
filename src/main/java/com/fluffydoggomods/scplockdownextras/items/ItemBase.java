package com.fluffydoggomods.scplockdownextras.items;

import com.fluffydoggomods.scplockdownextras.Main;
import com.fluffydoggomods.scplockdownextras.init.ModItems;
import com.fluffydoggomods.scplockdownextras.tabs.ScpLeTab;
import com.fluffydoggomods.scplockdownextras.util.IHasModel;


import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {
	public ItemBase(String name, CreativeTabs tab) {
		setUnlocalizedName(name);
		setRegistryName(name);
		if (tab == null) {
			setCreativeTab(Main.scpletab);
		} else {
			setCreativeTab(tab);
		}
		
		ModItems.ITEMS.add(this);
	}
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
