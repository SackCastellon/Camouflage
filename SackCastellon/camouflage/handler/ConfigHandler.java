package SackCastellon.camouflage.handler;

import java.io.File;

import net.minecraftforge.common.Configuration;
import SackCastellon.camouflage.helper.LogHelper;
import SackCastellon.camouflage.reference.Reference;

public class ConfigHandler {

	public static Configuration config;

	// Blocks
	public static int CamouflageBlockID;
	
//	public static int OakCamouflageBlockID;
//	public static int SpruceCamouflageBlockID;
//	public static int BirchCamouflageBlockID;
//	public static int JungleCamouflageBlockID;
	
	public static int DirtCamouflageBlockID;
	public static int StoneCamouflageBlockID;
	public static int DesertCamouflageBlockID;
	public static int OceanCamouflageBlockID;
	public static int IceCamouflageBlockID;

	// Items
	public static int CamouflageHelmetID;
	public static int CamouflageChestplateID;
	public static int CamouflageLeggingsID;
	public static int CamouflageBootsID;
	
	public static int DirtCamouflageHelmetID;
	public static int DirtCamouflageChestplateID;
	public static int DirtCamouflageLeggingsID;
	public static int DirtCamouflageBootsID;
	
	public static int StoneCamouflageHelmetID;
	public static int StoneCamouflageChestplateID;
	public static int StoneCamouflageLeggingsID;
	public static int StoneCamouflageBootsID;
	
	public static int DesertCamouflageHelmetID;
	public static int DesertCamouflageChestplateID;
	public static int DesertCamouflageLeggingsID;
	public static int DesertCamouflageBootsID;
	
	public static int OceanCamouflageHelmetID;
	public static int OceanCamouflageChestplateID;
	public static int OceanCamouflageLeggingsID;
	public static int OceanCamouflageBootsID;
	
	public static int IceCamouflageHelmetID;
	public static int IceCamouflageChestplateID;
	public static int IceCamouflageLeggingsID;
	public static int IceCamouflageBootsID;

	public static int CamouflageSwordID;
	public static int CamouflageShovelID;
	public static int CamouflagePickaxeID;
	public static int CamouflageAxeID;
	public static int CamouflageHoeID;

	public static void loadConfig(File file)
	{
		config = new Configuration(file);
		
		try
		{
			config.load();
			
			CamouflageBlockID = config.getBlock("CamouflageBlockID", 1300).getInt();
			
//			OakCamouflageBlockID = config.getBlock("OakCamouflageBlockID", 1300).getInt();
//			SpruceCamouflageBlockID = config.getBlock("SpruceCamouflageBlockID", 1301).getInt();
///			BirchCamouflageBlockID = config.getBlock("BirchCamouflageBlockID", 1302).getInt();
//			JungleCamouflageBlockID = config.getBlock("JungleCamouflageBlockID", 1303).getInt();
			
			DirtCamouflageBlockID = config.getBlock("DirtCamouflageBlockID", 1301).getInt();
			StoneCamouflageBlockID = config.getBlock("StoneCamouflageBlockID", 1302).getInt();
			DesertCamouflageBlockID = config.getBlock("DesertCamouflageBlockID", 1303).getInt();
			OceanCamouflageBlockID = config.getBlock("OceanCamouflageBlockID", 1304).getInt();
			IceCamouflageBlockID = config.getBlock("IceCamouflageBlockID", 1304).getInt();
			
			
			
			CamouflageSwordID = config.getItem("CamouflageSwordID", 10290).getInt() - 256;
			CamouflageShovelID = config.getItem("CamouflageShovelID", 10291).getInt() - 256;
			CamouflagePickaxeID = config.getItem("CamouflagePickaxeID", 10292).getInt() - 256;
			CamouflageAxeID = config.getItem("CamouflageAxeID", 10293).getInt() - 256;
			CamouflageHoeID = config.getItem("CamouflageHoeID", 10294).getInt() - 256;
			
			CamouflageHelmetID = config.getItem("CamouflageHelmetID", 10300).getInt() - 256;
			CamouflageChestplateID = config.getItem("CamouflageChestplateID", 10301).getInt() - 256;
			CamouflageLeggingsID = config.getItem("CamouflageLeggingsID", 10302).getInt() - 256;
			CamouflageBootsID = config.getItem("CamouflageBootID", 10303).getInt() - 256;
			
			DirtCamouflageHelmetID = config.getItem("DirtCamouflageHelmetID", 10304).getInt() - 256;
			DirtCamouflageChestplateID = config.getItem("DirtCamouflageChestplateID", 10305).getInt() - 256;
			DirtCamouflageLeggingsID = config.getItem("DirtCamouflageLeggingsID", 10306).getInt() - 256;
			DirtCamouflageBootsID = config.getItem("DirtCamouflageBootID", 10307).getInt() - 256;
			
			StoneCamouflageHelmetID = config.getItem("StoneCamouflageHelmetID", 10308).getInt() - 256;
			StoneCamouflageChestplateID = config.getItem("StoneCamouflageChestplateID", 10309).getInt() - 256;
			StoneCamouflageLeggingsID = config.getItem("StoneCamouflageLeggingsID", 10310).getInt() - 256;
			StoneCamouflageBootsID = config.getItem("StoneCamouflageBootID", 10311).getInt() - 256;
			
			DesertCamouflageHelmetID = config.getItem("DesertCamouflageHelmetID", 10312).getInt() - 256;
			DesertCamouflageChestplateID = config.getItem("DesertCamouflageChestplateID", 10313).getInt() - 256;
			DesertCamouflageLeggingsID = config.getItem("DesertCamouflageLeggingsID", 10314).getInt() - 256;
			DesertCamouflageBootsID = config.getItem("DesertCamouflageBootID", 10315).getInt() - 256;
			
			OceanCamouflageHelmetID = config.getItem("OceanCamouflageHelmetID", 10316).getInt() - 256;
			OceanCamouflageChestplateID = config.getItem("OceanCamouflageChestplateID", 10317).getInt() - 256;
			OceanCamouflageLeggingsID = config.getItem("OceanCamouflageLeggingsID", 10318).getInt() - 256;
			OceanCamouflageBootsID = config.getItem("OceanCamouflageBootID", 10319).getInt() - 256;
			
			IceCamouflageHelmetID = config.getItem("IceCamouflageHelmetID", 10320).getInt() - 256;
			IceCamouflageChestplateID = config.getItem("IceCamouflageChestplateID", 10321).getInt() - 256;
			IceCamouflageLeggingsID = config.getItem("IceCamouflageLeggingsID", 10322).getInt() - 256;
			IceCamouflageBootsID = config.getItem("IceCamouflageBootID", 10323).getInt() - 256;
		}
		
		catch (Exception e)
		{
			LogHelper.error(Reference.ID, "Could not load the configuration file.");
		}
		
		finally
		{
			if(config.hasChanged())
			{
				config.save();
			}
			
			LogHelper.error(Reference.ID, "Configuration file succesfully loaded.");
		}
	}

}
