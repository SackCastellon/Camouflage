package SackCastellon.camouflage.loader;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import SackCastellon.camouflage.blocks.BlockCamouflage;
import SackCastellon.camouflage.handler.ConfigHandler;

public class BlockLoader
{
	public static Block CamouflageBlock;
	
//	public static Block OakCamouflageBlock;
//	public static Block SpruceCamouflageBlock;
//	public static Block BirchCamouflageBlock;
//	public static Block JungleCamouflageBlock;
	
	public static Block DirtCamouflageBlock;
	public static Block StoneCamouflageBlock;
	public static Block DesertCamouflageBlock;
	public static Block OceanCamouflageBlock;
	public static Block IceCamouflageBlock;

	public static void init()
	{
		CamouflageBlock = new BlockCamouflage(ConfigHandler.CamouflageBlockID, Block.leaves);
		
//		OakCamouflageBlock = new BlockCamouflage(ConfigHandler.OakCamouflageBlockID, Block.leaves, "Oak");
//		SpruceCamouflageBlock = new BlockCamouflage(ConfigHandler.SpruceCamouflageBlockID, Block.leaves, "Spruce");
//		BirchCamouflageBlock = new BlockCamouflage(ConfigHandler.BirchCamouflageBlockID, Block.leaves, "Birch");
//		JungleCamouflageBlock = new BlockCamouflage(ConfigHandler.JungleCamouflageBlockID, Block.leaves, "Jungle");
		
		DirtCamouflageBlock = new BlockCamouflage(ConfigHandler.DirtCamouflageBlockID, Block.dirt);
		StoneCamouflageBlock = new BlockCamouflage(ConfigHandler.StoneCamouflageBlockID, Block.stone);
		DesertCamouflageBlock = new BlockCamouflage(ConfigHandler.DesertCamouflageBlockID, Block.sand);
		OceanCamouflageBlock = new BlockCamouflage(ConfigHandler.OceanCamouflageBlockID, Block.waterStill);
		IceCamouflageBlock = new BlockCamouflage(ConfigHandler.IceCamouflageBlockID, Block.ice);
	}
}