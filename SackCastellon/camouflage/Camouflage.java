package SackCastellon.camouflage;

import java.io.File;

import SackCastellon.camouflage.handler.ConfigHandler;
import SackCastellon.camouflage.proxy.CommonProxy;
import SackCastellon.camouflage.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=Reference.ID, name=Reference.NAME, version=Reference.VERSION, dependencies=Reference.DEPENDENCIES)
public class Camouflage {
	
		@Instance(Reference.ID)
		public static Camouflage instance;

		@SidedProxy(clientSide=Reference.CLPROXY, serverSide=Reference.CMPROXY)
		public static CommonProxy proxy;
		
		@EventHandler
		public void preInit(FMLPreInitializationEvent event)
		{
			ConfigHandler.loadConfig(new File(event.getModConfigurationDirectory(), Reference.ConfigPath));
			
			Load.preInit();	
		}
		
		@EventHandler
		public void init(FMLInitializationEvent event)
		{
			Load.init();
		}
		
		@EventHandler
		public void postInit(FMLPostInitializationEvent event)  {}

}