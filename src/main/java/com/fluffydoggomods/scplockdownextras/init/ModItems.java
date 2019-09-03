package com.fluffydoggomods.scplockdownextras.init;

import java.util.ArrayList;
import java.util.List;

import com.fluffydoggomods.scplockdownextras.Main;
import com.fluffydoggomods.scplockdownextras.items.GlueBottle;
import com.fluffydoggomods.scplockdownextras.items.ItemBase;
import com.fluffydoggomods.scplockdownextras.items.ItemBaseNoTab;
import com.fluffydoggomods.scplockdownextras.items.Pill;
import com.fluffydoggomods.scplockdownextras.scps.SCP500;

import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import scala.Int;

public class ModItems 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	// Items
	public static final Item GLUE = new GlueBottle();
	public static final Item PILL = new Pill(false);
	public static final Item UPGRADED_PILL = new Pill(true);
	public static final Item PILL_BOTTLE = new ItemBase("pill_bottle", Main.itemstab);
	
	// Documents
	public static final Item DOCUMENT = new ItemBaseNoTab("document");
	
	// SCPS
	public static final Item SCP500 = new SCP500();
}
