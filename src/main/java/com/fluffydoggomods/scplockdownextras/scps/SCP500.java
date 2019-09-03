package com.fluffydoggomods.scplockdownextras.scps;

import com.fluffydoggomods.scplockdownextras.Main;
import com.fluffydoggomods.scplockdownextras.scps.SCPItem;
import com.fluffydoggomods.scplockdownextras.init.ModItems;
import com.fluffydoggomods.scplockdownextras.util.IHasModel;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class SCP500 extends SCPItem
{
	public SCP500()
	{
		super("500", null);
		setMaxDamage(5);
		setMaxStackSize(1);
	}

	@Override
    public boolean hasContainerItem(ItemStack itemStack)
    {
		return true;
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemStack)
    {
    	ItemStack returnItem = new ItemStack(itemStack.getItem(), 1, itemStack.getItemDamage() + 1);
    	
    	if (itemStack.getItemDamage() >= 4) return new ItemStack(ModItems.PILL_BOTTLE);
    	else return returnItem;
    	
    	
    }
}
