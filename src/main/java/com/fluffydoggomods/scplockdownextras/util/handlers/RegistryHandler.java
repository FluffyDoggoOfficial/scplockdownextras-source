package com.fluffydoggomods.scplockdownextras.util.handlers;

import com.fluffydoggomods.scplockdownextras.CommandSCPLE;
import com.fluffydoggomods.scplockdownextras.init.ModBlocks;
import com.fluffydoggomods.scplockdownextras.init.ModItems;
import com.fluffydoggomods.scplockdownextras.util.IHasModel;
import com.fluffydoggomods.scplockdownextras.util.Reference;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;
import scala.Console;

@EventBusSubscriber
public class RegistryHandler {
	
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event)
	{
		event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
	}
	
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event)
	{
		event.getRegistry().registerAll(ModBlocks.BLOCKS.toArray(new Block[0]));
	}
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event)
	{
		for (Item item : ModItems.ITEMS)
		{
			if (item instanceof IHasModel)
			{
				((IHasModel)item).registerModels();
			}
		}
		
		for (Block block : ModBlocks.BLOCKS)
		{
			if (block instanceof IHasModel)
			{
				((IHasModel)block).registerModels();
			}
		}
	}
	/*public static void initRegistries()
	{
		SoundsHandler.registerSounds();
	}*/
	
	@SubscribeEvent
	public static void worldLoad(PlayerLoggedInEvent event) {
		event.player.sendMessage(new TextComponentString(TextFormatting.BOLD + "Welcome to SCP Lockdown Extras " + Reference.VERSION));
		event.player.sendMessage(new TextComponentString("- Mod made by Fluffy Doggo"));
	}
	
	public static void serverRegistries(FMLServerStartingEvent event) {
		event.registerServerCommand(new CommandSCPLE());
	}
}
