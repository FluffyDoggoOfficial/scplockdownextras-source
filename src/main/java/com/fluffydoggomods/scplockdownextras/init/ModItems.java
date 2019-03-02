package com.fluffydoggomods.scplockdownextras.init;

import java.util.ArrayList;
import java.util.List;

import com.fluffydoggomods.scplockdownextras.items.ItemBase;
import com.fluffydoggomods.scplockdownextras.items.ItemBaseNoTab;

import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import scala.Int;

public class ModItems {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	
	//items
	public static final Item GLUE = new ItemBase("glue", null);
	
	//documents
	public static final Item DOCUMENT = new ItemBaseNoTab("document");
	
}
