package com.fluffydoggomods.scplockdownextras;

import com.fluffydoggomods.scplockdownextras.init.ModRecipes;
import com.fluffydoggomods.scplockdownextras.proxy.CommonProxy;
import com.fluffydoggomods.scplockdownextras.tabs.ScpLeTab;
import com.fluffydoggomods.scplockdownextras.tabs.ScpLeTabDocuments;
import com.fluffydoggomods.scplockdownextras.util.Reference;
import com.fluffydoggomods.scplockdownextras.util.handlers.RegistryHandler;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartedEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main {
	
	public static final CreativeTabs scpletab = new ScpLeTab("scpletab");
	public static final CreativeTabs documenttab = new ScpLeTabDocuments("scpletabdocs");
	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event)
	{
		
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
		//RegistryHandler.initRegistries();
		ModRecipes.init();
	}
	
	public static void Postinit(FMLPostInitializationEvent event)
	{
		
	}
	
	@EventHandler
	public static void worldLoad(PlayerLoggedInEvent event) 
	{
		RegistryHandler.worldLoad(event);
	}
	
	@EventHandler
	public static void serverInit(FMLServerStartingEvent event) 
	{
		RegistryHandler.serverRegistries(event);
	}

}
