package com.abkaspo.abkaspospvzmod;

import com.abkaspo.abkaspospvzmod.init.BlockInit;
import com.abkaspo.abkaspospvzmod.init.ItemInit;
import com.abkaspo.abkaspospvzmod.proxy.CommonProxy;
import com.abkaspo.abkaspospvzmod.util.Reference;
import com.abkaspo.abkaspospvzmod.util.handlers.RegistryHandler;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

@Mod(modid = Reference.MOD_ID, version = Reference.VERSION, name = Reference.NAME)
public class PvzmodMain {

	@Instance
	public static PvzmodMain instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
	
	@EventHandler
	public void serverInit(FMLServerStartingEvent event)
	{
		RegistryHandler.serverRegistries(event);
	}	
	
	public static final CreativeTabs ABKASPOSPVZBLOCKS = (new CreativeTabs("abkaspospvzblocks") {

		@Override
		public ItemStack getTabIconItem() {
		return new ItemStack(BlockInit.ASPHALT);
		
		
		}});
	
	public static final CreativeTabs ABKASPOSPVZITEMS = (new CreativeTabs("abkaspospvzitems") {

		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(ItemInit.SEED_PACK);
		}
		
	});
	public static final CreativeTabs ABKASPOFOODSEED=(new CreativeTabs("abkaspofoodseed"){
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(ItemInit.PEA);
		}
	});
}

